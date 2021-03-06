
import eschool.managament.system.Course;
import eschool.managament.system.CourseList;
import eschool.managament.system.Person;
import eschool.managament.system.PersonList;
import java.awt.Dimension;
import java.sql.Date;
import java.sql.PseudoColumnUsage;
import java.util.Calendar;
import sun.font.TrueTypeFont;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eugenio
 */
public class LoginFrame extends javax.swing.JFrame {
    
    PersonList personList = new PersonList();
    CourseList courseList = new CourseList();

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
       
    }
    
    // This method statically filled the LinkedList with some users
    public void fillList(){
        Person a = new Person("Jamie", "Wong","14/07/1986", "34 Darlinghurst Street - Sydney", "043112456", "51234567", "172.16.58.73", 2000, false, false, 0,"root"); // OFFICE WORKER
        Person b = new Person("Ben", "Miyan", "07/12/1985", "95 Wolf Street - Newtown", "040567235", "37654321", "172.16.58.73", 2000, false, true, 850056,"root"); // TEACHER
        Person c = new Person("Nick", "Ross", "03/04/1982", "23 Martin Street - Parramatta", "043695803", "12345678", "172.16.58.73", 2000, true, false, 0,"root"); // Student not enrolled yet
        Person d = new Person("Marta", "Vaia", "14/02/1976", "34 Spring Road - Sydney", "045694344", "50648394", "172.16.58.73", 2000, false, false,0,"root");//office worker
        Person e = new Person("Jorge", "Coke", "13/06/1990", "67 Parramatta Road - Sydney", "040657749", "24652077", "172.16.58.73", 2000, true, false, 806334,"root"); //student
        Person f = new Person("Palam", "Shiza","08/07/1990", "56 York Road - Sydney", "042569043", "34639400", "172.16.58.73", 2000, false, true, 806334,"root");// Teacher
        Person g = new Person("Eugenio admin", "Piccirillo", "08/07/1990","93 liverpool stret Sydney","0403144833","11111111","172.16.58.73",2000,false,false,806334,"root");//Me to try
        Person h = new Person("Eugenio teacher", "Piccirillo", "08/07/1990","93 liverpool stret Sydney","0403144833","22222222","172.16.58.73",2000,false,true,0,"root");//Me to try
        Person i = new Person("Eugenio student", "Piccirillo", "08/07/1990","93 liverpool stret Sydney","0403144833","33333333","172.16.58.73",2000,true,false,0,"root");//Me to try
         
        personList.add(a);
        personList.add(b);
        personList.add(c);
        personList.add(d);
        personList.add(e);
        personList.add(f);
        personList.add(g);
        personList.add(h);
        personList.add(i);
        
         // This method statically filled the LinkedList with some courses
        Course one = new Course("Diploma of Information Technology", 850056, "03/03/2016", "04/03/2017",12000);
        Course two = new Course("Diploma of Software Development", 806334, "03/05/2016", "04/8/2017",17000);
        Course three = new Course("Certificate IV in Information Technology", 875632, "13/9/2016","05/07/2017",13600);
        Course four = new Course("Diploma of Database Managment", 896005, "04/04/2016", "04/12/2016",14000);
        courseList.add(one);
        courseList.add(two);
        courseList.add(three);
        courseList.add(four);
        
        System.out.println ("Lists are filled...");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        fillStaticListButton = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("eSMS - eSchool Management System");

        loginUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");

        jLabel3.setText("Password");

        loginButton.setText("Login");
        loginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Developed by Web Solution Pty Ltd");

        errorLabel.setForeground(new java.awt.Color(255, 51, 51));

        loginPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bright Technical College");

        fillStaticListButton.setText("Fill Static List");
        fillStaticListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillStaticListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(loginPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(loginUser, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(loginButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fillStaticListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fillStaticListButton)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // This method is acive when the user presso to the LogInButton and give back error if
    // the user o the password are wrong
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        errorLabel.setText("");
        int idFound;
        String password="";
        char[]psw= loginPassword.getPassword();
        for(int j=0;j<psw.length;j++)
            password=password+psw[j];
        
        String user =loginUser.getText();
        loginPassword.setText("");
        loginUser.setText("");
        if (password.equals("") || password==null || user.equals("")|| user==null) {
           errorLabel.setText("Error, Id or password are not correct!");
        }else{
            idFound=personList.checkLoginDetail(user, password);
            if(idFound==-5)
                errorLabel.setText("Error, Id or password are not correct");
            else{
                if(personList.getPersonFromIndex(idFound).isStudent()){
                    new StudentMainPage().show();
                    dispose();
                }else{
                    new StaffMainPage().show();
                    dispose();
                }
            }
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void fillStaticListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillStaticListButtonActionPerformed
        fillList();
    }//GEN-LAST:event_fillStaticListButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton fillStaticListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUser;
    // End of variables declaration//GEN-END:variables
}
