package src.Core;
import src.CharacterCore.Pokemon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class CoreGame {
    private Player user;
    private Player enemy;
    private JFrame frame;
    private int index=0;
    private CardLayout card = new CardLayout();
    private JPanel paneDefault = new JPanel();
    private boolean sth;

    public CoreGame(){
        sth = false;
        start();
    }
    private void start(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Panpaporn Duangpeth 6010110236");
        frame.setSize(800, 600);
        // main panel
        JPanel main_panel = new JPanel();
        paneDefault.setLayout(card);
        // menu panel
        JPanel menu_bar = new JPanel(new FlowLayout());
        JButton menu_1 = new JButton("Home");
        menu_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(home());
                card.first(paneDefault);
            }
        });
        JButton menu_2 = new JButton("Bag");
        menu_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        JButton menu_3 = new JButton("Exit");
        menu_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // add buttons to menu_bar
        menu_bar.add(menu_1);
        menu_bar.add(menu_2);
        menu_bar.add(menu_3);
        // default content
        //Panel
        paneDefault.add(welcome());
        // display frame
        //frame.getContentPane().add(menu_bar, BorderLayout.NORTH);
        frame.getContentPane().add(paneDefault, BorderLayout.CENTER);
        card.first(paneDefault);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private JPanel welcome(){
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        JPanel topicPane = new JPanel();
        topicPane.setLayout(new FlowLayout());
        topicPane.setBackground(Color.PINK);

        JLabel bg = new JLabel(new ImageIcon("src/images/bg.png"));
        topicPane.add(bg);
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane,BoxLayout.X_AXIS));
        JPanel startButton = new JPanel();
        startButton.setBackground(Color.pink);
        JButton button = new JButton("START GAME");
        button.setBounds(430,440,180,60);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(avatar());
                card.first(paneDefault);
            }
        });
        startButton.add(button);
        buttonPane.add(startButton);
        pane.add(topicPane);
        pane.add(buttonPane);
        return pane;
    }
    private JPanel avatar(){
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        JPanel setTopic = new JPanel();
        setTopic.setBackground(Color.orange);
        setTopic.setLayout(new FlowLayout());
        JLabel logo = new JLabel(new ImageIcon("src/images/logo.png"));
        setTopic.add(logo);
        JPanel inputName = new JPanel();
        inputName.setLayout(new FlowLayout());
        inputName.setBackground(Color.orange);
        JLabel l1 = new JLabel("Enter your Name : ");
        JTextField f1 = new JTextField(20);
        inputName.add(l1);
        inputName.add(f1);
        JPanel character = new JPanel();
        JLabel character1 = new JLabel(new ImageIcon("src/trainer/ch.png"));
        character.add(character1);
        JPanel setTrainer = new JPanel();
        setTrainer.setLayout(new BoxLayout(setTrainer,BoxLayout.X_AXIS));
        JPanel trainerM = new JPanel();
        trainerM.setLayout(new BoxLayout(trainerM,BoxLayout.Y_AXIS));
        JPanel trainerM1 = new JPanel();
        trainerM1.setBackground(Color.orange);
        JLabel trainerM2 = new JLabel(new ImageIcon("src/images/trainer/Male.gif"));
        JPanel button1 = new JPanel();
        button1.setBackground(Color.orange);
        JButton b1 = new JButton("Enter");
        b1.setBounds(430,440,180,60);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user = new Player(f1.getText(),"Male");
                user.initWild();
                paneDefault.removeAll();
                paneDefault.add(home());
                card.first(paneDefault);
            }
        });
        JPanel trainerM4 = new JPanel();
        trainerM4.setBackground(Color.orange);
        JLabel trainerM3 = new JLabel("Male");
        trainerM4.add(trainerM3);
        trainerM1.add(trainerM2);
        button1.add(b1);
        trainerM.add(trainerM4);
        trainerM.add(trainerM1);
        trainerM.add(button1);
        JPanel trainerF = new JPanel();
        trainerF.setLayout(new BoxLayout(trainerF,BoxLayout.Y_AXIS));
        trainerF.setBackground(Color.orange);
        JPanel trainerF1 = new JPanel();
        trainerF1.setBackground(Color.orange);
        JLabel trainerF2 = new JLabel(new ImageIcon("src/images/trainer/Female.gif"));
        JPanel button2 = new JPanel();
        button2.setBackground(Color.orange);
        JButton b2 = new JButton("Enter");
        b2.setBounds(430,440,180,60);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.RED);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user = new Player(f1.getText(),"Female");
                user.initWild();
                paneDefault.removeAll();
                paneDefault.add(home());
                card.first(paneDefault);
            }
        });
        JPanel trainerF4 = new JPanel();
        trainerF4.setBackground(Color.orange);
        JLabel trainerF3 = new JLabel("Female");
        trainerF4.add(trainerF3);
        trainerF1.add(trainerF2);
        button2.add(b2);
        trainerF.add(trainerF4);
        trainerF.add(trainerF1);
        trainerF.add(button2);
        setTrainer.add(trainerM);
        setTrainer.add(trainerF);
        //set window
        pane.add(setTopic);
        pane.add(inputName);
        pane.add(character);
        pane.add(setTrainer);
        return pane;
    }
    private JPanel home(){
        System.out.println("I'm home");
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        JPanel setTopic = new JPanel();
        setTopic.setLayout(new FlowLayout());
        setTopic.setBackground(Color.white);
        JLabel t1 = new JLabel("Trainer name : " + user.getName());
        setTopic.add(t1);
        JPanel setTopic1 = new JPanel();
        setTopic1.setLayout(new FlowLayout());
        setTopic1.setBackground(Color.yellow);
        JLabel t2 = new JLabel("Trainer sex : " + user.getSex());
        setTopic1.add(t2);
        JPanel setTrainer = new JPanel();
        setTrainer.setLayout(new BoxLayout(setTrainer,BoxLayout.X_AXIS));
        JPanel myTrainer = new JPanel();
        myTrainer.setLayout(new BoxLayout(myTrainer,BoxLayout.Y_AXIS));
        JPanel myTrainer1 = new JPanel();
        JLabel myTrainer2 = new JLabel(new ImageIcon(user.getPath()));
        myTrainer1.add(myTrainer2);
        myTrainer.add(myTrainer1);
        JPanel setButton = new JPanel();
        setButton.setLayout(new BoxLayout(setButton,BoxLayout.X_AXIS));
        setButton.setForeground(Color.pink);
        JPanel button3 = new JPanel();
        JButton b3 = new JButton("Pokemon in bag");
        b3.setBounds(430,440,180,60);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.magenta);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        JPanel button4 = new JPanel();
        JButton b4 = new JButton(" Attack with wild Pokemon ");
        b4.setBounds(430,440,180,60);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.YELLOW);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(wild());
                card.first(paneDefault);
            }
        });
        button3.add(b3);
        button4.add(b4);
        setTrainer.add(myTrainer);
        setButton.add(button3);
        setButton.add(button4);
        pane.add(setTopic);
        pane.add(setTopic1);
        pane.add(setTrainer);
        pane.add(setButton);
        return pane;
    }
    private JPanel bag(){
        System.out.println("I'm Bag");
        Pokemon p1 = user.getPokemon(index);
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        JPanel setTopic = new JPanel();
        setTopic.setLayout(new FlowLayout());
        JLabel t1 = new JLabel("My Pokemon ");
        setTopic.add(t1);
        JPanel setTopic1 = new JPanel();
        setTopic1.setLayout(new FlowLayout());
        JLabel t2 = new JLabel("Name Pokemon : " + p1.getName());

        // ปุุ่มการแก้ไขชื่อโปเกม่อน
        JTextField f1 = new JTextField(30);
        JButton btnEdit = new JButton("Edit");
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sth){
                    sth = false;
                    p1.setName(f1.getText());
                    user.setPokemon(index, p1);
                    paneDefault.removeAll();
                    paneDefault.add(bag());
                    card.first(paneDefault);
                }else{
                    sth = true;
                    paneDefault.removeAll();
                    paneDefault.add(bag());
                    card.first(paneDefault);
                }
            }
        });
        setTopic1.add(t2);
        if(sth){
            setTopic1.add(f1);
        }
        setTopic1.add(btnEdit);
        //แสดงสถานะของโปเกม่อน
        JPanel setPoke = new JPanel();
        setPoke.setLayout(new BoxLayout(setPoke,BoxLayout.X_AXIS));
        JPanel myPoke = new JPanel();
        myPoke.setLayout(new BoxLayout(myPoke,BoxLayout.Y_AXIS));
        JPanel myPoke1 = new JPanel();
        JLabel myPoke2 = new JLabel(new ImageIcon(p1.getPath()));

        JPanel p3 = new JPanel();
        //สร้างแถบแสดงค่า HP
        JProgressBar jb1 = new JProgressBar(0, p1.getMax_hp());
        jb1.setValue(p1.getHP());
        p3.add(jb1);
        JLabel t4 = new JLabel("HP : "+p1.getHP()+"/"+p1.getMax_hp());
        p3.add(t4);

        myPoke1.add(myPoke2);
        myPoke.add(myPoke1);
        myPoke.add(p3);
        JPanel setButton = new JPanel();
        setButton.setLayout(new BoxLayout(setButton,BoxLayout.X_AXIS));
        setButton.setForeground(Color.pink);
        JPanel button5 = new JPanel();
        JButton b5 = new JButton(" Back to Home ");
        b5.setForeground(Color.magenta);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(home());
                card.first(paneDefault);
            }
        });
        JPanel button7 = new JPanel();
        button7.setLayout(new BoxLayout(button7,BoxLayout.X_AXIS));
        Image image;
        ImageIcon Staw = new ImageIcon("src/images/food/staw.png");
        JButton btnSt = new JButton(Staw);
        btnSt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.eat(user.getFood(1));
                user.setPokemon(index, p1);
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        ImageIcon Cher = new ImageIcon("src/images/food/cherry.png");
        JButton btnCh = new JButton(Cher);
        btnCh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.eat(user.getFood(2));
                user.setPokemon(index, p1);
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        ImageIcon Grape = new ImageIcon("src/images/food/grape.png");
        JButton btnGr = new JButton(Grape);
        btnGr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.eat(user.getFood(3));
                user.setPokemon(index, p1);
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        JPanel button6 = new JPanel();
        JButton b6 = new JButton(" Next pokemon ");
        b6.setForeground(Color.blue);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(user.getBagSize()-1 > index){
                    index++;
                }else{
                    index = 0;
                }
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        button5.add(b5);
        // 1) add btn feed to button7 panel
        button7.add(btnSt);
        button7.add(btnCh);
        button7.add(btnGr);
        button6.add(b6);
        setPoke.add(myPoke);
        // 1) add btn feed to setButton


        setButton.add(button5);
        setButton.add(button7);
        setButton.add(button6);
        pane.add(setTopic);
        pane.add(setTopic1);
        pane.add(setPoke);
        pane.add(setButton);
        return pane;
    }
    private JPanel wild(){
        System.out.println("I'm Bag");
        Pokemon p1 = user.getPokemon(index);

        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        JPanel setTopic = new JPanel();
        setTopic.setLayout(new FlowLayout());
        JLabel t1 = new JLabel("My Pokemon ");
        setTopic.add(t1);
        JPanel setTopic1 = new JPanel();
        setTopic1.setLayout(new FlowLayout());
        JLabel t2 = new JLabel("Name Pokemon : " + p1.getName());
        setTopic1.add(t2);
        JPanel setPoke = new JPanel();
        setPoke.setLayout(new BoxLayout(setPoke,BoxLayout.X_AXIS));
        JPanel myPoke = new JPanel();
        myPoke.setLayout(new BoxLayout(myPoke,BoxLayout.Y_AXIS));
        JPanel myPoke1 = new JPanel();
        JLabel myPoke2 = new JLabel(new ImageIcon(p1.getPath()));

        JPanel p3 = new JPanel();
        //แถบแสดงค้า HP ของโปเกม่อนเรา
        JProgressBar jb1 = new JProgressBar(0, p1.getMax_hp());
        jb1.setValue(p1.getHP());
        p3.add(jb1);
        JLabel t4 = new JLabel("HP : "+p1.getHP()+"/"+p1.getMax_hp());
        p3.add(t4);

        myPoke1.add(myPoke2);
        myPoke.add(myPoke1);
        myPoke.add(p3);

        Pokemon p2 = user.getWild();
        JPanel myWild = new JPanel();
        myWild.setLayout(new BoxLayout(myWild,BoxLayout.Y_AXIS));
        JPanel myWild1 = new JPanel();
        JLabel myWild2 = new JLabel(new ImageIcon(p2.getPath()));

        JPanel p5 = new JPanel();
        //แถบแสดงค่า HP ของโปเกม่อนในป่า
        JProgressBar jb2 = new JProgressBar(0, p2.getMax_hp());
        jb2.setValue(p2.getHP());
        p5.add(jb2);
        JLabel t5 = new JLabel("HP : "+p2.getHP()+"/"+p2.getMax_hp());
        p5.add(t5);

        myWild1.add(myWild2);
        myWild.add(myWild1);
        myWild.add(p5);

        JPanel setButton = new JPanel();
        setButton.setLayout(new BoxLayout(setButton,BoxLayout.X_AXIS));
        setButton.setForeground(Color.pink);
        JPanel button5 = new JPanel();
        JButton b5 = new JButton(" Back to Home ");
        b5.setBounds(430,440,180,60);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.magenta);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(home());
                card.first(paneDefault);
            }
        });

        JPanel button6 = new JPanel();
        JButton b6 = new JButton(" Attack ");
        b6.setBounds(430,440,180,60);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.blue);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(p1.getHP()>=p1.getMax_hp()/10){
                    p2.damage(p1.getMax_hp()/4);
                    p1.damage(p1.getMax_hp()/10);
                    if(p2.getHP() == 0){
                        showMessageDialog(null,"YOU WIN!!!");
                    }else if(p1.getHP() <= 10){
                        showMessageDialog(null,"YOU WORSE!!!");
                    }
                    boolean u = user.setWild(p2);
                    user.setPokemon(index, p1);
                    if(u){
                        user.addPokemon(p2);
                    }

                }
                paneDefault.removeAll();
                paneDefault.add(wild());
                card.first(paneDefault);

            }
        });
        button5.add(b5);
        button6.add(b6);
        setPoke.add(myPoke);
        setPoke.add(myWild);
        // 1) add btn feed to setButton


        setButton.add(button5);
        setButton.add(button6);
        pane.add(setTopic);
        pane.add(setTopic1);
        pane.add(setPoke);
        pane.add(setButton);
        return pane;
    }
    /*
    private JPanel bags(){
        System.out.println("I'm Bag");
        Pokemon p1 = user.getPokemon(index);
        JPanel pane = new JPanel();
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        JPanel setTopic = new JPanel();
        setTopic.setLayout(new FlowLayout());
        JLabel t1 = new JLabel("My Pokemon ");
        setTopic.add(t1);
        JPanel setTopic1 = new JPanel();
        setTopic1.setLayout(new FlowLayout());
        JLabel t2 = new JLabel("Name Pokemon : " + p1.getName());

        // Do here 1) add edit btn 2) add actionlistener 3) if-else 4) add to setTopic1
        JTextField f1 = new JTextField(30);
        JButton btnEdit = new JButton("Edit");
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sth){
                    sth = false;
                    p1.setName(f1.getText());
                    user.setPokemon(p1, index);
                    paneDefault.removeAll();
                    paneDefault.add(bag());
                    card.first(paneDefault);
                }else{
                    sth = true;
                    paneDefault.removeAll();
                    paneDefault.add(bag());
                    card.first(paneDefault);
                }
            }
        });
        setTopic1.add(t2);
        if(sth){
            setTopic1.add(f1);
        }
        setTopic1.add(btnEdit);
        JPanel setPoke = new JPanel();
        setPoke.setLayout(new BoxLayout(setPoke,BoxLayout.X_AXIS));
        JPanel myPoke = new JPanel();
        myPoke.setLayout(new BoxLayout(myPoke,BoxLayout.Y_AXIS));
        JPanel myPoke1 = new JPanel();
        JLabel myPoke2 = new JLabel(new ImageIcon(p1.getPath()));
        JPanel myPoke4 = new JPanel();
        JLabel myPoke3 = new JLabel("Male XXXXXXXX!");
        JPanel p3 = new JPanel();
        JProgressBar jb1 = new JProgressBar(0, p1.getMax_hp());
        jb1.setValue(p1.getHP());
        p3.add(jb1);
        JLabel t4 = new JLabel("HP : "+p1.getHP()+"/"+p1.getMax_hp());
        p3.add(t4);
        myPoke4.add(myPoke3);
        myPoke1.add(myPoke2);
        myPoke.add(myPoke4);
        myPoke.add(myPoke1);
        myPoke.add(p3);
        JPanel setButton = new JPanel();
        setButton.setLayout(new BoxLayout(setButton,BoxLayout.X_AXIS));
        setButton.setForeground(Color.pink);
        JPanel button5 = new JPanel();
        JButton b5 = new JButton(" Back to Home ");
        b5.setForeground(Color.magenta);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneDefault.removeAll();
                paneDefault.add(home());
                card.first(paneDefault);
            }
        });
        JPanel button7 = new JPanel();
        JButton btnFeed = new JButton("Feed");
        btnFeed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.eat();
                user.setPokemon(p1, index);
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        JPanel button6 = new JPanel();
        JButton b6 = new JButton(" Next pokemon ");
        b6.setForeground(Color.blue);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(user.getBagSize()-1 > index){
                    index++;
                }else{
                    index = 0;
                }
                paneDefault.removeAll();
                paneDefault.add(bag());
                card.first(paneDefault);
            }
        });
        button5.add(b5);
        // 1) add btn feed to button7 panel
        button7.add(btnFeed);
        button6.add(b6);
        setPoke.add(myPoke);
        // 1) add btn feed to setButton


        setButton.add(button5);
        setButton.add(button7);
        setButton.add(button6);
        pane.add(setTopic);
        pane.add(setTopic1);
        pane.add(setPoke);
        pane.add(setButton);
        return pane;
    }

     */

}
