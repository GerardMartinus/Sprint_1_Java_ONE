import javax.swing.JOptionPane;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		int continua = 0;
		while (continua == 0) {
			Object[] selecao = { "Conversor de moeda", "Conversor de temperatura" };

			Object janela = JOptionPane.showInputDialog(null, "Escolha um", "Conversor", JOptionPane.PLAIN_MESSAGE,
					null, selecao, selecao[0]);

			if (janela != null) {

				if (janela == "Conversor de moeda") {
					System.out.println("Voce escolheu $ " + janela);

					String valor = JOptionPane.showInputDialog(null, "Conversor de moeda", "Digite o valor");
					Double numero = Double.parseDouble(valor);

					Object[] selecaoMoedas = { "De Reais a Doláres", "De Reais a Euros", "De Reais a Libras",
							"De Reais a Ienes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais",
							"De Libras a Reais", };

					Object janelaMoedas = JOptionPane.showInputDialog(null, "Escolha um", "Conversor",
							JOptionPane.PLAIN_MESSAGE, null, selecaoMoedas, selecaoMoedas[0]);

					System.out.println("Voce escolheu " + janelaMoedas);

					if (janelaMoedas != null) {

						if (janelaMoedas == "De Reais a Doláres") {

							numero *= 5.90;

							JOptionPane.showMessageDialog(null, "O valor de Real para Dólar é de " + numero, "Titulo",
									JOptionPane.INFORMATION_MESSAGE);

						} else if (janelaMoedas == "De Reais a Euros") {

							numero *= 5.63;

							JOptionPane.showMessageDialog(null, "O valor Real para Euro é de " + numero, "Titulo",
									JOptionPane.INFORMATION_MESSAGE);

						} else if (janelaMoedas == "De Reais a Libras") {

							numero *= 6.37;

							JOptionPane.showMessageDialog(null, "O valor Real para Libra esterlina é de " + numero,
									"Titulo", JOptionPane.INFORMATION_MESSAGE);

						} else if (janelaMoedas == "De Reais a Ienes") {

							numero *= 25.26;

							JOptionPane.showMessageDialog(null, "O valor Real para Ienes é de " + numero, "Titulo",
									JOptionPane.INFORMATION_MESSAGE);

						} else if (janelaMoedas == "De Reais a Won Coreano") {

							numero *= 239.84;

							JOptionPane.showMessageDialog(null, "O valor Real para Won Coreano é de " + numero,
									"Titulo", JOptionPane.INFORMATION_MESSAGE);

						} else if (janelaMoedas == "De Dólares a Reais") {

							numero *= 0.19;

							JOptionPane.showMessageDialog(null, "O valor Dólares para Reais é de " + numero, "Titulo",
									JOptionPane.INFORMATION_MESSAGE);

						} else if (janelaMoedas == "De Euros a Reais") {

							numero *= 0.18;

							JOptionPane.showMessageDialog(null, "O valor Euros para Reais é de " + numero, "Titulo",
									JOptionPane.INFORMATION_MESSAGE);

						} else if (janelaMoedas == "De Libras a Reais") {

							numero *= 0.16;

							JOptionPane.showMessageDialog(null, "O valor Libras para Reais é de " + numero, "Titulo",
									JOptionPane.INFORMATION_MESSAGE);

						}

					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado", "Conversor",
								JOptionPane.PLAIN_MESSAGE);
					}

				} else {
					System.out.println("Voce escolheu Cº " + janela);

					String valor = JOptionPane.showInputDialog(null, "Conversor de Graus", "Digite o valor");

					Double numero = Double.parseDouble(valor);

					Object[] selecaoTemperatura = { "De Celsius a Fahrenheit", "De Celsius a Kelvin",
							"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius",
							"De Kelvin a Fahrenheit" };

					Object janelaTemperatura = JOptionPane.showInputDialog(null, "Escolha um", "Conversor",
							JOptionPane.PLAIN_MESSAGE, null, selecaoTemperatura, selecaoTemperatura[0]);

					System.out.println("Voce escolheu " + janelaTemperatura);

					if (janelaTemperatura == "De Celsius a Fahrenheit") {

						double c = (numero * 9 / 5);

						double f = (c + 32);

						JOptionPane.showMessageDialog(null, "A temperatura de Celsius para Fahrenheit é de " + f,
								"Titulo", JOptionPane.INFORMATION_MESSAGE);

					} else if (janelaTemperatura == "De Celsius a Kelvin") {

						double k = (numero + 273.15);

						JOptionPane.showMessageDialog(null, "A temperatura de Celsius para Kelvin é de " + k, "Titulo",
								JOptionPane.INFORMATION_MESSAGE);

					} else if (janelaTemperatura == "De Fahrenheit a Celsius") {

						double f = (numero - 32);

						double c = (f * 5 / 9);

						JOptionPane.showMessageDialog(null, "A temperatura de Fahrenheit para Celsius é de " + c,
								"Titulo", JOptionPane.INFORMATION_MESSAGE);

					} else if (janelaTemperatura == "De Fahrenheit a Kelvin") {

						double f = (numero - 32);

						double k = (f * 5 / 9) + 273.15;

						JOptionPane.showMessageDialog(null, "A temperatura de Fahrenheit para Kelvin é de " + k,
								"Titulo", JOptionPane.INFORMATION_MESSAGE);

					} else if (janelaTemperatura == "De Kelvin a Celsius") {

						double k = (numero - 273.15);

						JOptionPane.showMessageDialog(null, "A temperatura de Kelvin para Celsius é de " + k, "Titulo",
								JOptionPane.INFORMATION_MESSAGE);

					} else if (janelaTemperatura == "De Kelvin a Fahrenheit") {

						double k = (numero - 273.15);

						double c = (k * 5 / 9) + 32;

						JOptionPane.showMessageDialog(null, "A temperatura de Kelvin para Fahrenheit é de " + c,
								"Titulo", JOptionPane.INFORMATION_MESSAGE);

					}

				}
				Object continuaPrograma = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Conversor",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

				if (continuaPrograma == null) {
					JOptionPane.showMessageDialog(null, "Programa finalizado", "Conversor", JOptionPane.PLAIN_MESSAGE);
					continua = 1;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Programa finalizado", "Conversor", JOptionPane.PLAIN_MESSAGE);
				continua = 1;
			}
		}
	}

}
