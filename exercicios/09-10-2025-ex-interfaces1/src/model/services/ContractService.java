package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;
    private Integer months;

    private Installment installment;

    public ContractService(OnlinePaymentService onlinePaymentService, Integer months) {
        this.onlinePaymentService = onlinePaymentService;
        this.months = months;
    }

    public void processContract(Contract contract, Integer months) {
        Double totalValue = contract.getTotalValue();

        Double paymentFee = onlinePaymentService.paymentFee(totalValue);
        Double interest = onlinePaymentService.interest(totalValue, months);

        Double amount = paymentFee + interest;

        installment.setAmount(amount);
    }
}
