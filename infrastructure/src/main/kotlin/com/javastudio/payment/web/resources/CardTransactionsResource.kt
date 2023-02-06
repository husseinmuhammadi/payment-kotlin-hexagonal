package com.javastudio.payment.web.resources

import com.javastudio.payment.domain.cardtransaction.CardTransactionService
import com.javastudio.payment.web.generated.v1.api.TransactionsApi
import com.javastudio.payment.web.generated.v1.model.CardTransactionRequest
import com.javastudio.payment.web.mapper.CardTransactionMapper
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import java.time.OffsetDateTime

@RestController
@RequestMapping("/api/v1")
class CardTransactionsResource(
    private val service: CardTransactionService,
    private val mapper: CardTransactionMapper
) : TransactionsApi {
    override fun transactionsGet(
        rrn: String?,
        stan: String?,
        transactionDate: OffsetDateTime?,
        cardNumber: String?
    ): ResponseEntity<Unit> {
        return super.transactionsGet(rrn, stan, transactionDate, cardNumber)
    }

    override fun transactionsPost(cardTransactionRequest: CardTransactionRequest?): ResponseEntity<Unit> {
        mapper.map(cardTransactionRequest)?.let {
            service.performTransaction(it)
        }
        val id = 1
        return ResponseEntity.created(
            URI.create("/transactions/$id")
        ).build();
    }
}
