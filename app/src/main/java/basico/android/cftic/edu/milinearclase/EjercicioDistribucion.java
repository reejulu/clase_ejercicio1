package basico.android.cftic.edu.milinearclase;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class EjercicioDistribucion extends AppCompatActivity {

    private int ncolor ;
    private int num_veces;
    private boolean linea1;
    private boolean linea2;
    private boolean linea3;
    private boolean linea4;
    private boolean linea5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_distribucion);
        this.ncolor = getResources().getColor(R.color.amarillo);
        this.num_veces = 0;





    }

    private void salir () {
        this.finish(); // cierra la ventana actual,,pero como es la unica en este caso cierra la app.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            this.finishAffinity(); // cierra la app y da igual la ventana que estemos
        }
    }
    public void cambiarColor(View view){

        LinearLayout cajatocada = (LinearLayout)view;
        findViewById(R.id.line1);
        //int ncolor = getResources().getColor(R.color.amarillo);

            cajatocada.setBackgroundColor(this.ncolor);
            num_veces = num_veces + 1;
            if (num_veces == 6) {
                salir();
            }


    }


}
