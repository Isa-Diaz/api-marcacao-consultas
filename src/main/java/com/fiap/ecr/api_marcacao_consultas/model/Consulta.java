package com.fiap.ecr.api_marcacao_consultas.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
<<<<<<< HEAD

=======
>>>>>>> 2135768f7e001f77c966dcaae5e81c96e22482d2
@Data
@Entity
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< HEAD

    private LocalDateTime dataHora;

    private String especialidade;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario; // Paciente

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Usuario medico; // Médico

    private String status; // AGENDADA, REALIZADA, CANCELADA

    private String observacao; // Observações sobre a consulta
}
=======
    private LocalDateTime dataHora;
    private String especialidade;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
>>>>>>> 2135768f7e001f77c966dcaae5e81c96e22482d2
