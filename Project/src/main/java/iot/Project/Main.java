/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot.Project;

import  iot.Project.bean.ClientBean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 *
 * @author Nayan
 */
public class Main extends javax.swing.JFrame implements MqttCallback{

    /**
     * Creates new form Main
     */
    
    private ClientBean client;
    private MqttClient cli;
    public Main() {
        client=new ClientBean();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        serverHost = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        publicText = new javax.swing.JTextField();
        push = new javax.swing.JButton();
        topic = new javax.swing.JTextField();
        lab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subText = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Connect IOT");

        serverHost.setToolTipText("Server Host");

        user.setToolTipText("User");

        jLabel2.setText("Server Host ");

        jLabel3.setText("User");

        jLabel4.setText("Password");

        jLabel5.setText("Port");

        port.setToolTipText("port");
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        password.setToolTipText("Enter Password");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        publicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicTextActionPerformed(evt);
            }
        });

        push.setText("Send");
        push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushActionPerformed(evt);
            }
        });

        topic.setToolTipText("port");
        topic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicActionPerformed(evt);
            }
        });

        lab.setText("Topic");

        subText.setColumns(20);
        subText.setRows(5);
        jScrollPane1.setViewportView(subText);

        jLabel6.setText("Publish");

        jLabel7.setText("Subcribe Message");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(serverHost)
                        .addComponent(user)
                        .addComponent(port)
                        .addComponent(password)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addComponent(topic))
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(publicText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(push, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serverHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(publicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(push)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lab)
                            .addComponent(topic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(submit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topicActionPerformed

    private void pushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushActionPerformed
        // TODO add your handling code here:

        String topic = client.getTopic();
        String message = publicText.getText();
        try {
            cli.publish(topic, message.getBytes(), 0, false);

        } catch (MqttException e) {

            JOptionPane.showMessageDialog(null,"Macha SomeThing Went Wrong while SENDING Message....!!!!! \n\n"+e.getMessage());
        }

    }//GEN-LAST:event_pushActionPerformed

    private void publicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicTextActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        if(serverHost.getText().isEmpty()||user.getText().isEmpty()||password.getPassword().length==0 || topic.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Hi....!!Could you please Fill all the Details....So i can Validate....!");

        }
        else
        {

            client.setUserName(user.getText());
            client.setPassword(password.getPassword());
            client.setServer(serverHost.getText());
            client.setPort(port.getText());
            client.setTopic(topic.getText());
            if(connectMqtt(client));
            {
                JOptionPane.showMessageDialog(null,"Macha Connected....!!!!! \n");
                try {
                    subs(client.getTopic());
                    cli.subscribe(client.getTopic());
                } catch (MqttException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_submitActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

           private  boolean connectMqtt(ClientBean bean)
    {
         try {
	 String clientId = MqttClient.generateClientId();
     cli =
             new MqttClient("tcp://" + bean.getServer() + ":" + bean.getPort(),
                     clientId);

     MqttConnectOptions options = new MqttConnectOptions();
     options.setUserName(bean.getUserName());
     options.setPassword(bean.getPassword());

     
         IMqttToken token = cli.connectWithResult(options);
         
         
         token.setActionCallback(new IMqttActionListener() {
             public void onSuccess(IMqttToken asyncActionToken) {
               
                    JOptionPane.showMessageDialog(null,"Connected TO Server....!!!!!");
                    
             }

             public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                
                 
                   JOptionPane.showMessageDialog(null,"Ayyo Failed To connect ....!!!!!");
             }
         });
     } catch (MqttException e) {
         
         JOptionPane.showMessageDialog(null,"Macha SomeThing Went Wrong....!!!!! \n\n"+e.getMessage());
         return false;
         
     } 
         return true;
    } 
        
    private void subs(String topic) {
        
       
        try {
            final IMqttToken subToken;
            subToken = cli.subscribeWithResponse(topic);
            subToken.setActionCallback(new IMqttActionListener() {
                public void onSuccess(IMqttToken asyncActionToken) {

            JOptionPane.showMessageDialog(null,"You got Message....!!!!! \n");
                   //subText.setText(asyncActionToken.getResponse().getPayload().toString());
                }

                public void onFailure(IMqttToken asyncActionToken,
                                      Throwable exception) {
        JOptionPane.showMessageDialog(null,"Macha Unable to load Message....!!!!! \n");
                }
            });
        } catch (MqttException e) {
           JOptionPane.showMessageDialog(null,"Macha SomeThing Went Wrong while SENDING Message....!!!!! \n\n"+e.getMessage());
        }
        
        
        
        cli.setCallback(new MqttCallback() {
            public void connectionLost(Throwable cause) {

            }

          
            public void messageArrived(String topic, MqttMessage message) throws Exception {

                //subText.setText();
                subText.append(message+"\n");
               
            }

          
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });
    }
       
           
           
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public String charTostring(char [] c)
    {
        String pass="";
        for (char d : c) 
        {
            pass=pass+d;
        }
        
        return pass;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField port;
    private javax.swing.JTextField publicText;
    private javax.swing.JButton push;
    private javax.swing.JTextField serverHost;
    private javax.swing.JTextArea subText;
    private javax.swing.JButton submit;
    private javax.swing.JTextField topic;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

   
    public void connectionLost(Throwable cause) {
         JOptionPane.showMessageDialog(null,"Ayyo Macha Connection Lost....!!!!!");
    }

 
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        
            subText.setText("\n"+message);
        System.out.println(String.format("[%s] %s", topic, new String(message.getPayload())));
            JOptionPane.showMessageDialog(null,"Bro Message Arrived...!!!!!");
    }

    
    public void deliveryComplete(IMqttDeliveryToken token) {
            JOptionPane.showMessageDialog(null,"Delivery Completed....!!!!!");
    }
}
