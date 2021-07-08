package one.digitalinnovation.personalapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personalapi.enums.PhoneType;

import javax.persistence.*;

@Entity

// inseri os getter e setter
@Data
// uma forma de construir os objetos
@Builder
// construtor com todos os argumentos
@AllArgsConstructor
// construtor sem argumentos
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
