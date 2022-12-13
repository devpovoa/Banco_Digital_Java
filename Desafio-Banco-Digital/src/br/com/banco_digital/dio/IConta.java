package br.com.banco_digital.dio;

public interface IConta {
	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);

	void imprimirExtrato();

}
