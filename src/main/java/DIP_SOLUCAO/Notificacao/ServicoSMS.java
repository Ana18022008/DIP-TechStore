package DIP_SOLUCAO.Notificacao;

import DIP_SOLUCAO.Interface.Comunicador;

public class ServicoSMS implements Comunicador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}