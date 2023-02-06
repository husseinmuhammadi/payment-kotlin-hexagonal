package com.javastudio.payment.web.mapper

import com.javastudio.payment.domain.cardtransaction.model.FinancialTransaction
import com.javastudio.payment.web.generated.v1.model.CardTransactionRequest
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CardTransactionMapper {
    fun map(cardTransactionRequest: CardTransactionRequest?): FinancialTransaction?
}