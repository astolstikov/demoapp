package ru.astolstikov.demo;

public class WorkData {
	private String name; // Имя
	private String nameJNDI; // Имя JNDI
	private String description; // Описание
	private String cathegory; // Категория
	private String url; // URL
	private String nickname; // Псевдоним
	private long userID; // ID пользователя
	private String psswd; // Пароль
	private long timeout; // Timeout соединения
	private long maxNumOfConn; // Максимальное число соединений
	private long minNumOfConn; // Минимальное число соединений
	
	public WorkData(String name, String nameJNDI, String description, String cathegory, String url, String nickname,
			long userID, String psswd, long timeout, long maxNumOfConn, long minNumOfConn) {
		this.name = name;
		this.nameJNDI = nameJNDI;
		this.description = description;
		this.cathegory = cathegory;
		this.url = url;
		this.nickname = nickname;
		this.userID = userID;
		this.psswd = psswd;
		this.timeout = timeout;
		this.maxNumOfConn = maxNumOfConn;
		this.minNumOfConn = minNumOfConn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameJNDI() {
		return nameJNDI;
	}

	public void setNameJNDI(String nameJNDI) {
		this.nameJNDI = nameJNDI;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCathegory() {
		return cathegory;
	}

	public void setCathegory(String cathegory) {
		this.cathegory = cathegory;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getPsswd() {
		return psswd;
	}

	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}

	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	public long getMaxNumOfConn() {
		return maxNumOfConn;
	}

	public void setMaxNumOfConn(long maxNumOfConn) {
		this.maxNumOfConn = maxNumOfConn;
	}

	public long getMinNumOfConn() {
		return minNumOfConn;
	}

	public void setMinNumOfConn(long minNumOfConn) {
		this.minNumOfConn = minNumOfConn;
	}
}
