package com.epam.rd.autocode.assessment.appliances.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Order {
    private long id;
    private Client client;
    private Employee employee;
    private Map<Appliance, BigDecimal> appliances;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", employee='" + employee + '\'' +
                '}';
    }

    public BigDecimal getAmount() {
        return appliances.values().stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
