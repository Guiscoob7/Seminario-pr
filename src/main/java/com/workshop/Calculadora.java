package com.workshop;

public class Calculadora {

    private static final double LIMITE_DESCONTO = 100;
    private static final double PERCENTUAL_DESCONTO = 0.9;
    private static final double ALIQUOTA_IMPOSTO = 0.27;

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int soma(int a, int b) {
        return a + b;
    }

    public double calcularDesconto(double preco) {
        if (preco > LIMITE_DESCONTO) {
            return preco * PERCENTUAL_DESCONTO;
        } else {
            return preco;
        }
    }

    public double calcularImposto(double valor) {
        double resultado = valor * ALIQUOTA_IMPOSTO;
        return resultado;
    }

    public int fatorial(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
