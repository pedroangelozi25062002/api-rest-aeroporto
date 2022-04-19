package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import support.DSTCode;

@Entity(name="tb_aeroporto")
@SuppressWarnings("serial")
public class AeroportoEntity implements Serializable{
	
	@Id @GeneratedValue
	private long id;
	private String nome;
	private String cidade;
	private String pais;
	@Column(name="iatacode")
	private String iataCode;
	@Column(name="icaocode")
    private String icaoCode;
	private double latitude;
	private double longitude;
	private double altitude;
	@Column(name="offsetutc")
	private double offsetFromUTC;
    @Column(name="dstcode")
	@Enumerated(EnumType.STRING)
	private DSTCode dstCode;
	private String timezone;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getIataCode() {
		return iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	public String getIcaoCode() {
		return icaoCode;
	}
	public void setIcaoCode(String icaoCode) {
		this.icaoCode = icaoCode;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public DSTCode getDstCode() {
		return dstCode;
	}
	public void setDstCode(DSTCode dstCode) {
		this.dstCode = dstCode;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
		

}
