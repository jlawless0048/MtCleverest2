/**
 *
 * @author Josh Lawless
 */
import java.io.*;
import java.util.*;
public class main extends javax.swing.JFrame {
    public main() throws IOException , InterruptedException {
        initComponents();
    }
    public static void talk() throws IOException , InterruptedException{
        String res;
        String str = jTextField2.getText();
        jTextField2.setText("");
        System.out.println(str);
        str = str.trim();
        str = str.toLowerCase();
        str = " " + str + " ";
        res = response(str);
        if(str.substring(0,7).equals(" wiki@ ")){
            String word = str.substring(6);
            word = word.trim();
            res = pyJavaWiki.wiki(word);
        }
        System.out.println(res);
        if(str.equals(" goodbye ")){
            System.exit(0);
        }
    }
    public static String response(String str) throws IOException{
        ArrayBuild unknown = new ArrayBuild("Texts/unknown.txt");
        
        ArrayBuild[] keys = new ArrayBuild[15];
        keys[13] = new ArrayBuild("Texts/keys/keys_animals.txt");
        keys[4] = new ArrayBuild("Texts/keys/keys_bored.txt");
        keys[5] = new ArrayBuild("Texts/keys/keys_bot.txt");
        keys[2] = new ArrayBuild("Texts/keys/keys_bye.txt");
        keys[6] = new ArrayBuild("Texts/keys/keys_family.txt");
        keys[14] = new ArrayBuild("Texts/keys/keys_filler.txt");
        keys[7] = new ArrayBuild("Texts/keys/keys_foods.txt");
        keys[3] = new ArrayBuild("Texts/keys/keys_hello.txt");
        keys[8] = new ArrayBuild("Texts/keys/keys_holiday.txt");
        keys[9] = new ArrayBuild("Texts/keys/keys_jackfurmanek (2).txt");
        keys[1] = new ArrayBuild("Texts/keys/keys_nonoword.txt");
        keys[10] = new ArrayBuild("Texts/keys/keys_pets.txt");
        keys[0] = new ArrayBuild("Texts/keys/keys_question.txt");
        keys[11] = new ArrayBuild("Texts/keys/keys_school.txt");
        keys[12] = new ArrayBuild("Texts/keys/keys_weather.txt"); 
        for(int i = 0; i < keys.length; i++){
            keys[i].sort();
        }
        ArrayBuild[] responses = new ArrayBuild[15];
        responses[13] = new ArrayBuild("Texts/responses/key_animals_response.txt");
        responses[4] = new ArrayBuild("Texts/responses/key_bored_response.txt");
        responses[5] = new ArrayBuild("Texts/responses/key_bot_response.txt");
        responses[2] = new ArrayBuild("Texts/responses/key_bye_response.txt");
        responses[6] = new ArrayBuild("Texts/responses/key_family_response.txt");
        responses[14] = new ArrayBuild("Texts/responses/key_filler_response.txt");
        responses[7] = new ArrayBuild("Texts/responses/key_food_response.txt");
        responses[3] = new ArrayBuild("Texts/responses/key_hello_response.txt");
        responses[8] = new ArrayBuild("Texts/responses/key_holiday_response.txt");
        responses[9] = new ArrayBuild("Texts/responses/key_jackfurmanek_response.txt");
        responses[1] = new ArrayBuild("Texts/responses/key_nonoword_response.txt");
        responses[10] = new ArrayBuild("Texts/responses/key_pets_response.txt");
        responses[0] = new ArrayBuild("Texts/responses/key_question_response.txt");
        responses[11] = new ArrayBuild("Texts/responses/key_school_response.txt");
        responses[12] = new ArrayBuild("Texts/responses/key_weather_response.txt");
        ArrayBuild random = new ArrayBuild("Texts/responses/random.txt");
        
        for(int i = 0; i < keys.length; i++){
            if(keys[i].search(str) > -1){
                return responses[i].getRandom();
            }
        }
        unknown.setArray(unknown.insert(0, str));
        unknown.update("Texts/unknown.txt");
        return random.getRandom();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() throws IOException , InterruptedException{

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TI-Nspire", 0, 24)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MtCleverest 2.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );
         PrintStream printStream = new PrintStream(new CustomOutputStream(jTextArea1));
            System.setOut(printStream);
            System.setErr(printStream);
        pack();
    }                     

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {  
        try{
            talk();
        }
        catch(InterruptedException  | IOException ex){
            System.out.println("uh oh");
        }
    }                                           

    public static void main(String args[]) throws IOException , InterruptedException {
 
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            try{
            new main().setVisible(true);
        }
        catch(Exception e){
            System.out.print("ucky");
        }
        });         
    }
    
    public class CustomOutputStream extends OutputStream {
        private javax.swing.JTextArea textArea;
     
        public CustomOutputStream(javax.swing.JTextArea textArea) throws IOException , InterruptedException{
            this.textArea = textArea;
        }
     
        @Override
        public void write(int b) {
            textArea.append(String.valueOf((char)b));
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
}
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextField jTextField2;
}
