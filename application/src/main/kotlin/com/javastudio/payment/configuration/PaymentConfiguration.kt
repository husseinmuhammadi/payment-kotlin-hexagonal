package com.javastudio.payment.configuration

import com.javastudio.payment.domain.cardtransaction.CardTransactionService
import com.javastudio.payment.domain.cardtransaction.service.CardTransactionServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PaymentConfiguration {

    @Bean
    fun cardTransactionService(): CardTransactionService = CardTransactionServiceImpl()
}