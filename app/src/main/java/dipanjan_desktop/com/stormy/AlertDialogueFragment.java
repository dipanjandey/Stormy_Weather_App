package dipanjan_desktop.com.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

/**
 * Created by Dipanjan_Desktop on 11/1/2016.
 */

public class AlertDialogueFragment extends DialogFragment{


    private String mErrorTitle = "Oops! Sorry!";
    private String mErrorMessage = "There was an error, Please try again.";
    private String mPositiveButtonText = "Ok";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();

            AlertDialog.Builder builder = new AlertDialog.Builder(context)
                    .setTitle(mErrorTitle)
                    .setMessage(mErrorMessage)
                    .setPositiveButton(mPositiveButtonText, null);
            AlertDialog dialog = builder.create();
            return dialog;

    }

    public void setAlertParams (String errorTitle, String errorMessage, String positiveButtonText){
        mErrorTitle = errorTitle;
        mErrorMessage = errorMessage;
        mPositiveButtonText=positiveButtonText;
    }


}
