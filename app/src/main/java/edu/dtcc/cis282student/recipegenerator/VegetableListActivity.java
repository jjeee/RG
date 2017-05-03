package edu.dtcc.cis282student.recipegenerator;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class VegetableListActivity extends AppCompatActivity implements View.OnClickListener {
    boolean[] bolArray = new boolean[9];
    private List<Button> buttons = new ArrayList<>(BUTTON_IDS.length);
    private static final int[] BUTTON_IDS = {
            R.id.btn_veg_1, R.id.btn_veg_2, R.id.btn_veg_3,
            R.id.btn_veg_4, R.id.btn_veg_5, R.id.btn_veg_6,
            R.id.btn_veg_7, R.id.btn_veg_8, R.id.btn_veg_9,
            R.id.btn_all_back, R.id.btn_all_clear
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        for(int id : BUTTON_IDS) {
            Button button = (Button) findViewById(id);
            button.setOnClickListener(this);
            buttons.add(button);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_veg_1:
                if (CategoryListActivity.ingredientsList[9] == null) {
                    CategoryListActivity.ingredientsList[9] = "garlic";
                    bolArray[0] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[9] = null;
                    bolArray[0] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_2:
                if (CategoryListActivity.ingredientsList[10] == null) {
                    CategoryListActivity.ingredientsList[10] = "lettuce";
                    bolArray[1] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[10] = null;
                    bolArray[1] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_3:
                if (CategoryListActivity.ingredientsList[11] == null) {
                    CategoryListActivity.ingredientsList[11] = "carrot";
                    bolArray[2] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[11] = null;
                    bolArray[2] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_4:
                if (CategoryListActivity.ingredientsList[12] == null) {
                    CategoryListActivity.ingredientsList[12] = "tomato";
                    bolArray[3] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[12] = null;
                    bolArray[3] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_5:
                if (CategoryListActivity.ingredientsList[13] == null) {
                    CategoryListActivity.ingredientsList[13] = "bell pepper";
                    bolArray[4] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[13] = null;
                    bolArray[4] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_6:
                if (CategoryListActivity.ingredientsList[14] == null) {
                    CategoryListActivity.ingredientsList[14] = "corn";
                    bolArray[5] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[14]=null;
                    bolArray[5] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_7:
                if (CategoryListActivity.ingredientsList[15] == null) {
                    CategoryListActivity.ingredientsList[15] = "potato";
                    bolArray[6] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[15] = null;
                    bolArray[6] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_8:
                if (CategoryListActivity.ingredientsList[16] == null) {
                    CategoryListActivity.ingredientsList[16] = "onion";
                    bolArray[7] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[16] = null;
                    bolArray[7] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_veg_9:
                if (CategoryListActivity.ingredientsList[17] == null) {
                    CategoryListActivity.ingredientsList[17] = "kidney beans";
                    bolArray[8] = true;
                    view.setSelected(true);
                } else {
                    CategoryListActivity.ingredientsList[17] = null;
                    bolArray[8] = false;
                    view.setSelected(false);
                } break;

            case R.id.btn_all_back:
                Intent bIntent = new Intent(this, CategoryListActivity.class);
                startActivity(bIntent);
                break;

            case R.id.btn_all_clear:
                for (int i = 9; i < 18; i++){
                    CategoryListActivity.ingredientsList[i] = null;
                }
                for (int i = 0; i < bolArray.length; i++) {
                    bolArray[i] = false;
                }
                for (Button btn : buttons) {
                    btn.setSelected(false);
                }
                Toast.makeText(getApplicationContext(), "Vegetable ingredients deselected",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putBooleanArray("counter_key", bolArray);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        bolArray = savedInstanceState.getBooleanArray("counter_key");
    }
}
