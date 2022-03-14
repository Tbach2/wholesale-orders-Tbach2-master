package edu.wctc.wholesale.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class OrderDTO {
    private String customerName;
    private LocalDateTime date;
    private String terms;
    private String productName;
    private String poNumber;
    private LocalDate shipped;
    private double total;

}