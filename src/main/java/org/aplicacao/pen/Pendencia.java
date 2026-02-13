package org.aplicacao.pen;

import java.util.Date;

public class Pendencia {

    public String getDs_notificacao() {
        return ds_notificacao;
    }

    public void setDs_notificacao(String ds_notificacao) {
        this.ds_notificacao = ds_notificacao;
    }

    public Integer getCd_notificacao() {
        return cd_notificacao;
    }

    public void setCd_notificacao(Integer cd_notificacao) {
        this.cd_notificacao = cd_notificacao;
    }

    public String getCd_usuario_reg() {
        return cd_usuario_reg;
    }

    public void setCd_usuario_reg(String cd_usuario_reg) {
        this.cd_usuario_reg = cd_usuario_reg;
    }

    public Date getDh_registro() {
        return dh_registro;
    }

    public void setDh_registro(Date dh_registro) {
        this.dh_registro = dh_registro;
    }

    public String getCd_usuario_bai() {
        return cd_usuario_bai;
    }

    public void setCd_usuario_bai(String cd_usuario_bai) {
        this.cd_usuario_bai = cd_usuario_bai;
    }

    public String getCd_usuario_dest() {
        return cd_usuario_dest;
    }

    public void setCd_usuario_dest(String cd_usuario_dest) {
        this.cd_usuario_dest = cd_usuario_dest;
    }

    public Date getDh_baixa() {
        return dh_baixa;
    }

    public void setDh_baixa(Date dh_baixa) {
        this.dh_baixa = dh_baixa;
    }

    public Integer getCd_ramal() {
        return cd_ramal;
    }

    public void setCd_ramal(Integer cd_ramal) {
        this.cd_ramal = cd_ramal;
    }

    public String getDs_notificacao_baixa() {
        return ds_notificacao_baixa;
    }

    public void setDs_notificacao_baixa(String ds_notificacao_baixa) {
        this.ds_notificacao_baixa = ds_notificacao_baixa;
    }

    public Integer getCd_atendimento() {
        return cd_atendimento;
    }

    public void setCd_atendimento(Integer cd_atendimento) {
        this.cd_atendimento = cd_atendimento;
    }

    public Integer getCd_setor() {
        return cd_setor;
    }

    public void setCd_setor(Integer cd_setor) {
        this.cd_setor = cd_setor;
    }

    public Integer getCd_tipo_notificacao() {
        return cd_tipo_notificacao;
    }

    public void setCd_tipo_notificacao(Integer cd_tipo_notificacao) {
        this.cd_tipo_notificacao = cd_tipo_notificacao;
    }

    public Integer getCd_conta() {
        return cd_conta;
    }

    public void setCd_conta(Integer cd_conta) {
        this.cd_conta = cd_conta;
    }

    public Integer getAviso_cirurgia() {
        return aviso_cirurgia;
    }

    public void setAviso_cirurgia(Integer aviso_cirurgia) {
        this.aviso_cirurgia = aviso_cirurgia;
    }

    private Integer cd_notificacao;
    private String ds_notificacao;
    private String cd_usuario_reg;
    private String cd_usuario_dest;
    private Date dh_registro;
    private Date dh_baixa;
    private String cd_usuario_bai;
    private Integer cd_setor;
    private Integer cd_tipo_notificacao;
    private Integer cd_atendimento;
    private Integer cd_conta;
    private Integer aviso_cirurgia;
    private String  ds_notificacao_baixa;
    private Integer cd_ramal;


}
