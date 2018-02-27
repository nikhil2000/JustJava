/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.nvangala.justjava;
import java.text.NumberFormat;
import java.lang.*;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static java.lang.Math.abs;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {

        quantity++;
        displayQuantity(quantity);

    }

    /**
     * This method is called when the minus button is clicked.
     */

    public void decrement(View view) {

        quantity--;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);

    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int quantity) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(quantity));
    }


    /**
     * This method is called when the order  button is clicked.
     */
    public void submitOrder(View view){
        int price=calculatePrice(quantity);
       // String priceMessage= Integer.toString(price);
        String priceMessage="you ordered for "+quantity+" and it costs\n "+price +"Rs";
                displayMessage(priceMessage);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public int calculatePrice(){
       return 20;
    }

    public int calculatePrice(int quantity){
        int price= quantity*5;
        return price;
    }
    public int calculatePrice(int quantity,int rate){
        int price=quantity*rate;
        return price;
    }



}