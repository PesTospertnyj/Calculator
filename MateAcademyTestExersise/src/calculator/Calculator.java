package calculator;

import java.util.Scanner;

public class Calculator {

	public static final int I = 1;
	public static final int II = 2;
	public static final int III = 3;
	public static final int IV = 4;
	public static final int V = 5;
	public static final int VI = 6;
	public static final int VII = 7;
	public static final int VIII = 8;
	public static final int IX = 9;
	public static final int X = 10;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = getInt();
		int num2 = getInt();
		char operation = getOperation();
		int result = calc(num1, num2, operation);
		System.out.println("Результат операции: " + result);
	}

	public static int getInt() {
		System.out.println("Введите число:");
		int num;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
			scanner.next();
			num = getInt();
		}
		return num;
	}

	public static char getOperation() {
		System.out.println("Введите операцию:");
		char operation;
		if (scanner.hasNext()) {
			operation = scanner.next().charAt(0);
		} else {
			System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
			scanner.next();
			operation = getOperation();
		}
		return operation;
	}

	public static int calc(int num1, int num2, char operation) {
		int result;
		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Операция не распознана. Повторите ввод.");
			result = calc(num1, num2, getOperation());
		}
		return result;
	}

}
