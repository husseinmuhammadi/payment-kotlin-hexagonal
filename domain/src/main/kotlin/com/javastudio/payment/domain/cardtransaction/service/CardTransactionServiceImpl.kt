package com.javastudio.payment.domain.cardtransaction.service

import com.javastudio.payment.domain.cardtransaction.CardTransactionService
import com.javastudio.payment.domain.cardtransaction.model.FinancialTransaction
import com.javastudio.payment.domain.cardtransaction.model.ReversalTransaction

class CardTransactionServiceImpl : CardTransactionService {
    override fun findTransactions(): List<FinancialTransaction> {
        TODO("Not yet implemented")
    }

    override fun performTransaction(transaction: FinancialTransaction) {
        TODO("Not yet implemented")
    }

    override fun reverseTransaction(reversalTransaction: ReversalTransaction) {
        TODO("Not yet implemented")
    }
}