//package uvs;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class ImagePanel extends JPanel {
//    private Image image;
//
//    public ImagePanel() {
//        image = new ImageIcon(getClass().getResource("/myimageapp/resources/images/logo.png")).getImage();
//        setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
//    }
//
//    @Override
//protected void paintComponent(Graphics g) {
//    super.paintComponent(g);
//    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
//}
//}