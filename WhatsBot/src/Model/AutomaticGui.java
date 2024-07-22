
package Model;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;

public class AutomaticGui {


    public void abrirWhatsApp() {
        try {
            Robot robot = new Robot();

            int[] escrever_whatsapp = {
                    KeyEvent.VK_W,
                    KeyEvent.VK_H,
                    KeyEvent.VK_A,
                    KeyEvent.VK_T,
                    KeyEvent.VK_S,
                    KeyEvent.VK_A,
                    KeyEvent.VK_P,
                    KeyEvent.VK_P,
            };

            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            Thread.sleep(1000);

            for (int key : escrever_whatsapp) {
                robot.keyPress(key);
                robot.keyRelease(key);
                Thread.sleep(50);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void comecar_uma_conversa() {
        try {
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_N);
            robot.mouseMove(380, 280);
            Thread.sleep(500);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//public void posicao_mouse() {
//    try {
//        Robot robot = new Robot();
//        robot.mouseMove(380, 280);
//    } catch (AWTException e) {
//        e.printStackTrace();
//    }
//}
