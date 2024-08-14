package com.alyn.sftp.app;

import java.io.File;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class Main {

	private static final String HOST = "eu-central-1.sftpcloud.io";
	private static final String USERNAME = "7abd18df8c6e4435b3acea5ca049e200";
	private static final String PASSWORD = "YVN6Bdj7ByFQ4ul1VViBpCi3H2rsRKq1";
	private static final String locFileAdd = "/home/aliyanm/Downloads/workspace/Marshalling-UnMarshalling/Marshalling-UnMarshalling/SFTP-App/src/main/java/com/alyn/sftp/app/info.txt";
	private static final String remoteDir = "/";

	static Session createJschSession() throws JSchException {
		JSch jsch = new JSch();
		Session jschSession = jsch.getSession(USERNAME, HOST);
		jschSession.setConfig("StrictHostKeyChecking", "no");
		jschSession.setPassword(PASSWORD);
		jschSession.connect();
		System.out.println("Connection is established");
		return jschSession;
	}

	static ChannelSftp getSftpChannel(Session jschSession) throws JSchException {
		return (ChannelSftp) jschSession.openChannel("sftp");
	}

	static void uploadFileToSftp(ChannelSftp sftpChannel) throws JSchException, SftpException {

		sftpChannel.connect();
		sftpChannel.put(locFileAdd, remoteDir);
		System.out.println("File is pushed to SFTP");
		sftpChannel.exit();
	}
	
	static void downloadFileFromSftp(ChannelSftp channelSftp) throws JSchException, SftpException{
		channelSftp.connect();
		channelSftp.get("src/main/resources/", "info.txt");
		channelSftp.exit();
	}
	
	public static void main(String args[]) throws JSchException, SftpException {
		
		/*
		 *   1. create Jsch Session
		 */
		Session jschSession = createJschSession();
		ChannelSftp channelSftp = null;
		
		/*
		 *   2. Create SFTP Channel
		 */
		if (jschSession != null) 
			channelSftp = getSftpChannel(jschSession);
		else 
			System.out.println("Not able to establish Jsch Connection");
		
		/*
		 *   3. Upload File to SFTP
		 */
		if(channelSftp != null)		
			uploadFileToSftp(channelSftp);
		else 
			System.out.println("Not able to get SFTP Channel");
		
		
		channelSftp = getSftpChannel(jschSession);
		downloadFileFromSftp(channelSftp);
		/*
		 *   4. close JschSession
		 */
		
		if(jschSession != null)
		jschSession.disconnect();
		
		System.out.println("Jsch Session is disconnected successfully");
	}

}
