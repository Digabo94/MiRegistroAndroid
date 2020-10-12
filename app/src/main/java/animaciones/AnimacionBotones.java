package animaciones;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

import com.example.miregistro.R;

public class AnimacionBotones {


    private ImageButton imageButton;


    public AnimacionBotones() {
    }

    public void botonModificar(RadioButton radioButton) {
        if(radioButton.isChecked()){
            imageButton.setImageResource(R.drawable.checked_modify);
        }
    }

    public void botonBuscar(RadioButton radioButton) {
        if(radioButton.isChecked()){
            imageButton.setImageResource(R.drawable.checked_search);
        }
    }

    public void botonSalir(RadioButton radioButton) {
        if(radioButton.isChecked()){
            imageButton.setImageResource(R.drawable.checked_exit);
        }
    }

}
