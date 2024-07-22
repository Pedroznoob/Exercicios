package Application;

import Model.AutomaticGui;

public class WhatsBotApp {
    public static void main(String[] args) throws InterruptedException {
        AutomaticGui automaticGui = new AutomaticGui();

        automaticGui.abrirWhatsApp();
        Thread.sleep(1000);
        automaticGui.comecar_uma_conversa();
        
    }
}
