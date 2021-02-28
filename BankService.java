package models;

import org.springframework.stereotype.Component;

@Component
public interface BankService {
    double checkBalance(String cardNumber);
    boolean withdraw(double amount, String cardNumber);
    boolean topUp(double amount, String cardNumber);
    void changePinCode(String newPinCode, String cardNumber);
}