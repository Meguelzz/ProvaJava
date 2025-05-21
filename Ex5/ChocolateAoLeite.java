/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.chocolates.Model;

/**
 *
 * @author selma
 */
public class ChocolateAoLeite extends Chocolate {
    private String tipoLeite;

    public ChocolateAoLeite(String nome, int porcentagemCacau, double peso, String tipoLeite) {
        super(nome, porcentagemCacau, peso);
        this.tipoLeite = tipoLeite;
    }

    public String getTipoLeite() {
        return tipoLeite;
    }

    public void setTipoLeite(String tipoLeite) {
        this.tipoLeite = tipoLeite;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de leite: " + tipoLeite);
    }

    // Sobrecarga
    public void exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            exibirInformacoes();
            System.out.println("Processo: Mistura suave com leite " + tipoLeite + " e ingredientes selecionados.");
        } else {
            exibirInformacoes();
        }
    }
}
