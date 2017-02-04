package conestogac.movieticket;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView movieTiltel;
    private TextView name;
    private TextView date;
    private TextView time;
    private TextView type;
    private TextView uPrice;
    private TextView nOfTicket;
    private TextView totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieTiltel = (TextView) findViewById(R.id.receiptTitle);

        String nameu ="hello";

        SpannableString content = new SpannableString(nameu);
        content.setSpan(new UnderlineSpan(), 0, nameu.length(), 0);
        movieTiltel.setText(content);
        name= (TextView)findViewById(R.id.receiptName);
        name.setText("Name: Monira");
        date= (TextView)findViewById(R.id.receiptDate);
        date.setText("Date: 2017.01.02");
        time= (TextView)findViewById(R.id.receiptTime);
        time.setText("Show Time: 20.00 PM");
        type =(TextView)findViewById(R.id.receiptType);
        type.setText("Movie Type:");
        uPrice=(TextView)findViewById(R.id.receiptPrice);
        uPrice.setText("Ticket Per Person: $20.00");
        nOfTicket=(TextView) findViewById(R.id.receiptHowMany);
        nOfTicket.setText("How Many Tickets: 4 Tickets");
        totalPrice=(TextView)findViewById(R.id.receiptTotalPrice);
        totalPrice.setText("Total Price: $120");


    }







}
