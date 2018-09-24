package fmu.br.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startQuiz(View view) {
        Intent it = new Intent(this, QuizActivity.class);
        startActivity(it);
        finish(); //Para evitar que o usuário volte para a tela inicial no meio do quiz
    }
}
