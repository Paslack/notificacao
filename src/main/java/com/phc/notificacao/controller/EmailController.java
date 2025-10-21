package com.phc.notificacao.controller;

import com.phc.notificacao.business.EmailService;
import com.phc.notificacao.business.dto.TarefasDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO tarefasDTO) {
        emailService.enviarEmail(tarefasDTO);
        return ResponseEntity.ok().build();
    }
}
