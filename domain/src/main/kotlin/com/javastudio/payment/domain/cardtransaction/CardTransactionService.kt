package com.javastudio.payment.domain.cardtransaction

import com.javastudio.payment.domain.cardtransaction.model.FinancialTransaction
import com.javastudio.payment.domain.cardtransaction.model.ReversalTransaction

interface CardTransactionService {
    fun findTransactions(): List<FinancialTransaction>
    fun performTransaction(transaction: FinancialTransaction)
    fun reverseTransaction(reversalTransaction: ReversalTransaction)
}