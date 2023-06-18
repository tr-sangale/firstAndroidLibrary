package com.example.firstlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        System.out.println("This is dev branch")
    }
}


