import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends JFrame implements ActionListener, WindowListener {

    public String today;
    public String tomorrow;
    public String usdToday;
    public String eurToday;
    public String usdTomorrow;
    public String eurTomorrow;

    private TextField FieldDateToday = new TextField();
    private TextField FieldDateTomorrow = new TextField();
    private TextField FieldUsdToday = new TextField();
    private TextField FieldUsdTomorrow = new TextField();
    private TextField FieldEurToday = new TextField();
    private TextField FieldEurTomorrow = new TextField();

    Window() {
        super("Курс валют");
        setLayout(null);
        setVisible(true);
        setSize(324,129);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JLabel Date;
        Date = new JLabel("Дата");
        add(Date);
        Date.setBounds(35,6,50,25);

        JLabel USD;
        USD = new JLabel("USD");
        add(USD);
        USD.setBounds(35,34,25,25);

        JLabel EUR;
        EUR = new JLabel("EUR");
        add(EUR);
        EUR.setBounds(35,62,25,25);

        add(FieldDateToday);
        FieldDateToday.setVisible(true);
        FieldDateToday.setSize(100, 25);
        FieldDateToday.setLocation(100, 7);
        FieldDateToday.setFont(new Font("", Font.PLAIN, 18));
        FieldDateToday.setEditable(false);

        add(FieldDateTomorrow);
        FieldDateTomorrow.setVisible(true);
        FieldDateTomorrow.setSize(100, 25);
        FieldDateTomorrow.setLocation(205, 7);
        FieldDateTomorrow.setFont(new Font("", Font.PLAIN, 18));
        FieldDateTomorrow.setEditable(false);

        add(FieldUsdToday);
        FieldUsdToday.setVisible(true);
        FieldUsdToday.setSize(100, 25);
        FieldUsdToday.setLocation(100, 35);
        FieldUsdToday.setFont(new Font("", Font.PLAIN, 18));
        FieldUsdToday.setEditable(false);

        add(FieldUsdTomorrow);
        FieldUsdTomorrow.setVisible(true);
        FieldUsdTomorrow.setSize(100, 25);
        FieldUsdTomorrow.setLocation(205, 35);
        FieldUsdTomorrow.setFont(new Font("", Font.PLAIN, 18));
        FieldUsdTomorrow.setEditable(false);

        add(FieldEurToday);
        FieldEurToday.setVisible(true);
        FieldEurToday.setSize(100, 25);
        FieldEurToday.setLocation(100, 63);
        FieldEurToday.setFont(new Font("", Font.PLAIN, 18));
        FieldEurToday.setEditable(false);

        add(FieldEurTomorrow);
        FieldEurTomorrow.setVisible(true);
        FieldEurTomorrow.setSize(100, 25);
        FieldEurTomorrow.setLocation(205, 63);
        FieldEurTomorrow.setFont(new Font("", Font.PLAIN, 18));
        FieldEurTomorrow.setEditable(false);
    }

    public void actionPerformedToday(String today) {FieldDateToday.setText(today);}
    public void actionPerformedTomorrow(String tomorrow) {
        FieldDateTomorrow.setText(tomorrow);
    }
    public void actionPerformedUsdToday(String usdToday) {FieldUsdToday.setText("$   "+usdToday);}
    public void actionPerformedEurToday(String eurToday) {
        FieldEurToday.setText("€   "+eurToday);
    }
    public void actionPerformedUsdTomorrow(String usdTomorrow) {FieldUsdTomorrow.setText("$   "+usdTomorrow);}
    public void actionPerformedEurTomorrow(String eurTomorrow) {FieldEurTomorrow.setText("$   "+eurTomorrow);}

    @Override
    public void actionPerformed(ActionEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}

