import javax.swing.*;

public class CreateConnect {
    public static void main(String[] args) {
        // Создаем основное окно
        JFrame frame = new JFrame("Создание Connect.ini");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // панель
        JPanel mainPanel = new JPanel();
        JComboBox mainComboBox = new JComboBox();
        mainComboBox.addItem(1);
        mainPanel.add(new JButton("Выбрать!"));
        mainPanel.add(mainComboBox);

        frame.add(mainPanel);



        frame.setLocationRelativeTo(null);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    /**
     * Заполнить список БД для выбора
     * @param combo - заполняемый ComboBox
     */
    private void fillComboBox(JComboBox combo){


    }

    private void readSetting(){


    }
}
