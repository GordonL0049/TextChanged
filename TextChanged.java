package com.gordonlu.textchanged;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

import java.lang.reflect.Field;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.Editable;

@DesignerComponent(
        version = 1,
        description = "A non-visible extension to detect the changed text of a visible component, for example, TextBox or Button.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://docs.google.com/drawings/d/e/2PACX-1vQCI87PHLBF0jb8QWyYmIRQSjjNW3EFXf-qpsWCvBYkUQ9vEgPAB8SpxcMpblxNpbIYrjCjLrRLIU2c/pub?w=16&h=16")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class TextChanged extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public TextChanged(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Starts listening to all changes of the component and fires the OnTextChanged event when changed.")
    public void AddTextChangedListener(final AndroidViewComponent component){
        // https://stackoverflow.com/a/20824665/17802442
        View view = component.getView();
        TextView tv = (TextView) view;
        tv.addTextChangedListener(new TextWatcher() {
            
            public void afterTextChanged(Editable s) {}

               
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

               
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            OnTextChanged(component);
        }
        });
    }

    @SimpleEvent(description = "This event is invoked when the text of a registered component is fired.")
    public void OnTextChanged(AndroidViewComponent component){
        EventDispatcher.dispatchEvent(this, "OnTextChanged", component);
    }
}
