package cn.javass.dp.state.example4;

public class NormalVoteState2 extends NormalVoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//�ȵ������еĹ���
		super.vote(user, voteItem, voteManager);
		//������ֽ�����ʾ��һ��
		System.out.println("��������10��");
	}
}