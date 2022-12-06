package com.moaaz.models;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.moaaz.database.PictureDatabase;
import com.moaaz.service.PictureService;

public class Build {

	public static void main(String[] args) {
		PictureDatabase picd = new PictureDatabase();
		ArrayList<Picture> pics = new ArrayList<>();
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/313072221_3463677877189390_1163293215315989889_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=730e14&_nc_ohc=slbLH8VqfWAAX8AT1db&_nc_ht=scontent.fcai15-1.fna&oh=00_AfAQLbfvZvltrlKdh9pSLsf2OH7hOdPWp0gGzSGDGUazSg&oe=636777A5"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312306570_3463678600522651_771075013405613016_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=730e14&_nc_ohc=8XV7_4ouqkUAX-th-Ut&_nc_ht=scontent.fcai15-1.fna&oh=00_AfCIUTp2BwafdBs7c_Z8cM3Di_jcJwZORzlc1GRZ5FFsZg&oe=63682E56"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312327798_3463678580522653_1536004994455942678_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=730e14&_nc_ohc=BhRgcRsCPv8AX_qjlDV&_nc_ht=scontent.fcai15-1.fna&oh=00_AfADSB1MzUNvQoR2W8310KzCgmzPNj8utjRwvNVs4GfboA&oe=63670254"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312634592_3463678537189324_3491056033950300173_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=730e14&_nc_ohc=iai4zAuqPMcAX9hQpWt&_nc_ht=scontent.fcai15-1.fna&oh=00_AfDjNtbuJ3AYoW-6v021OpdowE2X8wrUHssuSO-GUFK3tQ&oe=6367BF2D"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/313067664_3463678507189327_9053406917582712355_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=730e14&_nc_ohc=j8HntqXFk20AX-9gREV&_nc_ht=scontent.fcai15-1.fna&oh=00_AfCMazO9QWQaIhRAM-nJzrOg3tvVUUIzd16QbjwbBx-qBQ&oe=6368AA2A"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/314328840_3463678473855997_9165232164240135072_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=730e14&_nc_ohc=78AHAczdSkIAX8SuRm5&_nc_ht=scontent.fcai15-1.fna&oh=00_AfDTCLjRqcHZmiU6n5sgD98X0eCfcVujeJ3dudWuRV_XZw&oe=6368C63B"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312646426_3463678410522670_7902441084474686372_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=730e14&_nc_ohc=Wnsd6a0CQnsAX8SfnNf&_nc_ht=scontent.fcai15-1.fna&oh=00_AfA_seq3rclWl3n8N4XDsYJyhFMgbVcSDfVQCtoy_FFsWw&oe=6368A5E8"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/313430847_3463678393856005_5647708242469802871_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=730e14&_nc_ohc=DoZy9V6z1UcAX_WkM_-&_nc_ht=scontent.fcai15-1.fna&oh=00_AfDUX7L41Opne2BJOi0MPsRtYDg3sWGIUbKRtaq0DPZlVA&oe=6367E089"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/313271588_3463678380522673_2282753056236046603_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=730e14&_nc_ohc=ENo7RixEtFUAX_-s9-G&_nc_ht=scontent.fcai15-1.fna&oh=00_AfCwHi-ZC2RHT4QSUEFpNjc5Xz4pJktHMK6VA9GZuDSrtA&oe=63688AD0"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312830599_3463678333856011_5823563863167033853_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=730e14&_nc_ohc=rKUSaMSNKvMAX8Vf7N1&_nc_ht=scontent.fcai15-1.fna&oh=00_AfBaoDNFYze5cnTdXYHKzwy68V4KhzeMdmvlU7IqkgB_AA&oe=63687F8C"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312448555_3463678303856014_3336780198578684365_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=730e14&_nc_ohc=afH1Y3MV9MgAX-ozqUJ&_nc_ht=scontent.fcai15-1.fna&oh=00_AfDQpPQaLHyeKQbbKhl1KiazVSzol-CCNDt0eBdC4ZAFcw&oe=6367299D"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312845292_3463678273856017_6031084079479948307_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=730e14&_nc_ohc=vzLuYClteKwAX_qzHbn&_nc_ht=scontent.fcai15-1.fna&oh=00_AfCx2kmRv5OmNNjUL4mBxhPZcGrIJbGHMNIhdXFkaY1dEQ&oe=63687927"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312193524_3463678240522687_5991168849930509341_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=730e14&_nc_ohc=bLlBL1Ew5q0AX-oPUhg&_nc_ht=scontent.fcai15-1.fna&oh=00_AfBWjugSNL2ylMvMX7NsPyyE7cwNU7RFrfOHIN-uZwxYfg&oe=6367E78F"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/313260439_3463678203856024_5244632028336789729_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=730e14&_nc_ohc=YrhpFdNeUEQAX8vMq8O&_nc_ht=scontent.fcai15-1.fna&oh=00_AfAdn9_fPJHdDvUPmbmDNnMMMKx-stU4XeXrNApkibhCew&oe=636884A0"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312372407_3463678143856030_734634107316154293_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=730e14&_nc_ohc=sHkhZeQ9wugAX_SwXBY&_nc_ht=scontent.fcai15-1.fna&oh=00_AfA3DkK-1X8WlxTBqfb8ICpfNEPDiGU_Ld-RgM10yYA3uQ&oe=6367F209"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312725763_3463678113856033_1185321782741791565_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=730e14&_nc_ohc=Bd5B3LaTjl4AX-coiQ2&_nc_ht=scontent.fcai15-1.fna&oh=00_AfAq06VMrVn9eaJN8PSNI1fQz3ZZy7mvH1r-MbvPPFbFCg&oe=636761A4"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/314417069_3463678147189363_6040765263735575830_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=730e14&_nc_ohc=JmnZM4V7msEAX9mjdtk&_nc_ht=scontent.fcai15-1.fna&oh=00_AfB0ra34T18dqfm9F-Fu9j1tdOYADgbc78bi39ye5BGmEg&oe=63678177	"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312484411_3463677993856045_5537493179908528450_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=730e14&_nc_ohc=Ass6ip34220AX8w9hvA&_nc_ht=scontent.fcai15-1.fna&oh=00_AfCmHa9It5Qc3osK9VEk4m_szBvv_vzeow0U5abUJS_9ow&oe=63683CC9"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/313259070_3463677977189380_1411859180500081646_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=730e14&_nc_ohc=Cm0fLYUvGwAAX9sNqOP&_nc_ht=scontent.fcai15-1.fna&oh=00_AfDyYeU51Ep0yJTo1aDZZWE_g7UKGkdNaOBy5mX6_hVVow&oe=63675B7E"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/314360827_3463677957189382_1564899399396522648_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=730e14&_nc_ohc=IX51b4TSuJ4AX-KGx8-&_nc_ht=scontent.fcai15-1.fna&oh=00_AfCD7zhA-OFcToC06CP8cakGrmeIblsO7YkRx_TbvKn1iA&oe=63681D2D"));

		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/313424614_3463677857189392_5591673313646589322_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=730e14&_nc_ohc=Ad0Y5RNTpEcAX_eqV89&_nc_ht=scontent.fcai15-1.fna&oh=00_AfAcnh7Y33zTvjV6oJ_pOMDo6HACDfTrJfQtMAudgEGUyA&oe=636884F8"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312470168_3463678700522641_7400080668503741078_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=730e14&_nc_ohc=FaRoy_t5ZOEAX-bAksy&_nc_ht=scontent.fcai15-1.fna&oh=00_AfBXGPPQ6q8_nhVIGSR6Pn_ja8FPfsZpideavG4buLIq0A&oe=63682EBE"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/312189963_3463678787189299_540937502442174531_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=730e14&_nc_ohc=0EXmQ7ysoIQAX_UQrgM&tn=u-g5g6QmZiq_CThp&_nc_ht=scontent.fcai15-1.fna&oh=00_AfBkPQ9UCzjHSh60IjBNsonBxFxo6TDtppSjkZ6NEuGp_Q&oe=6368BDB6"));
		pics.add(new Picture("pic",
				"https://scontent.fcai15-1.fna.fbcdn.net/v/t39.30808-6/314341841_3463678650522646_1116458843849740622_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=730e14&_nc_ohc=FwJR9RV9VUgAX_wnEv5&_nc_ht=scontent.fcai15-1.fna&oh=00_AfDCS8txEEz5Zf90TOYflnR_Ogi9iiIXd7zv6BNF0Rd0mA&oe=63682C26"));

		for (int i = 0; i < pics.size(); i++) {
			try {

				picd.insertPic(pics.get(i));
				System.out.println("done");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
