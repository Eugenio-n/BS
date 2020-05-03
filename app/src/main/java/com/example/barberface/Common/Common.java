package com.example.barberface.Common;

import android.content.Context;
import android.text.TextUtils;

import com.example.barberface.MyToken;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import io.paperdb.Paper;

public class Common {
    public static String IS_LOGIN = "IsLogin";
    public static String LOGGED_KEY = "IsLogin";  //?????????????????????????????????????????????

    public static void updateToken(Context context, final String s) {

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        /*
        if(user != null) {
            MyToken myToken = new MyToken();
            myToken.setToken(s);
            myToken.setTokenType(TOKEN_TYPE.CLIENT);
            myToken.setUserPhone(user.getPhoneNumber());

            FirebaseFirestore.getInstance()
                    .collection("Tokens")
                    .document(user.getPhoneNumber())
                    .set(myToken)
                    .addOnCompleteListener(task -> {

                    });

        }
        else
        {
            Paper.init(context);
            String localUser = Paper.book().read(Common.LOGGED_KEY);
            if(localUser != null)
            {
                if(!TextUtils.isEmpty(localUser))
                {
                    MyToken myToken = new MyToken();
                    myToken.setToken(s);
                    myToken.setTokenType(TOKEN_TYPE.CLIENT);
                    myToken.setUserPhone(localUser.getPhoneNumber());

                    FirebaseFirestore.getInstance()
                            .collection("Tokens")
                            .document(localUser.getPhoneNumber())
                            .set(myToken)
                            .addOnCompleteListener(task -> {


                            });
                }
            }


        }
    }


 */}
}