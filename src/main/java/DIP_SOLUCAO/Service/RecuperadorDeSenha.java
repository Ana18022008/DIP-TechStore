package DIP_SOLUCAO.Service;

import DIP_SOLUCAO.Interface.Comunicador;

public class RecuperadorDeSenha {

    private Comunicador comunicador;

    // Injeção de Dependência
    public RecuperadorDeSenha(Comunicador comunicador) {
        this.comunicador = comunicador;
    }

    public void recuperar(String email) {
        String link = "http://techstore.com/reset?token=123";
        comunicador.enviar("Clique no link para resetar sua senha: " + link);
    }
}