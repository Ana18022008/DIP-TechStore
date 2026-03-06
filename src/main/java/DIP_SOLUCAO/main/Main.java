package DIP_SOLUCAO.main;

import DIP_SOLUCAO.Interface.Comunicador;
import DIP_SOLUCAO.Service.RecuperadorDeSenha;
import DIP_SOLUCAO.Notificacao.ServicoEmail;
import DIP_SOLUCAO.Notificacao.ServicoSMS;

public class Main {

    public static void main(String[] args) {


        //Usando Email
        Comunicador email = new ServicoEmail();
        RecuperadorDeSenha recuperador = new RecuperadorDeSenha(email);

        recuperador.recuperar("cliente@email.com");

        //Usando SMS


                Comunicador sms = new ServicoSMS();
                RecuperadorDeSenha recuperador2 = new RecuperadorDeSenha(sms);

                recuperador2.recuperar("cliente@email.com");
            }
        }
