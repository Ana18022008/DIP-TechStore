package DIP_SOLUCAO.Notificacao;

import DIP_SOLUCAO.Interface.Comunicador;

public class ServicoEmail implements Comunicador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail SMTP: " + mensagem);
    }
}