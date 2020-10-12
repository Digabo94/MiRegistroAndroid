package animaciones;

import android.widget.ImageButton;
import android.widget.RadioButton;
import com.example.miregistro.R;

public class AnimacionBotones {




    public AnimacionBotones() {
    }

    public void animacionRadioButton(RadioButton radioButton1, RadioButton radioButton2, RadioButton radioButton3, ImageButton imageButton) {
        if(radioButton1.isChecked()){
            imageButton.setImageResource(R.drawable.modify_button);
        } else if(radioButton2.isChecked()){
            imageButton.setImageResource(R.drawable.search_button);
        } else if(radioButton3.isChecked()){
            imageButton.setImageResource(R.drawable.exit_button);
        }
    }
}
