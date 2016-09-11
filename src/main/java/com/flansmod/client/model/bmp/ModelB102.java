//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB102 extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelB102() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[401];
		turretModel = new ModelRendererTurbo[53];
		barrelModel = new ModelRendererTurbo[30];
		leftTrackModel = new ModelRendererTurbo[514];
		rightTrackModel = new ModelRendererTurbo[513];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackModel_1();
		initleftTrackModel_2();
		initrightTrackModel_1();
		initrightTrackModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1027
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1028
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1029
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1030
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1031
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1032
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1033
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1034
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1035
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1036
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1037
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1038
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1039
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1040
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1041
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1042
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1043
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1044
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1045
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1046
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1047
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1048
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1049
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1050
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1051
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1052
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1053
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1054
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1055
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1056
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1057
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1058
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1059
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1060
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1061
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1062
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1067
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1068
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1069
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1070
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1071
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1072
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1073
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1074
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1075
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1076
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1077
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1078
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1079
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1080
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1081
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1082
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1083
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1084
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1085
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1086
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1087
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1088
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1089
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1090
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1091
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1092
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1093
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1094
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1095
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1096
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1097
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1098
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1099
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1100
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1101
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1102
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1103
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1104
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1105
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1106
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1107
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1108
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1109
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1110
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1111
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1112
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1113
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1114
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1115
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1116
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1117
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1118
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1119
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1120
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1121
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1122
		bodyModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1123
		bodyModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1124
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1125
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1126
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1127
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1128
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1129
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1130
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1131
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1132
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1133
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1134
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1135
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1136
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1137
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1138
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1139
		bodyModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1140
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1141
		bodyModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1142
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1143
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1144
		bodyModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1145
		bodyModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1146
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1147
		bodyModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1148
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1149
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1150
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1151
		bodyModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1152
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1153
		bodyModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1154
		bodyModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1155
		bodyModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1156
		bodyModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1157
		bodyModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1158
		bodyModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1159
		bodyModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1160
		bodyModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1161
		bodyModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1162
		bodyModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1163
		bodyModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1164
		bodyModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1165
		bodyModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1166
		bodyModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1167
		bodyModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1168
		bodyModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1169
		bodyModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1170
		bodyModel[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1171
		bodyModel[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1172
		bodyModel[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1173
		bodyModel[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1174
		bodyModel[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1175
		bodyModel[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1176
		bodyModel[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1177
		bodyModel[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1178
		bodyModel[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1179
		bodyModel[149] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1180
		bodyModel[150] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1181
		bodyModel[151] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1182
		bodyModel[152] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1183
		bodyModel[153] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1184
		bodyModel[154] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1185
		bodyModel[155] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1186
		bodyModel[156] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1187
		bodyModel[157] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1188
		bodyModel[158] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1189
		bodyModel[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1190
		bodyModel[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1191
		bodyModel[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1192
		bodyModel[162] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1193
		bodyModel[163] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1194
		bodyModel[164] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1195
		bodyModel[165] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1196
		bodyModel[166] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1197
		bodyModel[167] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1198
		bodyModel[168] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1199
		bodyModel[169] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1200
		bodyModel[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1201
		bodyModel[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1202
		bodyModel[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1203
		bodyModel[173] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1204
		bodyModel[174] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1205
		bodyModel[175] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1206
		bodyModel[176] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1207
		bodyModel[177] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1208
		bodyModel[178] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1209
		bodyModel[179] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1210
		bodyModel[180] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1211
		bodyModel[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1212
		bodyModel[182] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1213
		bodyModel[183] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1214
		bodyModel[184] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1215
		bodyModel[185] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1216
		bodyModel[186] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1217
		bodyModel[187] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1218
		bodyModel[188] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1219
		bodyModel[189] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1220
		bodyModel[190] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1221
		bodyModel[191] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1222
		bodyModel[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1223
		bodyModel[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1224
		bodyModel[194] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1225
		bodyModel[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1226
		bodyModel[196] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1227
		bodyModel[197] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1228
		bodyModel[198] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1229
		bodyModel[199] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1230
		bodyModel[200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1231
		bodyModel[201] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1232
		bodyModel[202] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1233
		bodyModel[203] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1234
		bodyModel[204] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1235
		bodyModel[205] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1236
		bodyModel[206] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1237
		bodyModel[207] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1238
		bodyModel[208] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1239
		bodyModel[209] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1240
		bodyModel[210] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1241
		bodyModel[211] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1242
		bodyModel[212] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1243
		bodyModel[213] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1244
		bodyModel[214] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1245
		bodyModel[215] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1246
		bodyModel[216] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1247
		bodyModel[217] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1248
		bodyModel[218] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1249
		bodyModel[219] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1250
		bodyModel[220] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1251
		bodyModel[221] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1252
		bodyModel[222] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1253
		bodyModel[223] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1254
		bodyModel[224] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1255
		bodyModel[225] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1256
		bodyModel[226] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1257
		bodyModel[227] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1258
		bodyModel[228] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1259
		bodyModel[229] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1260
		bodyModel[230] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1261
		bodyModel[231] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1262
		bodyModel[232] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1263
		bodyModel[233] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1264
		bodyModel[234] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1265
		bodyModel[235] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1266
		bodyModel[236] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1267
		bodyModel[237] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1268
		bodyModel[238] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1269
		bodyModel[239] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1270
		bodyModel[240] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1271
		bodyModel[241] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1272
		bodyModel[242] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1273
		bodyModel[243] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1274
		bodyModel[244] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1275
		bodyModel[245] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1276
		bodyModel[246] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1277
		bodyModel[247] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1278
		bodyModel[248] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1279
		bodyModel[249] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1280
		bodyModel[250] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1281
		bodyModel[251] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1282
		bodyModel[252] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1283
		bodyModel[253] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1284
		bodyModel[254] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1285
		bodyModel[255] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1286
		bodyModel[256] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1287
		bodyModel[257] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1288
		bodyModel[258] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1289
		bodyModel[259] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1290
		bodyModel[260] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1291
		bodyModel[261] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1292
		bodyModel[262] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1293
		bodyModel[263] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1294
		bodyModel[264] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1295
		bodyModel[265] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1296
		bodyModel[266] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1297
		bodyModel[267] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1298
		bodyModel[268] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1299
		bodyModel[269] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1300
		bodyModel[270] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1301
		bodyModel[271] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1302
		bodyModel[272] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1303
		bodyModel[273] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1304
		bodyModel[274] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1305
		bodyModel[275] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1306
		bodyModel[276] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1307
		bodyModel[277] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1308
		bodyModel[278] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1309
		bodyModel[279] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1310
		bodyModel[280] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1311
		bodyModel[281] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1312
		bodyModel[282] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1313
		bodyModel[283] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1314
		bodyModel[284] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1315
		bodyModel[285] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1316
		bodyModel[286] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1317
		bodyModel[287] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1318
		bodyModel[288] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1319
		bodyModel[289] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1320
		bodyModel[290] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1321
		bodyModel[291] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1322
		bodyModel[292] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1323
		bodyModel[293] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1324
		bodyModel[294] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1325
		bodyModel[295] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1326
		bodyModel[296] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1327
		bodyModel[297] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1328
		bodyModel[298] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1329
		bodyModel[299] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1330
		bodyModel[300] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1331
		bodyModel[301] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1332
		bodyModel[302] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1333
		bodyModel[303] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1334
		bodyModel[304] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1335
		bodyModel[305] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1336
		bodyModel[306] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1337
		bodyModel[307] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1338
		bodyModel[308] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1339
		bodyModel[309] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1340
		bodyModel[310] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1341
		bodyModel[311] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1342
		bodyModel[312] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1343
		bodyModel[313] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1344
		bodyModel[314] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1345
		bodyModel[315] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1346
		bodyModel[316] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1347
		bodyModel[317] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1348
		bodyModel[318] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1349
		bodyModel[319] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1350
		bodyModel[320] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1351
		bodyModel[321] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1352
		bodyModel[322] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1353
		bodyModel[323] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1354
		bodyModel[324] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1355
		bodyModel[325] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1356
		bodyModel[326] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1357
		bodyModel[327] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1358
		bodyModel[328] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1359
		bodyModel[329] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1360
		bodyModel[330] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1361
		bodyModel[331] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1362
		bodyModel[332] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1363
		bodyModel[333] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1364
		bodyModel[334] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1365
		bodyModel[335] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1366
		bodyModel[336] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1367
		bodyModel[337] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1368
		bodyModel[338] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1369
		bodyModel[339] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1370
		bodyModel[340] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1371
		bodyModel[341] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1372
		bodyModel[342] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1373
		bodyModel[343] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1374
		bodyModel[344] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1375
		bodyModel[345] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1376
		bodyModel[346] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1377
		bodyModel[347] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1378
		bodyModel[348] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1379
		bodyModel[349] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1380
		bodyModel[350] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1381
		bodyModel[351] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1382
		bodyModel[352] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1383
		bodyModel[353] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1384
		bodyModel[354] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1385
		bodyModel[355] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1386
		bodyModel[356] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1387
		bodyModel[357] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1388
		bodyModel[358] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1389
		bodyModel[359] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1390
		bodyModel[360] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1391
		bodyModel[361] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1392
		bodyModel[362] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1393
		bodyModel[363] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1394
		bodyModel[364] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1395
		bodyModel[365] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1396
		bodyModel[366] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1397
		bodyModel[367] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1398
		bodyModel[368] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1399
		bodyModel[369] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1400
		bodyModel[370] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1401
		bodyModel[371] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1402
		bodyModel[372] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1403
		bodyModel[373] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1404
		bodyModel[374] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1405
		bodyModel[375] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1406
		bodyModel[376] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1407
		bodyModel[377] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1408
		bodyModel[378] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1410
		bodyModel[379] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1411
		bodyModel[380] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1412
		bodyModel[381] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1413
		bodyModel[382] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1414
		bodyModel[383] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1415
		bodyModel[384] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1416
		bodyModel[385] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1417
		bodyModel[386] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1418
		bodyModel[387] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1419
		bodyModel[388] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1420
		bodyModel[389] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1421
		bodyModel[390] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1422
		bodyModel[391] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1423
		bodyModel[392] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1424
		bodyModel[393] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1425
		bodyModel[394] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1426
		bodyModel[395] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1427
		bodyModel[396] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1428
		bodyModel[397] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1429
		bodyModel[398] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1430
		bodyModel[399] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1431
		bodyModel[400] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1432

		bodyModel[0].addShapeBox(0F, 0F, 0F, 21, 4, 27, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1027
		bodyModel[0].setRotationPoint(52F, -16.5F, -13.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 32, 6, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		bodyModel[1].setRotationPoint(41F, -12.5F, -19.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 11, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -18F, 0F, -6F, -18F, 0F, -6F, 0F, 0F, -6F); // Box 1029
		bodyModel[2].setRotationPoint(52F, -6.5F, -19.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 21, 4, 6, 0F,0F, -2F, 0F, -15F, -2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		bodyModel[3].setRotationPoint(52F, -16.5F, -19.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 21, 4, 6, 0F,0F, 0F, 0F, -9F, 0F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		bodyModel[4].setRotationPoint(52F, -16.5F, 13.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 4, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1032
		bodyModel[5].setRotationPoint(41F, -16.5F, -13.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1033
		bodyModel[6].setRotationPoint(41F, -16.5F, -19.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		bodyModel[7].setRotationPoint(41F, -16.5F, 13.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 100, 11, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 1035
		bodyModel[8].setRotationPoint(-48F, -6.5F, -19.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 89, 10, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1036
		bodyModel[9].setRotationPoint(-48F, -16.5F, -19.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 10, 39, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		bodyModel[10].setRotationPoint(-68F, -16.5F, -19.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 20, 11, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, -6F); // Box 1038
		bodyModel[11].setRotationPoint(-68F, -6.5F, -19.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		bodyModel[12].setRotationPoint(-48F, -16.5F, -32.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1040
		bodyModel[13].setRotationPoint(-47F, -16.5F, -32.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1041
		bodyModel[14].setRotationPoint(-34F, -16.5F, -32.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,-9F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		bodyModel[15].setRotationPoint(-64F, -16.5F, -32.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		bodyModel[16].setRotationPoint(-26F, -16.5F, -32.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1044
		bodyModel[17].setRotationPoint(-12F, -16.5F, -32.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1045
		bodyModel[18].setRotationPoint(-25F, -16.5F, -32.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		bodyModel[19].setRotationPoint(-30F, -16.5F, -27.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1047
		bodyModel[20].setRotationPoint(-32F, -16.5F, -27.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1048
		bodyModel[21].setRotationPoint(-28F, -16.5F, -27.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049
		bodyModel[22].setRotationPoint(-10F, -16.5F, -27.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		bodyModel[23].setRotationPoint(-8F, -16.5F, -27.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1051
		bodyModel[24].setRotationPoint(-6F, -16.5F, -27.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1052
		bodyModel[25].setRotationPoint(-4F, -16.5F, -32.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1053
		bodyModel[26].setRotationPoint(-3F, -16.5F, -32.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		bodyModel[27].setRotationPoint(10F, -16.5F, -32.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1055
		bodyModel[28].setRotationPoint(12F, -16.5F, -27.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1056
		bodyModel[29].setRotationPoint(14F, -16.5F, -27.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1057
		bodyModel[30].setRotationPoint(16F, -16.5F, -27.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1058
		bodyModel[31].setRotationPoint(18F, -16.5F, -32.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1059
		bodyModel[32].setRotationPoint(19F, -16.5F, -32.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1060
		bodyModel[33].setRotationPoint(32F, -16.5F, -32.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1061
		bodyModel[34].setRotationPoint(34F, -16.5F, -27.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1062
		bodyModel[35].setRotationPoint(36F, -16.5F, -27.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1067
		bodyModel[36].setRotationPoint(43F, -14.5F, -27.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1068
		bodyModel[37].setRotationPoint(-48F, -14.5F, -35.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1069
		bodyModel[38].setRotationPoint(-26F, -14.5F, -35.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1070
		bodyModel[39].setRotationPoint(-4F, -14.5F, -35.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		bodyModel[40].setRotationPoint(18F, -14.5F, -35.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1072
		bodyModel[41].setRotationPoint(-48F, -16.5F, 19.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1073
		bodyModel[42].setRotationPoint(-47F, -16.5F, 19.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1074
		bodyModel[43].setRotationPoint(-34F, -16.5F, 19.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, -2.4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 1075
		bodyModel[44].setRotationPoint(-64F, -16.5F, 19.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		bodyModel[45].setRotationPoint(-26F, -16.5F, 19.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1077
		bodyModel[46].setRotationPoint(-12F, -16.5F, 19.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1078
		bodyModel[47].setRotationPoint(-25F, -16.5F, 19.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1079
		bodyModel[48].setRotationPoint(-30F, -16.5F, 19.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 1080
		bodyModel[49].setRotationPoint(-32F, -16.5F, 19.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 1081
		bodyModel[50].setRotationPoint(-28F, -16.5F, 19.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 1082
		bodyModel[51].setRotationPoint(-10F, -16.5F, 19.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1083
		bodyModel[52].setRotationPoint(-8F, -16.5F, 19.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 1084
		bodyModel[53].setRotationPoint(-6F, -16.5F, 19.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1085
		bodyModel[54].setRotationPoint(-4F, -16.5F, 19.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1086
		bodyModel[55].setRotationPoint(-3F, -16.5F, 19.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087
		bodyModel[56].setRotationPoint(10F, -16.5F, 19.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 1088
		bodyModel[57].setRotationPoint(12F, -16.5F, 19.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1089
		bodyModel[58].setRotationPoint(14F, -16.5F, 19.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 1090
		bodyModel[59].setRotationPoint(16F, -16.5F, 19.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 16, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1091
		bodyModel[60].setRotationPoint(18F, -16.5F, 19.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1092
		bodyModel[61].setRotationPoint(19F, -16.5F, 19.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1093
		bodyModel[62].setRotationPoint(32F, -16.5F, 19.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 1094
		bodyModel[63].setRotationPoint(34F, -16.5F, 19.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1095
		bodyModel[64].setRotationPoint(36F, -16.5F, 19.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, 0F); // Box 1096
		bodyModel[65].setRotationPoint(43F, -14.5F, 19.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1097
		bodyModel[66].setRotationPoint(-48F, -14.5F, 32.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1098
		bodyModel[67].setRotationPoint(-26F, -14.5F, 32.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1099
		bodyModel[68].setRotationPoint(-4F, -14.5F, 32.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 1100
		bodyModel[69].setRotationPoint(18F, -14.5F, 32.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1101
		bodyModel[70].setRotationPoint(-45F, -14.5F, -37.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1102
		bodyModel[71].setRotationPoint(-38F, -14.5F, -37.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1103
		bodyModel[72].setRotationPoint(-16F, -14.5F, -37.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1104
		bodyModel[73].setRotationPoint(-23F, -14.5F, -37.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1105
		bodyModel[74].setRotationPoint(6F, -14.5F, -37.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1106
		bodyModel[75].setRotationPoint(-1F, -14.5F, -37.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1107
		bodyModel[76].setRotationPoint(28F, -14.5F, -37.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1108
		bodyModel[77].setRotationPoint(21F, -14.5F, -37.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1109
		bodyModel[78].setRotationPoint(-50F, -12.5F, -37.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1110
		bodyModel[79].setRotationPoint(-49.5F, -12F, -38F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1111
		bodyModel[80].setRotationPoint(-39.5F, -12F, -38F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1112
		bodyModel[81].setRotationPoint(-49F, -11.5F, -38.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1113
		bodyModel[82].setRotationPoint(-42F, -11.5F, -38.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1114
		bodyModel[83].setRotationPoint(-44F, -11.5F, -38.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1115
		bodyModel[84].setRotationPoint(-47F, -11.5F, -38.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1116
		bodyModel[85].setRotationPoint(-49F, -0.5F, -38.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1117
		bodyModel[86].setRotationPoint(-42F, -0.5F, -38.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1118
		bodyModel[87].setRotationPoint(-44F, -0.5F, -38.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1119
		bodyModel[88].setRotationPoint(-47F, -0.5F, -38.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1120
		bodyModel[89].setRotationPoint(-49F, -2.5F, -38.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1121
		bodyModel[90].setRotationPoint(-42F, -2.5F, -38.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1122
		bodyModel[91].setRotationPoint(-42F, -9.5F, -38.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1123
		bodyModel[92].setRotationPoint(-49F, -9.5F, -38.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1124
		bodyModel[93].setRotationPoint(-49F, -5F, -38.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1125
		bodyModel[94].setRotationPoint(-42F, -5F, -38.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1126
		bodyModel[95].setRotationPoint(-49F, -7F, -38.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1127
		bodyModel[96].setRotationPoint(-42F, -7F, -38.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1128
		bodyModel[97].setRotationPoint(-39F, -5F, -38.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1129
		bodyModel[98].setRotationPoint(-32F, -5F, -38.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1130
		bodyModel[99].setRotationPoint(-39F, -7F, -38.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1131
		bodyModel[100].setRotationPoint(-39F, -9.5F, -38.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1132
		bodyModel[101].setRotationPoint(-39F, -11.5F, -38.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1133
		bodyModel[102].setRotationPoint(-37F, -11.5F, -38.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1134
		bodyModel[103].setRotationPoint(-34F, -11.5F, -38.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1135
		bodyModel[104].setRotationPoint(-32F, -11.5F, -38.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1136
		bodyModel[105].setRotationPoint(-32F, -9.5F, -38.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1137
		bodyModel[106].setRotationPoint(-32F, -7F, -38.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1138
		bodyModel[107].setRotationPoint(-32F, -2.5F, -38.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1139
		bodyModel[108].setRotationPoint(-32F, -0.5F, -38.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1140
		bodyModel[109].setRotationPoint(-34F, -0.5F, -38.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1141
		bodyModel[110].setRotationPoint(-37F, -0.5F, -38.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1142
		bodyModel[111].setRotationPoint(-39F, -0.5F, -38.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1143
		bodyModel[112].setRotationPoint(-39F, -2.5F, -38.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1144
		bodyModel[113].setRotationPoint(-17F, -5F, -38.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1145
		bodyModel[114].setRotationPoint(-10F, -5F, -38.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1146
		bodyModel[115].setRotationPoint(-17F, -7F, -38.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1147
		bodyModel[116].setRotationPoint(-17F, -9.5F, -38.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1148
		bodyModel[117].setRotationPoint(-17F, -11.5F, -38.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1149
		bodyModel[118].setRotationPoint(-15F, -11.5F, -38.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1150
		bodyModel[119].setRotationPoint(-12F, -11.5F, -38.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1151
		bodyModel[120].setRotationPoint(-10F, -11.5F, -38.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1152
		bodyModel[121].setRotationPoint(-10F, -9.5F, -38.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1153
		bodyModel[122].setRotationPoint(-10F, -7F, -38.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1154
		bodyModel[123].setRotationPoint(-10F, -2.5F, -38.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1155
		bodyModel[124].setRotationPoint(-10F, -0.5F, -38.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1156
		bodyModel[125].setRotationPoint(-12F, -0.5F, -38.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1157
		bodyModel[126].setRotationPoint(-15F, -0.5F, -38.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1158
		bodyModel[127].setRotationPoint(-17F, -0.5F, -38.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1159
		bodyModel[128].setRotationPoint(-17F, -2.5F, -38.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1160
		bodyModel[129].setRotationPoint(-17.5F, -12F, -38F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1161
		bodyModel[130].setRotationPoint(-27.5F, -12F, -38F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1162
		bodyModel[131].setRotationPoint(-28F, -12.5F, -37.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1163
		bodyModel[132].setRotationPoint(-20F, -11.5F, -38.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1164
		bodyModel[133].setRotationPoint(-22F, -11.5F, -38.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1165
		bodyModel[134].setRotationPoint(-25F, -11.5F, -38.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1166
		bodyModel[135].setRotationPoint(-27F, -11.5F, -38.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1167
		bodyModel[136].setRotationPoint(-27F, -9.5F, -38.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		bodyModel[137].setRotationPoint(-27F, -7F, -38.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1169
		bodyModel[138].setRotationPoint(-27F, -5F, -38.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		bodyModel[139].setRotationPoint(-27F, -2.5F, -38.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1171
		bodyModel[140].setRotationPoint(-27F, -0.5F, -38.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1172
		bodyModel[141].setRotationPoint(-25F, -0.5F, -38.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1173
		bodyModel[142].setRotationPoint(-22F, -0.5F, -38.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1174
		bodyModel[143].setRotationPoint(-20F, -0.5F, -38.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1175
		bodyModel[144].setRotationPoint(-20F, -2.5F, -38.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1176
		bodyModel[145].setRotationPoint(-20F, -5F, -38.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1177
		bodyModel[146].setRotationPoint(-20F, -7F, -38.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1178
		bodyModel[147].setRotationPoint(-20F, -9.5F, -38.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1179
		bodyModel[148].setRotationPoint(5F, -5F, -38.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1180
		bodyModel[149].setRotationPoint(12F, -5F, -38.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1181
		bodyModel[150].setRotationPoint(5F, -7F, -38.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1182
		bodyModel[151].setRotationPoint(5F, -9.5F, -38.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1183
		bodyModel[152].setRotationPoint(5F, -11.5F, -38.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1184
		bodyModel[153].setRotationPoint(7F, -11.5F, -38.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1185
		bodyModel[154].setRotationPoint(10F, -11.5F, -38.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1186
		bodyModel[155].setRotationPoint(12F, -11.5F, -38.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1187
		bodyModel[156].setRotationPoint(12F, -9.5F, -38.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1188
		bodyModel[157].setRotationPoint(12F, -7F, -38.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1189
		bodyModel[158].setRotationPoint(12F, -2.5F, -38.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1190
		bodyModel[159].setRotationPoint(12F, -0.5F, -38.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1191
		bodyModel[160].setRotationPoint(10F, -0.5F, -38.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1192
		bodyModel[161].setRotationPoint(7F, -0.5F, -38.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1193
		bodyModel[162].setRotationPoint(5F, -0.5F, -38.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1194
		bodyModel[163].setRotationPoint(5F, -2.5F, -38.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1195
		bodyModel[164].setRotationPoint(4.5F, -12F, -38F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1196
		bodyModel[165].setRotationPoint(-5.5F, -12F, -38F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1197
		bodyModel[166].setRotationPoint(-6F, -12.5F, -37.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1198
		bodyModel[167].setRotationPoint(2F, -11.5F, -38.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1199
		bodyModel[168].setRotationPoint(0F, -11.5F, -38.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1200
		bodyModel[169].setRotationPoint(-3F, -11.5F, -38.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1201
		bodyModel[170].setRotationPoint(-5F, -11.5F, -38.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1202
		bodyModel[171].setRotationPoint(-5F, -9.5F, -38.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1203
		bodyModel[172].setRotationPoint(-5F, -7F, -38.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1204
		bodyModel[173].setRotationPoint(-5F, -5F, -38.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1205
		bodyModel[174].setRotationPoint(-5F, -2.5F, -38.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1206
		bodyModel[175].setRotationPoint(-5F, -0.5F, -38.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1207
		bodyModel[176].setRotationPoint(-3F, -0.5F, -38.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1208
		bodyModel[177].setRotationPoint(0F, -0.5F, -38.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1209
		bodyModel[178].setRotationPoint(2F, -0.5F, -38.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1210
		bodyModel[179].setRotationPoint(2F, -2.5F, -38.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1211
		bodyModel[180].setRotationPoint(2F, -5F, -38.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1212
		bodyModel[181].setRotationPoint(2F, -7F, -38.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1213
		bodyModel[182].setRotationPoint(2F, -9.5F, -38.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1214
		bodyModel[183].setRotationPoint(27F, -5F, -38.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1215
		bodyModel[184].setRotationPoint(34F, -5F, -38.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1216
		bodyModel[185].setRotationPoint(27F, -7F, -38.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1217
		bodyModel[186].setRotationPoint(27F, -9.5F, -38.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1218
		bodyModel[187].setRotationPoint(27F, -11.5F, -38.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1219
		bodyModel[188].setRotationPoint(29F, -11.5F, -38.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1220
		bodyModel[189].setRotationPoint(32F, -11.5F, -38.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1221
		bodyModel[190].setRotationPoint(34F, -11.5F, -38.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1222
		bodyModel[191].setRotationPoint(34F, -9.5F, -38.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1223
		bodyModel[192].setRotationPoint(34F, -7F, -38.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1224
		bodyModel[193].setRotationPoint(34F, -2.5F, -38.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1225
		bodyModel[194].setRotationPoint(34F, -0.5F, -38.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1226
		bodyModel[195].setRotationPoint(32F, -0.5F, -38.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1227
		bodyModel[196].setRotationPoint(29F, -0.5F, -38.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1228
		bodyModel[197].setRotationPoint(27F, -0.5F, -38.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1229
		bodyModel[198].setRotationPoint(27F, -2.5F, -38.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1230
		bodyModel[199].setRotationPoint(26.5F, -12F, -38F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1231
		bodyModel[200].setRotationPoint(16.5F, -12F, -38F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1232
		bodyModel[201].setRotationPoint(16F, -12.5F, -37.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1233
		bodyModel[202].setRotationPoint(24F, -11.5F, -38.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1234
		bodyModel[203].setRotationPoint(22F, -11.5F, -38.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1235
		bodyModel[204].setRotationPoint(19F, -11.5F, -38.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1236
		bodyModel[205].setRotationPoint(17F, -11.5F, -38.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1237
		bodyModel[206].setRotationPoint(17F, -9.5F, -38.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1238
		bodyModel[207].setRotationPoint(17F, -7F, -38.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1239
		bodyModel[208].setRotationPoint(17F, -5F, -38.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1240
		bodyModel[209].setRotationPoint(17F, -2.5F, -38.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1241
		bodyModel[210].setRotationPoint(17F, -0.5F, -38.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1242
		bodyModel[211].setRotationPoint(19F, -0.5F, -38.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1243
		bodyModel[212].setRotationPoint(22F, -0.5F, -38.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1244
		bodyModel[213].setRotationPoint(24F, -0.5F, -38.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1245
		bodyModel[214].setRotationPoint(24F, -2.5F, -38.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1246
		bodyModel[215].setRotationPoint(24F, -5F, -38.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1247
		bodyModel[216].setRotationPoint(24F, -7F, -38.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1248
		bodyModel[217].setRotationPoint(24F, -9.5F, -38.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1249
		bodyModel[218].setRotationPoint(-50F, -12.5F, 35.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1250
		bodyModel[219].setRotationPoint(-49.5F, -12F, 37F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1251
		bodyModel[220].setRotationPoint(-39.5F, -12F, 37F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1252
		bodyModel[221].setRotationPoint(-17.5F, -12F, 37F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1253
		bodyModel[222].setRotationPoint(-27.5F, -12F, 37F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1254
		bodyModel[223].setRotationPoint(-28F, -12.5F, 35.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1255
		bodyModel[224].setRotationPoint(4.5F, -12F, 37F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1256
		bodyModel[225].setRotationPoint(-5.5F, -12F, 37F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1257
		bodyModel[226].setRotationPoint(-6F, -12.5F, 35.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1258
		bodyModel[227].setRotationPoint(27F, -5F, 37.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1259
		bodyModel[228].setRotationPoint(34F, -5F, 37.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1260
		bodyModel[229].setRotationPoint(27F, -7F, 37.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1261
		bodyModel[230].setRotationPoint(27F, -9.5F, 37.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1262
		bodyModel[231].setRotationPoint(27F, -11.5F, 37.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1263
		bodyModel[232].setRotationPoint(29F, -11.5F, 37.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1264
		bodyModel[233].setRotationPoint(32F, -11.5F, 37.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1265
		bodyModel[234].setRotationPoint(34F, -11.5F, 37.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1266
		bodyModel[235].setRotationPoint(34F, -9.5F, 37.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1267
		bodyModel[236].setRotationPoint(34F, -7F, 37.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1268
		bodyModel[237].setRotationPoint(34F, -2.5F, 37.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1269
		bodyModel[238].setRotationPoint(34F, -0.5F, 37.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1270
		bodyModel[239].setRotationPoint(32F, -0.5F, 37.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1271
		bodyModel[240].setRotationPoint(29F, -0.5F, 37.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1272
		bodyModel[241].setRotationPoint(27F, -0.5F, 37.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1273
		bodyModel[242].setRotationPoint(27F, -2.5F, 37.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1274
		bodyModel[243].setRotationPoint(26.5F, -12F, 37F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1275
		bodyModel[244].setRotationPoint(16.5F, -12F, 37F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 20, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1276
		bodyModel[245].setRotationPoint(16F, -12.5F, 35.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1277
		bodyModel[246].setRotationPoint(24F, -11.5F, 37.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1278
		bodyModel[247].setRotationPoint(22F, -11.5F, 37.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1279
		bodyModel[248].setRotationPoint(19F, -11.5F, 37.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1280
		bodyModel[249].setRotationPoint(17F, -11.5F, 37.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1281
		bodyModel[250].setRotationPoint(17F, -9.5F, 37.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1282
		bodyModel[251].setRotationPoint(17F, -7F, 37.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1283
		bodyModel[252].setRotationPoint(17F, -5F, 37.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1284
		bodyModel[253].setRotationPoint(17F, -2.5F, 37.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1285
		bodyModel[254].setRotationPoint(17F, -0.5F, 37.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1286
		bodyModel[255].setRotationPoint(19F, -0.5F, 37.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1287
		bodyModel[256].setRotationPoint(22F, -0.5F, 37.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1288
		bodyModel[257].setRotationPoint(24F, -0.5F, 37.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1289
		bodyModel[258].setRotationPoint(24F, -2.5F, 37.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1290
		bodyModel[259].setRotationPoint(24F, -5F, 37.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1291
		bodyModel[260].setRotationPoint(24F, -7F, 37.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1292
		bodyModel[261].setRotationPoint(24F, -9.5F, 37.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1293
		bodyModel[262].setRotationPoint(-49F, -11.5F, 37.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1294
		bodyModel[263].setRotationPoint(-42F, -11.5F, 37.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1295
		bodyModel[264].setRotationPoint(-44F, -11.5F, 37.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		bodyModel[265].setRotationPoint(-47F, -11.5F, 37.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1297
		bodyModel[266].setRotationPoint(-49F, -0.5F, 37.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1298
		bodyModel[267].setRotationPoint(-42F, -0.5F, 37.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1299
		bodyModel[268].setRotationPoint(-44F, -0.5F, 37.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1300
		bodyModel[269].setRotationPoint(-47F, -0.5F, 37.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1301
		bodyModel[270].setRotationPoint(-49F, -2.5F, 37.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1302
		bodyModel[271].setRotationPoint(-42F, -2.5F, 37.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1303
		bodyModel[272].setRotationPoint(-42F, -9.5F, 37.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1304
		bodyModel[273].setRotationPoint(-49F, -9.5F, 37.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1305
		bodyModel[274].setRotationPoint(-49F, -5F, 37.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1306
		bodyModel[275].setRotationPoint(-42F, -5F, 37.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1307
		bodyModel[276].setRotationPoint(-49F, -7F, 37.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1308
		bodyModel[277].setRotationPoint(-42F, -7F, 37.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1309
		bodyModel[278].setRotationPoint(-39F, -5F, 37.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1310
		bodyModel[279].setRotationPoint(-32F, -5F, 37.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1311
		bodyModel[280].setRotationPoint(-39F, -7F, 37.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1312
		bodyModel[281].setRotationPoint(-39F, -9.5F, 37.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1313
		bodyModel[282].setRotationPoint(-39F, -11.5F, 37.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1314
		bodyModel[283].setRotationPoint(-37F, -11.5F, 37.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1315
		bodyModel[284].setRotationPoint(-34F, -11.5F, 37.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1316
		bodyModel[285].setRotationPoint(-32F, -11.5F, 37.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1317
		bodyModel[286].setRotationPoint(-32F, -9.5F, 37.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1318
		bodyModel[287].setRotationPoint(-32F, -7F, 37.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1319
		bodyModel[288].setRotationPoint(-32F, -2.5F, 37.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1320
		bodyModel[289].setRotationPoint(-32F, -0.5F, 37.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1321
		bodyModel[290].setRotationPoint(-34F, -0.5F, 37.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1322
		bodyModel[291].setRotationPoint(-37F, -0.5F, 37.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1323
		bodyModel[292].setRotationPoint(-39F, -0.5F, 37.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1324
		bodyModel[293].setRotationPoint(-39F, -2.5F, 37.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1325
		bodyModel[294].setRotationPoint(-17F, -5F, 37.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1326
		bodyModel[295].setRotationPoint(-10F, -5F, 37.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1327
		bodyModel[296].setRotationPoint(-17F, -7F, 37.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1328
		bodyModel[297].setRotationPoint(-17F, -9.5F, 37.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1329
		bodyModel[298].setRotationPoint(-17F, -11.5F, 37.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1330
		bodyModel[299].setRotationPoint(-15F, -11.5F, 37.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1331
		bodyModel[300].setRotationPoint(-12F, -11.5F, 37.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1332
		bodyModel[301].setRotationPoint(-10F, -11.5F, 37.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1333
		bodyModel[302].setRotationPoint(-10F, -9.5F, 37.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1334
		bodyModel[303].setRotationPoint(-10F, -7F, 37.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1335
		bodyModel[304].setRotationPoint(-10F, -2.5F, 37.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1336
		bodyModel[305].setRotationPoint(-10F, -0.5F, 37.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1337
		bodyModel[306].setRotationPoint(-12F, -0.5F, 37.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1338
		bodyModel[307].setRotationPoint(-15F, -0.5F, 37.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1339
		bodyModel[308].setRotationPoint(-17F, -0.5F, 37.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1340
		bodyModel[309].setRotationPoint(-17F, -2.5F, 37.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1341
		bodyModel[310].setRotationPoint(-20F, -11.5F, 37.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1342
		bodyModel[311].setRotationPoint(-22F, -11.5F, 37.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1343
		bodyModel[312].setRotationPoint(-25F, -11.5F, 37.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1344
		bodyModel[313].setRotationPoint(-27F, -11.5F, 37.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1345
		bodyModel[314].setRotationPoint(-27F, -9.5F, 37.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1346
		bodyModel[315].setRotationPoint(-27F, -7F, 37.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1347
		bodyModel[316].setRotationPoint(-27F, -5F, 37.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1348
		bodyModel[317].setRotationPoint(-27F, -2.5F, 37.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1349
		bodyModel[318].setRotationPoint(-27F, -0.5F, 37.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1350
		bodyModel[319].setRotationPoint(-25F, -0.5F, 37.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1351
		bodyModel[320].setRotationPoint(-22F, -0.5F, 37.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1352
		bodyModel[321].setRotationPoint(-20F, -0.5F, 37.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[322].setRotationPoint(-20F, -2.5F, 37.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1354
		bodyModel[323].setRotationPoint(-20F, -5F, 37.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[324].setRotationPoint(-20F, -7F, 37.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[325].setRotationPoint(-20F, -9.5F, 37.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1357
		bodyModel[326].setRotationPoint(5F, -5F, 37.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[327].setRotationPoint(12F, -5F, 37.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1359
		bodyModel[328].setRotationPoint(5F, -7F, 37.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1360
		bodyModel[329].setRotationPoint(5F, -9.5F, 37.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1361
		bodyModel[330].setRotationPoint(5F, -11.5F, 37.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1362
		bodyModel[331].setRotationPoint(7F, -11.5F, 37.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1363
		bodyModel[332].setRotationPoint(10F, -11.5F, 37.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1364
		bodyModel[333].setRotationPoint(12F, -11.5F, 37.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1365
		bodyModel[334].setRotationPoint(12F, -9.5F, 37.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1366
		bodyModel[335].setRotationPoint(12F, -7F, 37.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1367
		bodyModel[336].setRotationPoint(12F, -2.5F, 37.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1368
		bodyModel[337].setRotationPoint(12F, -0.5F, 37.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1369
		bodyModel[338].setRotationPoint(10F, -0.5F, 37.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1370
		bodyModel[339].setRotationPoint(7F, -0.5F, 37.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1371
		bodyModel[340].setRotationPoint(5F, -0.5F, 37.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1372
		bodyModel[341].setRotationPoint(5F, -2.5F, 37.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1373
		bodyModel[342].setRotationPoint(2F, -11.5F, 37.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1374
		bodyModel[343].setRotationPoint(0F, -11.5F, 37.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1375
		bodyModel[344].setRotationPoint(-3F, -11.5F, 37.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1376
		bodyModel[345].setRotationPoint(-5F, -11.5F, 37.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1377
		bodyModel[346].setRotationPoint(-5F, -9.5F, 37.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1378
		bodyModel[347].setRotationPoint(-5F, -7F, 37.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1379
		bodyModel[348].setRotationPoint(-5F, -5F, 37.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1380
		bodyModel[349].setRotationPoint(-5F, -2.5F, 37.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1381
		bodyModel[350].setRotationPoint(-5F, -0.5F, 37.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1382
		bodyModel[351].setRotationPoint(-3F, -0.5F, 37.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1383
		bodyModel[352].setRotationPoint(0F, -0.5F, 37.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1384
		bodyModel[353].setRotationPoint(2F, -0.5F, 37.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1385
		bodyModel[354].setRotationPoint(2F, -2.5F, 37.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1386
		bodyModel[355].setRotationPoint(2F, -5F, 37.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1387
		bodyModel[356].setRotationPoint(2F, -7F, 37.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1388
		bodyModel[357].setRotationPoint(2F, -9.5F, 37.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1389
		bodyModel[358].setRotationPoint(-30F, -11.5F, -37F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1390
		bodyModel[359].setRotationPoint(-30F, -3.5F, -37F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1391
		bodyModel[360].setRotationPoint(-30F, -6.5F, -37F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1392
		bodyModel[361].setRotationPoint(-8F, -6.5F, -37F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1393
		bodyModel[362].setRotationPoint(-8F, -3.5F, -37F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1394
		bodyModel[363].setRotationPoint(-8F, -11.5F, -37F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1395
		bodyModel[364].setRotationPoint(14F, -6.5F, -37F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1396
		bodyModel[365].setRotationPoint(14F, -3.5F, -37F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1397
		bodyModel[366].setRotationPoint(14F, -11.5F, -37F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1398
		bodyModel[367].setRotationPoint(-30F, -11.5F, 36F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1399
		bodyModel[368].setRotationPoint(-30F, -3.5F, 36F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1400
		bodyModel[369].setRotationPoint(-30F, -6.5F, 36F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1401
		bodyModel[370].setRotationPoint(-8F, -6.5F, 36F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1402
		bodyModel[371].setRotationPoint(-8F, -3.5F, 36F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1403
		bodyModel[372].setRotationPoint(-8F, -11.5F, 36F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1404
		bodyModel[373].setRotationPoint(14F, -6.5F, 36F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1405
		bodyModel[374].setRotationPoint(14F, -3.5F, 36F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1406
		bodyModel[375].setRotationPoint(14F, -11.5F, 36F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1407
		bodyModel[376].setRotationPoint(-68F, -12.5F, -37.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1408
		bodyModel[377].setRotationPoint(-67.5F, -12F, -38F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 28, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 1410
		bodyModel[378].setRotationPoint(38F, -12.5F, -37.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1411
		bodyModel[379].setRotationPoint(66F, -12.5F, -37.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,-6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1412
		bodyModel[380].setRotationPoint(59F, -15.5F, -37.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1413
		bodyModel[381].setRotationPoint(36F, -3.5F, -37F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1414
		bodyModel[382].setRotationPoint(36F, -6.5F, -37F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1415
		bodyModel[383].setRotationPoint(36F, -11.5F, -37F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1416
		bodyModel[384].setRotationPoint(-52F, -11.5F, -37F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1417
		bodyModel[385].setRotationPoint(-52F, -3.5F, -37F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1418
		bodyModel[386].setRotationPoint(-52F, -6.5F, -37F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 16, 14, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1419
		bodyModel[387].setRotationPoint(-68F, -12.5F, 35.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1420
		bodyModel[388].setRotationPoint(-67.5F, -12F, 37F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 28, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 1421
		bodyModel[389].setRotationPoint(38F, -12.5F, 35.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1422
		bodyModel[390].setRotationPoint(66F, -12.5F, 35.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F,-6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1423
		bodyModel[391].setRotationPoint(59F, -15.5F, 35.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1424
		bodyModel[392].setRotationPoint(36F, -3.5F, 36F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1425
		bodyModel[393].setRotationPoint(36F, -6.5F, 36F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1426
		bodyModel[394].setRotationPoint(36F, -11.5F, 36F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1427
		bodyModel[395].setRotationPoint(-52F, -11.5F, 36F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1428
		bodyModel[396].setRotationPoint(-52F, -3.5F, 36F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1429
		bodyModel[397].setRotationPoint(-52F, -6.5F, 36F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 1430
		bodyModel[398].setRotationPoint(41F, -17.5F, -5.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1431
		bodyModel[399].setRotationPoint(43F, -17.5F, -5.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 1432
		bodyModel[400].setRotationPoint(46F, -17.5F, -5.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1433
		turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1434
		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1435
		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1436
		turretModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1437
		turretModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1438
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1439
		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1440
		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1441
		turretModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1442
		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1443
		turretModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1444
		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1445
		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1446
		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1447
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1448
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1449
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1450
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1451
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1452
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1453
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1454
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1455
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1461
		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1463
		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1464
		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1465
		turretModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1466
		turretModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1467
		turretModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1468
		turretModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1469
		turretModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1470
		turretModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1471
		turretModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1472
		turretModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1473
		turretModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1474
		turretModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1475
		turretModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1476
		turretModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1477
		turretModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1478
		turretModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1479
		turretModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1480
		turretModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1481
		turretModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1482
		turretModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1483
		turretModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1484
		turretModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1485
		turretModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1486
		turretModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1487
		turretModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1488
		turretModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1489
		turretModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1490
		turretModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1491

		turretModel[0].addShapeBox(0F, 0F, 0F, 25, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1433
		turretModel[0].setRotationPoint(-23F, -28.5F, -15F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 23, 12, 10, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1434
		turretModel[1].setRotationPoint(2F, -28.5F, -15F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 23, 12, 11, 0F,0F, -9F, 0F, -9F, -9F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1435
		turretModel[2].setRotationPoint(2F, -28.5F, -26F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 25, 12, 11, 0F,0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1436
		turretModel[3].setRotationPoint(-23F, -28.5F, -26F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 23, 12, 10, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1437
		turretModel[4].setRotationPoint(2F, -28.5F, 5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 23, 12, 11, 0F,0F, 0F, 0F, 0F, -6F, 0F, -9F, -9F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -3F, 0F, 0F, 0F); // Box 1438
		turretModel[5].setRotationPoint(2F, -28.5F, 15F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 25, 12, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1439
		turretModel[6].setRotationPoint(-23F, -28.5F, 15F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 27, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 1440
		turretModel[7].setRotationPoint(2F, -26.5F, -5F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 27, 2, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1441
		turretModel[8].setRotationPoint(2F, -28.5F, -5F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 27, 2, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 1442
		turretModel[9].setRotationPoint(2F, -16.5F, -5F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0F, 0F, 0F, -4F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1443
		turretModel[10].setRotationPoint(25F, -22.5F, -15F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 1444
		turretModel[11].setRotationPoint(25F, -22.5F, 5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 18, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1445
		turretModel[12].setRotationPoint(2F, -26.5F, -13F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1446
		turretModel[13].setRotationPoint(19.5F, -26F, -12.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1447
		turretModel[14].setRotationPoint(19.5F, -26F, -8.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1448
		turretModel[15].setRotationPoint(10F, -31.5F, -12F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1449
		turretModel[16].setRotationPoint(3F, -31.5F, -12F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1450
		turretModel[17].setRotationPoint(17F, -31F, -11.5F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1451
		turretModel[18].setRotationPoint(17F, -30F, -11.5F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1452
		turretModel[19].setRotationPoint(17F, -29F, -11.5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 18, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1453
		turretModel[20].setRotationPoint(2F, -26.5F, 6F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1454
		turretModel[21].setRotationPoint(19.5F, -26F, 10.5F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1455
		turretModel[22].setRotationPoint(19.5F, -26F, 6.5F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1461
		turretModel[23].setRotationPoint(-22F, -27.5F, -22F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1463
		turretModel[24].setRotationPoint(-22F, -27.5F, -25F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1464
		turretModel[25].setRotationPoint(-5F, -27.5F, -25F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1465
		turretModel[26].setRotationPoint(-5F, -27.5F, -22F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1466
		turretModel[27].setRotationPoint(-13F, -27.5F, -25F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1467
		turretModel[28].setRotationPoint(-13F, -27.5F, -22F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1468
		turretModel[29].setRotationPoint(-22F, -27.5F, 16F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1469
		turretModel[30].setRotationPoint(-22F, -27.5F, 22F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1470
		turretModel[31].setRotationPoint(-5F, -27.5F, 22F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1471
		turretModel[32].setRotationPoint(-5F, -27.5F, 16F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1472
		turretModel[33].setRotationPoint(-13F, -27.5F, 22F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1473
		turretModel[34].setRotationPoint(-13F, -27.5F, 16F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1474
		turretModel[35].setRotationPoint(-18F, -30.5F, -13F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1475
		turretModel[36].setRotationPoint(-9F, -30.5F, -13F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1476
		turretModel[37].setRotationPoint(-9F, -30.5F, 1F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 1477
		turretModel[38].setRotationPoint(-9F, -30.5F, 9F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 1478
		turretModel[39].setRotationPoint(-18F, -30.5F, 9F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 11, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1479
		turretModel[40].setRotationPoint(-34F, -28.5F, -15F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 11, 12, 11, 0F,-6F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1480
		turretModel[41].setRotationPoint(-34F, -28.5F, -26F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 11, 12, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 1481
		turretModel[42].setRotationPoint(-34F, -28.5F, 15F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 17, 12, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1482
		turretModel[43].setRotationPoint(-51F, -28.5F, -15F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 28, 3, 30, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1483
		turretModel[44].setRotationPoint(-51F, -31.5F, -15F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1484
		turretModel[45].setRotationPoint(-46F, -26.5F, -17F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1485
		turretModel[46].setRotationPoint(-40F, -21.5F, -17F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 1486
		turretModel[47].setRotationPoint(-46F, -26.5F, 15F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 1487
		turretModel[48].setRotationPoint(-40F, -21.5F, 15F);

		turretModel[49].addTrapezoid(0F, 0F, 0F, 17, 1, 7, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 1488
		turretModel[49].setRotationPoint(-46F, -32.5F, -13F);

		turretModel[50].addTrapezoid(0F, 0F, 0F, 9, 1, 17, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 1489
		turretModel[50].setRotationPoint(-46F, -32.5F, -3F);

		turretModel[51].addTrapezoid(0F, 0F, 0F, 3, 1, 17, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 1490
		turretModel[51].setRotationPoint(-36F, -32.5F, -3F);

		turretModel[52].addTrapezoid(0F, 0F, 0F, 3, 1, 17, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 1491
		turretModel[52].setRotationPoint(-32F, -32.5F, -3F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1492
		barrelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1493
		barrelModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1494
		barrelModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1495
		barrelModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1496
		barrelModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1497
		barrelModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1498
		barrelModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1499
		barrelModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1500
		barrelModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1501
		barrelModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1502
		barrelModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1503
		barrelModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1504
		barrelModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1505
		barrelModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1506
		barrelModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1507
		barrelModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1508
		barrelModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1509
		barrelModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1510
		barrelModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1511
		barrelModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1512
		barrelModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1513
		barrelModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1514
		barrelModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1515
		barrelModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1516
		barrelModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1517
		barrelModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1518
		barrelModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1519
		barrelModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1520
		barrelModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1521

		barrelModel[0].addShapeBox(-3F, -1F, -3F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1492
		barrelModel[0].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[1].addShapeBox(-3F, -3F, -3F, 20, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1493
		barrelModel[1].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[2].addShapeBox(-3F, 1F, -3F, 20, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1494
		barrelModel[2].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[3].addShapeBox(16F, -0.5F, -1.5F, 82, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1495
		barrelModel[3].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[4].addShapeBox(16F, -1.5F, -1.5F, 82, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1496
		barrelModel[4].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[5].addShapeBox(16F, 0.5F, -1.5F, 82, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1497
		barrelModel[5].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[6].addShapeBox(18F, -1F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1498
		barrelModel[6].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[7].addShapeBox(18F, -2F, -2F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1499
		barrelModel[7].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[8].addShapeBox(18F, -2F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1500
		barrelModel[8].setRotationPoint(29F, -18.5F, 0F);

		barrelModel[9].addShapeBox(46F, -2F, -2F, 19, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1501
		barrelModel[9].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[10].addShapeBox(46F, -1F, -2F, 19, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1502
		barrelModel[10].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[11].addShapeBox(46F, -2F, -2F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1503
		barrelModel[11].setRotationPoint(29F, -18.5F, 0F);

		barrelModel[12].addShapeBox(23F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1504
		barrelModel[12].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[13].addShapeBox(23F, -1F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1505
		barrelModel[13].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[14].addShapeBox(23F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1506
		barrelModel[14].setRotationPoint(29F, -18.5F, 0F);

		barrelModel[15].addShapeBox(28F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1507
		barrelModel[15].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[16].addShapeBox(28F, -1F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1508
		barrelModel[16].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[17].addShapeBox(28F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1509
		barrelModel[17].setRotationPoint(29F, -18.5F, 0F);

		barrelModel[18].addShapeBox(33F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1510
		barrelModel[18].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[19].addShapeBox(33F, -1F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1511
		barrelModel[19].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[20].addShapeBox(33F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1512
		barrelModel[20].setRotationPoint(29F, -18.5F, 0F);

		barrelModel[21].addShapeBox(38F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1513
		barrelModel[21].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[22].addShapeBox(38F, -1F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1514
		barrelModel[22].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[23].addShapeBox(38F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1515
		barrelModel[23].setRotationPoint(29F, -18.5F, 0F);

		barrelModel[24].addShapeBox(43F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1516
		barrelModel[24].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[25].addShapeBox(43F, -1F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1517
		barrelModel[25].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[26].addShapeBox(43F, -2F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1518
		barrelModel[26].setRotationPoint(29F, -18.5F, 0F);

		barrelModel[27].addShapeBox(90F, -2F, -2F, 6, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1519
		barrelModel[27].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[28].addShapeBox(90F, -1F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1520
		barrelModel[28].setRotationPoint(29F, -21.5F, 0F);

		barrelModel[29].addShapeBox(90F, -2F, -2F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1521
		barrelModel[29].setRotationPoint(29F, -18.5F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Import Box512
		leftTrackModel[1] = new ModelRendererTurbo(this, 300, 1365, textureX, textureY); // Import Box513
		leftTrackModel[2] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Import Box514
		leftTrackModel[3] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box515
		leftTrackModel[4] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box516
		leftTrackModel[5] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box517
		leftTrackModel[6] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box518
		leftTrackModel[7] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box519
		leftTrackModel[8] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box520
		leftTrackModel[9] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box521
		leftTrackModel[10] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box522
		leftTrackModel[11] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box523
		leftTrackModel[12] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box524
		leftTrackModel[13] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box525
		leftTrackModel[14] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box526
		leftTrackModel[15] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box527
		leftTrackModel[16] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box528
		leftTrackModel[17] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box529
		leftTrackModel[18] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box530
		leftTrackModel[19] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box531
		leftTrackModel[20] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box532
		leftTrackModel[21] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box533
		leftTrackModel[22] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box534
		leftTrackModel[23] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box535
		leftTrackModel[24] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box536
		leftTrackModel[25] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box537
		leftTrackModel[26] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import Box538
		leftTrackModel[27] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box539
		leftTrackModel[28] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box540
		leftTrackModel[29] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box541
		leftTrackModel[30] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import Box542
		leftTrackModel[31] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box543
		leftTrackModel[32] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box544
		leftTrackModel[33] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box545
		leftTrackModel[34] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import Box546
		leftTrackModel[35] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box547
		leftTrackModel[36] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box548
		leftTrackModel[37] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box549
		leftTrackModel[38] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import Box550
		leftTrackModel[39] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box551
		leftTrackModel[40] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box552
		leftTrackModel[41] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box553
		leftTrackModel[42] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box554
		leftTrackModel[43] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box555
		leftTrackModel[44] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box556
		leftTrackModel[45] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box557
		leftTrackModel[46] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box558
		leftTrackModel[47] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box559
		leftTrackModel[48] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box560
		leftTrackModel[49] = new ModelRendererTurbo(this, 300, 1451, textureX, textureY); // Import Box561
		leftTrackModel[50] = new ModelRendererTurbo(this, 300, 1463, textureX, textureY); // Import Box562
		leftTrackModel[51] = new ModelRendererTurbo(this, 300, 1474, textureX, textureY); // Import Box563
		leftTrackModel[52] = new ModelRendererTurbo(this, 300, 1484, textureX, textureY); // Import Box564
		leftTrackModel[53] = new ModelRendererTurbo(this, 300, 1495, textureX, textureY); // Import Box565
		leftTrackModel[54] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import Box566
		leftTrackModel[55] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import Box567
		leftTrackModel[56] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box568
		leftTrackModel[57] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box569
		leftTrackModel[58] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box570
		leftTrackModel[59] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box571
		leftTrackModel[60] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box572
		leftTrackModel[61] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box573
		leftTrackModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box605
		leftTrackModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box606
		leftTrackModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box607
		leftTrackModel[65] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 130
		leftTrackModel[66] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 131
		leftTrackModel[67] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 132
		leftTrackModel[68] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 133
		leftTrackModel[69] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 134
		leftTrackModel[70] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 136
		leftTrackModel[71] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 137
		leftTrackModel[72] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 152
		leftTrackModel[73] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 153
		leftTrackModel[74] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 154
		leftTrackModel[75] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 155
		leftTrackModel[76] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 156
		leftTrackModel[77] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 157
		leftTrackModel[78] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 165
		leftTrackModel[79] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 166
		leftTrackModel[80] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 167
		leftTrackModel[81] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 168
		leftTrackModel[82] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 169
		leftTrackModel[83] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 170
		leftTrackModel[84] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 178
		leftTrackModel[85] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 179
		leftTrackModel[86] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 180
		leftTrackModel[87] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 181
		leftTrackModel[88] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 182
		leftTrackModel[89] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 183
		leftTrackModel[90] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 191
		leftTrackModel[91] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 192
		leftTrackModel[92] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 193
		leftTrackModel[93] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 194
		leftTrackModel[94] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 195
		leftTrackModel[95] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 196
		leftTrackModel[96] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 204
		leftTrackModel[97] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 205
		leftTrackModel[98] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 206
		leftTrackModel[99] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 207
		leftTrackModel[100] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 208
		leftTrackModel[101] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 209
		leftTrackModel[102] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 217
		leftTrackModel[103] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 218
		leftTrackModel[104] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 219
		leftTrackModel[105] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 220
		leftTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 221
		leftTrackModel[107] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 222
		leftTrackModel[108] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 230
		leftTrackModel[109] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 231
		leftTrackModel[110] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 232
		leftTrackModel[111] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 233
		leftTrackModel[112] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 234
		leftTrackModel[113] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 235
		leftTrackModel[114] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 243
		leftTrackModel[115] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 244
		leftTrackModel[116] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 245
		leftTrackModel[117] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 246
		leftTrackModel[118] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 247
		leftTrackModel[119] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 248
		leftTrackModel[120] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 256
		leftTrackModel[121] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 257
		leftTrackModel[122] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 258
		leftTrackModel[123] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 259
		leftTrackModel[124] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 260
		leftTrackModel[125] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 261
		leftTrackModel[126] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 269
		leftTrackModel[127] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 270
		leftTrackModel[128] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 271
		leftTrackModel[129] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 272
		leftTrackModel[130] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 273
		leftTrackModel[131] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 274
		leftTrackModel[132] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 282
		leftTrackModel[133] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 283
		leftTrackModel[134] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 284
		leftTrackModel[135] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 285
		leftTrackModel[136] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 286
		leftTrackModel[137] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 287
		leftTrackModel[138] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 295
		leftTrackModel[139] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 296
		leftTrackModel[140] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 297
		leftTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 298
		leftTrackModel[142] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 299
		leftTrackModel[143] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 300
		leftTrackModel[144] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 308
		leftTrackModel[145] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 309
		leftTrackModel[146] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 310
		leftTrackModel[147] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 311
		leftTrackModel[148] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 312
		leftTrackModel[149] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 313
		leftTrackModel[150] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 321
		leftTrackModel[151] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 322
		leftTrackModel[152] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 323
		leftTrackModel[153] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 324
		leftTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 325
		leftTrackModel[155] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 326
		leftTrackModel[156] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 334
		leftTrackModel[157] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 335
		leftTrackModel[158] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 336
		leftTrackModel[159] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 337
		leftTrackModel[160] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 338
		leftTrackModel[161] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 339
		leftTrackModel[162] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 347
		leftTrackModel[163] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 348
		leftTrackModel[164] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 349
		leftTrackModel[165] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 350
		leftTrackModel[166] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 351
		leftTrackModel[167] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 352
		leftTrackModel[168] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 353
		leftTrackModel[169] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 354
		leftTrackModel[170] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 355
		leftTrackModel[171] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 356
		leftTrackModel[172] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 357
		leftTrackModel[173] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 358
		leftTrackModel[174] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 359
		leftTrackModel[175] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 360
		leftTrackModel[176] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 361
		leftTrackModel[177] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 362
		leftTrackModel[178] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 363
		leftTrackModel[179] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 364
		leftTrackModel[180] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 365
		leftTrackModel[181] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 366
		leftTrackModel[182] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 367
		leftTrackModel[183] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 368
		leftTrackModel[184] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 369
		leftTrackModel[185] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 370
		leftTrackModel[186] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 371
		leftTrackModel[187] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 372
		leftTrackModel[188] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 373
		leftTrackModel[189] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 374
		leftTrackModel[190] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 375
		leftTrackModel[191] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 376
		leftTrackModel[192] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 384
		leftTrackModel[193] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 385
		leftTrackModel[194] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 386
		leftTrackModel[195] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 387
		leftTrackModel[196] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 388
		leftTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 389
		leftTrackModel[198] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 390
		leftTrackModel[199] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 398
		leftTrackModel[200] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 399
		leftTrackModel[201] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 400
		leftTrackModel[202] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 401
		leftTrackModel[203] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 402
		leftTrackModel[204] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 403
		leftTrackModel[205] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 404
		leftTrackModel[206] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 412
		leftTrackModel[207] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 413
		leftTrackModel[208] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 414
		leftTrackModel[209] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 415
		leftTrackModel[210] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 416
		leftTrackModel[211] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 417
		leftTrackModel[212] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 418
		leftTrackModel[213] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 426
		leftTrackModel[214] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 427
		leftTrackModel[215] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 428
		leftTrackModel[216] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 429
		leftTrackModel[217] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 430
		leftTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 431
		leftTrackModel[219] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 432
		leftTrackModel[220] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 440
		leftTrackModel[221] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 441
		leftTrackModel[222] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 442
		leftTrackModel[223] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 443
		leftTrackModel[224] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 444
		leftTrackModel[225] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 445
		leftTrackModel[226] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 446
		leftTrackModel[227] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 454
		leftTrackModel[228] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 455
		leftTrackModel[229] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 456
		leftTrackModel[230] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 457
		leftTrackModel[231] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 458
		leftTrackModel[232] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 459
		leftTrackModel[233] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 460
		leftTrackModel[234] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 468
		leftTrackModel[235] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 469
		leftTrackModel[236] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 470
		leftTrackModel[237] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 471
		leftTrackModel[238] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 472
		leftTrackModel[239] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 473
		leftTrackModel[240] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 474
		leftTrackModel[241] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 482
		leftTrackModel[242] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 483
		leftTrackModel[243] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 484
		leftTrackModel[244] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 485
		leftTrackModel[245] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 486
		leftTrackModel[246] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 487
		leftTrackModel[247] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 488
		leftTrackModel[248] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 496
		leftTrackModel[249] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 497
		leftTrackModel[250] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 498
		leftTrackModel[251] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 499
		leftTrackModel[252] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 500
		leftTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 501
		leftTrackModel[254] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 502
		leftTrackModel[255] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 510
		leftTrackModel[256] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 511
		leftTrackModel[257] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 512
		leftTrackModel[258] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 513
		leftTrackModel[259] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 514
		leftTrackModel[260] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 515
		leftTrackModel[261] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 516
		leftTrackModel[262] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 524
		leftTrackModel[263] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 525
		leftTrackModel[264] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 526
		leftTrackModel[265] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 527
		leftTrackModel[266] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 528
		leftTrackModel[267] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 529
		leftTrackModel[268] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 530
		leftTrackModel[269] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 538
		leftTrackModel[270] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 539
		leftTrackModel[271] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 540
		leftTrackModel[272] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 541
		leftTrackModel[273] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 542
		leftTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 543
		leftTrackModel[275] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 544
		leftTrackModel[276] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 552
		leftTrackModel[277] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 553
		leftTrackModel[278] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 554
		leftTrackModel[279] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 555
		leftTrackModel[280] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 556
		leftTrackModel[281] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 557
		leftTrackModel[282] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 558
		leftTrackModel[283] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 566
		leftTrackModel[284] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 567
		leftTrackModel[285] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 568
		leftTrackModel[286] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 569
		leftTrackModel[287] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 570
		leftTrackModel[288] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 571
		leftTrackModel[289] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 572
		leftTrackModel[290] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 580
		leftTrackModel[291] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 581
		leftTrackModel[292] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 582
		leftTrackModel[293] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 583
		leftTrackModel[294] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 584
		leftTrackModel[295] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 585
		leftTrackModel[296] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 586
		leftTrackModel[297] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 594
		leftTrackModel[298] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 595
		leftTrackModel[299] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 596
		leftTrackModel[300] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 597
		leftTrackModel[301] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 598
		leftTrackModel[302] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 599
		leftTrackModel[303] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 600
		leftTrackModel[304] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 608
		leftTrackModel[305] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 609
		leftTrackModel[306] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 610
		leftTrackModel[307] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 611
		leftTrackModel[308] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 612
		leftTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 613
		leftTrackModel[310] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 614
		leftTrackModel[311] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 622
		leftTrackModel[312] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 623
		leftTrackModel[313] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 624
		leftTrackModel[314] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 625
		leftTrackModel[315] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 626
		leftTrackModel[316] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 627
		leftTrackModel[317] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 628
		leftTrackModel[318] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 636
		leftTrackModel[319] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 637
		leftTrackModel[320] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 638
		leftTrackModel[321] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 639
		leftTrackModel[322] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 640
		leftTrackModel[323] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 641
		leftTrackModel[324] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 642
		leftTrackModel[325] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 650
		leftTrackModel[326] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 651
		leftTrackModel[327] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 652
		leftTrackModel[328] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 653
		leftTrackModel[329] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 654
		leftTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 655
		leftTrackModel[331] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 656
		leftTrackModel[332] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 664
		leftTrackModel[333] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 665
		leftTrackModel[334] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 666
		leftTrackModel[335] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 667
		leftTrackModel[336] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 668
		leftTrackModel[337] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 669
		leftTrackModel[338] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 670
		leftTrackModel[339] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 678
		leftTrackModel[340] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 679
		leftTrackModel[341] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 680
		leftTrackModel[342] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 681
		leftTrackModel[343] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 682
		leftTrackModel[344] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 683
		leftTrackModel[345] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 684
		leftTrackModel[346] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 692
		leftTrackModel[347] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 693
		leftTrackModel[348] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 694
		leftTrackModel[349] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 695
		leftTrackModel[350] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 696
		leftTrackModel[351] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 697
		leftTrackModel[352] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 698
		leftTrackModel[353] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 706
		leftTrackModel[354] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 707
		leftTrackModel[355] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 708
		leftTrackModel[356] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 709
		leftTrackModel[357] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 710
		leftTrackModel[358] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 711
		leftTrackModel[359] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 712
		leftTrackModel[360] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 720
		leftTrackModel[361] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 721
		leftTrackModel[362] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 722
		leftTrackModel[363] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 723
		leftTrackModel[364] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 724
		leftTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 725
		leftTrackModel[366] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 726
		leftTrackModel[367] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 734
		leftTrackModel[368] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 735
		leftTrackModel[369] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 736
		leftTrackModel[370] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 737
		leftTrackModel[371] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 738
		leftTrackModel[372] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 739
		leftTrackModel[373] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 740
		leftTrackModel[374] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 748
		leftTrackModel[375] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 749
		leftTrackModel[376] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 750
		leftTrackModel[377] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 751
		leftTrackModel[378] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 752
		leftTrackModel[379] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 753
		leftTrackModel[380] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 754
		leftTrackModel[381] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 762
		leftTrackModel[382] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 763
		leftTrackModel[383] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 764
		leftTrackModel[384] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 765
		leftTrackModel[385] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 766
		leftTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 767
		leftTrackModel[387] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 768
		leftTrackModel[388] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 776
		leftTrackModel[389] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 777
		leftTrackModel[390] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 778
		leftTrackModel[391] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 779
		leftTrackModel[392] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 780
		leftTrackModel[393] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 781
		leftTrackModel[394] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 782
		leftTrackModel[395] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 790
		leftTrackModel[396] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 791
		leftTrackModel[397] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 792
		leftTrackModel[398] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 793
		leftTrackModel[399] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 794
		leftTrackModel[400] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 795
		leftTrackModel[401] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 796
		leftTrackModel[402] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 804
		leftTrackModel[403] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 805
		leftTrackModel[404] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 806
		leftTrackModel[405] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 807
		leftTrackModel[406] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 808
		leftTrackModel[407] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 809
		leftTrackModel[408] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 810
		leftTrackModel[409] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 818
		leftTrackModel[410] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 819
		leftTrackModel[411] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 820
		leftTrackModel[412] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 821
		leftTrackModel[413] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 822
		leftTrackModel[414] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 823
		leftTrackModel[415] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 824
		leftTrackModel[416] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 832
		leftTrackModel[417] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 833
		leftTrackModel[418] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 834
		leftTrackModel[419] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 835
		leftTrackModel[420] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 836
		leftTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 837
		leftTrackModel[422] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 838
		leftTrackModel[423] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 846
		leftTrackModel[424] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 847
		leftTrackModel[425] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 848
		leftTrackModel[426] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 849
		leftTrackModel[427] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 850
		leftTrackModel[428] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 851
		leftTrackModel[429] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 852
		leftTrackModel[430] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 860
		leftTrackModel[431] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 861
		leftTrackModel[432] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 862
		leftTrackModel[433] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 863
		leftTrackModel[434] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 864
		leftTrackModel[435] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 865
		leftTrackModel[436] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 866
		leftTrackModel[437] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 874
		leftTrackModel[438] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 875
		leftTrackModel[439] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 876
		leftTrackModel[440] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 877
		leftTrackModel[441] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 878
		leftTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 879
		leftTrackModel[443] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 880
		leftTrackModel[444] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 888
		leftTrackModel[445] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 889
		leftTrackModel[446] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 890
		leftTrackModel[447] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 891
		leftTrackModel[448] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 892
		leftTrackModel[449] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 893
		leftTrackModel[450] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 894
		leftTrackModel[451] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 902
		leftTrackModel[452] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 903
		leftTrackModel[453] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 904
		leftTrackModel[454] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 905
		leftTrackModel[455] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 906
		leftTrackModel[456] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 907
		leftTrackModel[457] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 908
		leftTrackModel[458] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 916
		leftTrackModel[459] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 917
		leftTrackModel[460] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 918
		leftTrackModel[461] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 919
		leftTrackModel[462] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 920
		leftTrackModel[463] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 921
		leftTrackModel[464] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 922
		leftTrackModel[465] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 930
		leftTrackModel[466] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 931
		leftTrackModel[467] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 932
		leftTrackModel[468] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 933
		leftTrackModel[469] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 934
		leftTrackModel[470] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 935
		leftTrackModel[471] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 936
		leftTrackModel[472] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 944
		leftTrackModel[473] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 945
		leftTrackModel[474] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 946
		leftTrackModel[475] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 947
		leftTrackModel[476] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 948
		leftTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 949
		leftTrackModel[478] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 950
		leftTrackModel[479] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 958
		leftTrackModel[480] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 959
		leftTrackModel[481] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 960
		leftTrackModel[482] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 961
		leftTrackModel[483] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 962
		leftTrackModel[484] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 963
		leftTrackModel[485] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 964
		leftTrackModel[486] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 972
		leftTrackModel[487] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 973
		leftTrackModel[488] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 974
		leftTrackModel[489] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 975
		leftTrackModel[490] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 976
		leftTrackModel[491] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 977
		leftTrackModel[492] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 978
		leftTrackModel[493] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 986
		leftTrackModel[494] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 987
		leftTrackModel[495] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 988
		leftTrackModel[496] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 989
		leftTrackModel[497] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 990
		leftTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 991
		leftTrackModel[499] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 992

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box512
		leftTrackModel[0].setRotationPoint(62F, -11.5F, 22.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box513
		leftTrackModel[1].setRotationPoint(62F, -7.5F, 22.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box514
		leftTrackModel[2].setRotationPoint(62F, -15.5F, 22.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box515
		leftTrackModel[3].setRotationPoint(43.5F, -4F, 24.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box516
		leftTrackModel[4].setRotationPoint(43.5F, 2F, 24.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box517
		leftTrackModel[5].setRotationPoint(45.5F, 6F, 24.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box518
		leftTrackModel[6].setRotationPoint(43.5F, -8F, 24.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box519
		leftTrackModel[7].setRotationPoint(45.5F, -10F, 24.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box520
		leftTrackModel[8].setRotationPoint(27F, -10F, 24.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box521
		leftTrackModel[9].setRotationPoint(25F, -8F, 24.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box522
		leftTrackModel[10].setRotationPoint(25F, -4F, 24.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box523
		leftTrackModel[11].setRotationPoint(25F, 2F, 24.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box524
		leftTrackModel[12].setRotationPoint(27F, 6F, 24.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box525
		leftTrackModel[13].setRotationPoint(3.5F, -10F, 24.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box526
		leftTrackModel[14].setRotationPoint(1.5F, -8F, 24.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box527
		leftTrackModel[15].setRotationPoint(1.5F, -4F, 24.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box528
		leftTrackModel[16].setRotationPoint(1.5F, 2F, 24.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box529
		leftTrackModel[17].setRotationPoint(3.5F, 6F, 24.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box530
		leftTrackModel[18].setRotationPoint(-15.5F, -10F, 24.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box531
		leftTrackModel[19].setRotationPoint(-17.5F, -8F, 24.5F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box532
		leftTrackModel[20].setRotationPoint(-17.5F, -4F, 24.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box533
		leftTrackModel[21].setRotationPoint(-17.5F, 2F, 24.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box534
		leftTrackModel[22].setRotationPoint(-15.5F, 6F, 24.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box535
		leftTrackModel[23].setRotationPoint(-11.5F, -3F, 16.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box536
		leftTrackModel[24].setRotationPoint(-10.5F, -4F, 16.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box537
		leftTrackModel[25].setRotationPoint(5.5F, -4F, 16.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box538
		leftTrackModel[26].setRotationPoint(-2.5F, -12F, 16.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box539
		leftTrackModel[27].setRotationPoint(-9.5F, -2F, 19.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box540
		leftTrackModel[28].setRotationPoint(10.5F, -2F, 19.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box541
		leftTrackModel[29].setRotationPoint(13.5F, -3F, 16.5F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box542
		leftTrackModel[30].setRotationPoint(-2.5F, -12F, 20.5F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box543
		leftTrackModel[31].setRotationPoint(29.5F, -3F, 16.5F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box544
		leftTrackModel[32].setRotationPoint(30.5F, -4F, 16.5F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box545
		leftTrackModel[33].setRotationPoint(46.5F, -4F, 16.5F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box546
		leftTrackModel[34].setRotationPoint(38.5F, -12F, 16.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box547
		leftTrackModel[35].setRotationPoint(31.5F, -2F, 19.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box548
		leftTrackModel[36].setRotationPoint(51.5F, -2F, 19.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box549
		leftTrackModel[37].setRotationPoint(54.5F, -3F, 16.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box550
		leftTrackModel[38].setRotationPoint(38.5F, -12F, 20.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box551
		leftTrackModel[39].setRotationPoint(-36F, -10F, 24.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box552
		leftTrackModel[40].setRotationPoint(-38F, -8F, 24.5F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box553
		leftTrackModel[41].setRotationPoint(-38F, -4F, 24.5F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box554
		leftTrackModel[42].setRotationPoint(-38F, 2F, 24.5F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box555
		leftTrackModel[43].setRotationPoint(-36F, 6F, 24.5F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box556
		leftTrackModel[44].setRotationPoint(-54.5F, -10F, 24.5F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box557
		leftTrackModel[45].setRotationPoint(-56.5F, -8F, 24.5F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box558
		leftTrackModel[46].setRotationPoint(-56.5F, -4F, 24.5F);

		leftTrackModel[47].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box559
		leftTrackModel[47].setRotationPoint(-56.5F, 2F, 24.5F);

		leftTrackModel[48].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box560
		leftTrackModel[48].setRotationPoint(-54.5F, 6F, 24.5F);

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box561
		leftTrackModel[49].setRotationPoint(-70.5F, -9F, 24.5F);

		leftTrackModel[50].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box562
		leftTrackModel[50].setRotationPoint(-70.5F, -11F, 24.5F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box563
		leftTrackModel[51].setRotationPoint(-69.5F, -12F, 24.5F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box564
		leftTrackModel[52].setRotationPoint(-70.5F, -6F, 24.5F);

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box565
		leftTrackModel[53].setRotationPoint(-69.5F, -4F, 24.5F);

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box566
		leftTrackModel[54].setRotationPoint(-42.5F, -12F, 20.5F);

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box567
		leftTrackModel[55].setRotationPoint(-42.5F, -12F, 16.5F);

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box568
		leftTrackModel[56].setRotationPoint(-34.5F, -4F, 16.5F);

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box569
		leftTrackModel[57].setRotationPoint(-26.5F, -3F, 16.5F);

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box570
		leftTrackModel[58].setRotationPoint(-50.5F, -4F, 16.5F);

		leftTrackModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box571
		leftTrackModel[59].setRotationPoint(-51.5F, -3F, 16.5F);

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box572
		leftTrackModel[60].setRotationPoint(-29.5F, -2F, 19.5F);

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box573
		leftTrackModel[61].setRotationPoint(-49.5F, -2F, 19.5F);

		leftTrackModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box605
		leftTrackModel[62].setRotationPoint(66F, -10.5F, 13.5F);

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box606
		leftTrackModel[63].setRotationPoint(66F, -11.5F, 13.5F);

		leftTrackModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box607
		leftTrackModel[64].setRotationPoint(66F, -8.5F, 13.5F);

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftTrackModel[65].setRotationPoint(66F, -16.5F, 19.5F);

		leftTrackModel[66].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 131
		leftTrackModel[66].setRotationPoint(66F, -16.5F, 19.5F);

		leftTrackModel[67].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftTrackModel[67].setRotationPoint(66F, -16.5F, 20.5F);

		leftTrackModel[68].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftTrackModel[68].setRotationPoint(66F, -16.5F, 20.5F);

		leftTrackModel[69].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftTrackModel[69].setRotationPoint(66F, -16.5F, 22.5F);

		leftTrackModel[70].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftTrackModel[70].setRotationPoint(66F, -16.5F, 21.5F);

		leftTrackModel[71].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 137
		leftTrackModel[71].setRotationPoint(66F, -16.5F, 32.5F);

		leftTrackModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		leftTrackModel[72].setRotationPoint(71F, -16.5F, 19.5F);
		leftTrackModel[72].rotateAngleZ = -0.76794487F;

		leftTrackModel[73].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftTrackModel[73].setRotationPoint(71F, -16.5F, 20.5F);
		leftTrackModel[73].rotateAngleZ = -0.76794487F;

		leftTrackModel[74].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftTrackModel[74].setRotationPoint(71F, -16.5F, 22.5F);
		leftTrackModel[74].rotateAngleZ = -0.76794487F;

		leftTrackModel[75].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 155
		leftTrackModel[75].setRotationPoint(71F, -16.5F, 32.5F);
		leftTrackModel[75].rotateAngleZ = -0.76794487F;

		leftTrackModel[76].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftTrackModel[76].setRotationPoint(71F, -16.5F, 21.5F);
		leftTrackModel[76].rotateAngleZ = -0.76794487F;

		leftTrackModel[77].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		leftTrackModel[77].setRotationPoint(71F, -16.5F, 20.5F);
		leftTrackModel[77].rotateAngleZ = -0.76794487F;

		leftTrackModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		leftTrackModel[78].setRotationPoint(74.6F, -13F, 19.5F);
		leftTrackModel[78].rotateAngleZ = -1.57079633F;

		leftTrackModel[79].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftTrackModel[79].setRotationPoint(74.6F, -13F, 20.5F);
		leftTrackModel[79].rotateAngleZ = -1.57079633F;

		leftTrackModel[80].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftTrackModel[80].setRotationPoint(74.6F, -13F, 22.5F);
		leftTrackModel[80].rotateAngleZ = -1.57079633F;

		leftTrackModel[81].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		leftTrackModel[81].setRotationPoint(74.6F, -13F, 32.5F);
		leftTrackModel[81].rotateAngleZ = -1.57079633F;

		leftTrackModel[82].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		leftTrackModel[82].setRotationPoint(74.6F, -13F, 21.5F);
		leftTrackModel[82].rotateAngleZ = -1.57079633F;

		leftTrackModel[83].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftTrackModel[83].setRotationPoint(74.6F, -13F, 20.5F);
		leftTrackModel[83].rotateAngleZ = -1.57079633F;

		leftTrackModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftTrackModel[84].setRotationPoint(74.6F, -8F, 19.5F);
		leftTrackModel[84].rotateAngleZ = -2.00712864F;

		leftTrackModel[85].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftTrackModel[85].setRotationPoint(74.6F, -8F, 20.5F);
		leftTrackModel[85].rotateAngleZ = -2.00712864F;

		leftTrackModel[86].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		leftTrackModel[86].setRotationPoint(74.6F, -8F, 22.5F);
		leftTrackModel[86].rotateAngleZ = -2.00712864F;

		leftTrackModel[87].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 181
		leftTrackModel[87].setRotationPoint(74.6F, -8F, 32.5F);
		leftTrackModel[87].rotateAngleZ = -2.00712864F;

		leftTrackModel[88].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftTrackModel[88].setRotationPoint(74.6F, -8F, 21.5F);
		leftTrackModel[88].rotateAngleZ = -2.00712864F;

		leftTrackModel[89].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftTrackModel[89].setRotationPoint(74.6F, -8F, 20.5F);
		leftTrackModel[89].rotateAngleZ = -2.00712864F;

		leftTrackModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		leftTrackModel[90].setRotationPoint(72.5F, -3.5F, 19.5F);
		leftTrackModel[90].rotateAngleZ = -2.30383461F;

		leftTrackModel[91].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		leftTrackModel[91].setRotationPoint(72.5F, -3.5F, 20.5F);
		leftTrackModel[91].rotateAngleZ = -2.30383461F;

		leftTrackModel[92].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		leftTrackModel[92].setRotationPoint(72.5F, -3.5F, 22.5F);
		leftTrackModel[92].rotateAngleZ = -2.30383461F;

		leftTrackModel[93].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		leftTrackModel[93].setRotationPoint(72.5F, -3.5F, 32.5F);
		leftTrackModel[93].rotateAngleZ = -2.30383461F;

		leftTrackModel[94].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftTrackModel[94].setRotationPoint(72.5F, -3.5F, 21.5F);
		leftTrackModel[94].rotateAngleZ = -2.30383461F;

		leftTrackModel[95].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftTrackModel[95].setRotationPoint(72.5F, -3.5F, 20.5F);
		leftTrackModel[95].rotateAngleZ = -2.30383461F;

		leftTrackModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackModel[96].setRotationPoint(69.1F, 0.2F, 19.5F);
		leftTrackModel[96].rotateAngleZ = -2.42600766F;

		leftTrackModel[97].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		leftTrackModel[97].setRotationPoint(69.1F, 0.2F, 20.5F);
		leftTrackModel[97].rotateAngleZ = -2.42600766F;

		leftTrackModel[98].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftTrackModel[98].setRotationPoint(69.1F, 0.2F, 22.5F);
		leftTrackModel[98].rotateAngleZ = -2.42600766F;

		leftTrackModel[99].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 207
		leftTrackModel[99].setRotationPoint(69.1F, 0.2F, 32.5F);
		leftTrackModel[99].rotateAngleZ = -2.42600766F;

		leftTrackModel[100].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftTrackModel[100].setRotationPoint(69.1F, 0.2F, 21.5F);
		leftTrackModel[100].rotateAngleZ = -2.42600766F;

		leftTrackModel[101].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftTrackModel[101].setRotationPoint(69.1F, 0.2F, 20.5F);
		leftTrackModel[101].rotateAngleZ = -2.42600766F;

		leftTrackModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		leftTrackModel[102].setRotationPoint(65.4F, 3.5F, 19.5F);
		leftTrackModel[102].rotateAngleZ = -2.49582083F;

		leftTrackModel[103].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		leftTrackModel[103].setRotationPoint(65.4F, 3.5F, 20.5F);
		leftTrackModel[103].rotateAngleZ = -2.49582083F;

		leftTrackModel[104].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		leftTrackModel[104].setRotationPoint(65.4F, 3.5F, 22.5F);
		leftTrackModel[104].rotateAngleZ = -2.49582083F;

		leftTrackModel[105].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 220
		leftTrackModel[105].setRotationPoint(65.4F, 3.5F, 32.5F);
		leftTrackModel[105].rotateAngleZ = -2.49582083F;

		leftTrackModel[106].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		leftTrackModel[106].setRotationPoint(65.4F, 3.5F, 21.5F);
		leftTrackModel[106].rotateAngleZ = -2.49582083F;

		leftTrackModel[107].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftTrackModel[107].setRotationPoint(65.4F, 3.5F, 20.5F);
		leftTrackModel[107].rotateAngleZ = -2.49582083F;

		leftTrackModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		leftTrackModel[108].setRotationPoint(61.4F, 6.5F, 19.5F);
		leftTrackModel[108].rotateAngleZ = -2.63544717F;

		leftTrackModel[109].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftTrackModel[109].setRotationPoint(61.4F, 6.5F, 20.5F);
		leftTrackModel[109].rotateAngleZ = -2.63544717F;

		leftTrackModel[110].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftTrackModel[110].setRotationPoint(61.4F, 6.5F, 22.5F);
		leftTrackModel[110].rotateAngleZ = -2.63544717F;

		leftTrackModel[111].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 233
		leftTrackModel[111].setRotationPoint(61.4F, 6.5F, 32.5F);
		leftTrackModel[111].rotateAngleZ = -2.63544717F;

		leftTrackModel[112].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftTrackModel[112].setRotationPoint(61.4F, 6.5F, 21.5F);
		leftTrackModel[112].rotateAngleZ = -2.63544717F;

		leftTrackModel[113].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		leftTrackModel[113].setRotationPoint(61.4F, 6.5F, 20.5F);
		leftTrackModel[113].rotateAngleZ = -2.63544717F;

		leftTrackModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftTrackModel[114].setRotationPoint(57F, 9F, 19.5F);
		leftTrackModel[114].rotateAngleZ = -3.14159265F;

		leftTrackModel[115].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftTrackModel[115].setRotationPoint(57F, 9F, 20.5F);
		leftTrackModel[115].rotateAngleZ = -3.14159265F;

		leftTrackModel[116].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftTrackModel[116].setRotationPoint(57F, 9F, 22.5F);
		leftTrackModel[116].rotateAngleZ = -3.14159265F;

		leftTrackModel[117].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 246
		leftTrackModel[117].setRotationPoint(57F, 9F, 32.5F);
		leftTrackModel[117].rotateAngleZ = -3.14159265F;

		leftTrackModel[118].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftTrackModel[118].setRotationPoint(57F, 9F, 21.5F);
		leftTrackModel[118].rotateAngleZ = -3.14159265F;

		leftTrackModel[119].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftTrackModel[119].setRotationPoint(57F, 9F, 20.5F);
		leftTrackModel[119].rotateAngleZ = -3.14159265F;

		leftTrackModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftTrackModel[120].setRotationPoint(52F, 9F, 19.5F);
		leftTrackModel[120].rotateAngleZ = -3.14159265F;

		leftTrackModel[121].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftTrackModel[121].setRotationPoint(52F, 9F, 20.5F);
		leftTrackModel[121].rotateAngleZ = -3.14159265F;

		leftTrackModel[122].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		leftTrackModel[122].setRotationPoint(52F, 9F, 22.5F);
		leftTrackModel[122].rotateAngleZ = -3.14159265F;

		leftTrackModel[123].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 259
		leftTrackModel[123].setRotationPoint(52F, 9F, 32.5F);
		leftTrackModel[123].rotateAngleZ = -3.14159265F;

		leftTrackModel[124].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		leftTrackModel[124].setRotationPoint(52F, 9F, 21.5F);
		leftTrackModel[124].rotateAngleZ = -3.14159265F;

		leftTrackModel[125].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftTrackModel[125].setRotationPoint(52F, 9F, 20.5F);
		leftTrackModel[125].rotateAngleZ = -3.14159265F;

		leftTrackModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftTrackModel[126].setRotationPoint(47F, 9F, 19.5F);
		leftTrackModel[126].rotateAngleZ = -3.14159265F;

		leftTrackModel[127].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftTrackModel[127].setRotationPoint(47F, 9F, 20.5F);
		leftTrackModel[127].rotateAngleZ = -3.14159265F;

		leftTrackModel[128].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftTrackModel[128].setRotationPoint(47F, 9F, 22.5F);
		leftTrackModel[128].rotateAngleZ = -3.14159265F;

		leftTrackModel[129].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 272
		leftTrackModel[129].setRotationPoint(47F, 9F, 32.5F);
		leftTrackModel[129].rotateAngleZ = -3.14159265F;

		leftTrackModel[130].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftTrackModel[130].setRotationPoint(47F, 9F, 21.5F);
		leftTrackModel[130].rotateAngleZ = -3.14159265F;

		leftTrackModel[131].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		leftTrackModel[131].setRotationPoint(47F, 9F, 20.5F);
		leftTrackModel[131].rotateAngleZ = -3.14159265F;

		leftTrackModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftTrackModel[132].setRotationPoint(42F, 9F, 19.5F);
		leftTrackModel[132].rotateAngleZ = -3.14159265F;

		leftTrackModel[133].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		leftTrackModel[133].setRotationPoint(42F, 9F, 20.5F);
		leftTrackModel[133].rotateAngleZ = -3.14159265F;

		leftTrackModel[134].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		leftTrackModel[134].setRotationPoint(42F, 9F, 22.5F);
		leftTrackModel[134].rotateAngleZ = -3.14159265F;

		leftTrackModel[135].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 285
		leftTrackModel[135].setRotationPoint(42F, 9F, 32.5F);
		leftTrackModel[135].rotateAngleZ = -3.14159265F;

		leftTrackModel[136].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		leftTrackModel[136].setRotationPoint(42F, 9F, 21.5F);
		leftTrackModel[136].rotateAngleZ = -3.14159265F;

		leftTrackModel[137].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		leftTrackModel[137].setRotationPoint(42F, 9F, 20.5F);
		leftTrackModel[137].rotateAngleZ = -3.14159265F;

		leftTrackModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		leftTrackModel[138].setRotationPoint(37F, 9F, 19.5F);
		leftTrackModel[138].rotateAngleZ = -3.14159265F;

		leftTrackModel[139].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		leftTrackModel[139].setRotationPoint(37F, 9F, 20.5F);
		leftTrackModel[139].rotateAngleZ = -3.14159265F;

		leftTrackModel[140].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		leftTrackModel[140].setRotationPoint(37F, 9F, 22.5F);
		leftTrackModel[140].rotateAngleZ = -3.14159265F;

		leftTrackModel[141].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 298
		leftTrackModel[141].setRotationPoint(37F, 9F, 32.5F);
		leftTrackModel[141].rotateAngleZ = -3.14159265F;

		leftTrackModel[142].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		leftTrackModel[142].setRotationPoint(37F, 9F, 21.5F);
		leftTrackModel[142].rotateAngleZ = -3.14159265F;

		leftTrackModel[143].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		leftTrackModel[143].setRotationPoint(37F, 9F, 20.5F);
		leftTrackModel[143].rotateAngleZ = -3.14159265F;

		leftTrackModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftTrackModel[144].setRotationPoint(32F, 9F, 19.5F);
		leftTrackModel[144].rotateAngleZ = -3.14159265F;

		leftTrackModel[145].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		leftTrackModel[145].setRotationPoint(32F, 9F, 20.5F);
		leftTrackModel[145].rotateAngleZ = -3.14159265F;

		leftTrackModel[146].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		leftTrackModel[146].setRotationPoint(32F, 9F, 22.5F);
		leftTrackModel[146].rotateAngleZ = -3.14159265F;

		leftTrackModel[147].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 311
		leftTrackModel[147].setRotationPoint(32F, 9F, 32.5F);
		leftTrackModel[147].rotateAngleZ = -3.14159265F;

		leftTrackModel[148].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		leftTrackModel[148].setRotationPoint(32F, 9F, 21.5F);
		leftTrackModel[148].rotateAngleZ = -3.14159265F;

		leftTrackModel[149].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		leftTrackModel[149].setRotationPoint(32F, 9F, 20.5F);
		leftTrackModel[149].rotateAngleZ = -3.14159265F;

		leftTrackModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		leftTrackModel[150].setRotationPoint(27F, 9F, 19.5F);
		leftTrackModel[150].rotateAngleZ = -3.14159265F;

		leftTrackModel[151].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		leftTrackModel[151].setRotationPoint(27F, 9F, 20.5F);
		leftTrackModel[151].rotateAngleZ = -3.14159265F;

		leftTrackModel[152].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		leftTrackModel[152].setRotationPoint(27F, 9F, 22.5F);
		leftTrackModel[152].rotateAngleZ = -3.14159265F;

		leftTrackModel[153].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 324
		leftTrackModel[153].setRotationPoint(27F, 9F, 32.5F);
		leftTrackModel[153].rotateAngleZ = -3.14159265F;

		leftTrackModel[154].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftTrackModel[154].setRotationPoint(27F, 9F, 21.5F);
		leftTrackModel[154].rotateAngleZ = -3.14159265F;

		leftTrackModel[155].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		leftTrackModel[155].setRotationPoint(27F, 9F, 20.5F);
		leftTrackModel[155].rotateAngleZ = -3.14159265F;

		leftTrackModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftTrackModel[156].setRotationPoint(22F, 9F, 19.5F);
		leftTrackModel[156].rotateAngleZ = -3.14159265F;

		leftTrackModel[157].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftTrackModel[157].setRotationPoint(22F, 9F, 20.5F);
		leftTrackModel[157].rotateAngleZ = -3.14159265F;

		leftTrackModel[158].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		leftTrackModel[158].setRotationPoint(22F, 9F, 22.5F);
		leftTrackModel[158].rotateAngleZ = -3.14159265F;

		leftTrackModel[159].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 337
		leftTrackModel[159].setRotationPoint(22F, 9F, 32.5F);
		leftTrackModel[159].rotateAngleZ = -3.14159265F;

		leftTrackModel[160].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		leftTrackModel[160].setRotationPoint(22F, 9F, 21.5F);
		leftTrackModel[160].rotateAngleZ = -3.14159265F;

		leftTrackModel[161].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		leftTrackModel[161].setRotationPoint(22F, 9F, 20.5F);
		leftTrackModel[161].rotateAngleZ = -3.14159265F;

		leftTrackModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		leftTrackModel[162].setRotationPoint(17F, 9F, 19.5F);
		leftTrackModel[162].rotateAngleZ = -3.14159265F;

		leftTrackModel[163].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		leftTrackModel[163].setRotationPoint(17F, 9F, 20.5F);
		leftTrackModel[163].rotateAngleZ = -3.14159265F;

		leftTrackModel[164].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftTrackModel[164].setRotationPoint(17F, 9F, 22.5F);
		leftTrackModel[164].rotateAngleZ = -3.14159265F;

		leftTrackModel[165].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 350
		leftTrackModel[165].setRotationPoint(17F, 9F, 32.5F);
		leftTrackModel[165].rotateAngleZ = -3.14159265F;

		leftTrackModel[166].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		leftTrackModel[166].setRotationPoint(17F, 9F, 21.5F);
		leftTrackModel[166].rotateAngleZ = -3.14159265F;

		leftTrackModel[167].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		leftTrackModel[167].setRotationPoint(17F, 9F, 20.5F);
		leftTrackModel[167].rotateAngleZ = -3.14159265F;

		leftTrackModel[168].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 353
		leftTrackModel[168].setRotationPoint(66F, -16.5F, 19.5F);

		leftTrackModel[169].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 354
		leftTrackModel[169].setRotationPoint(71F, -16.5F, 19.5F);
		leftTrackModel[169].rotateAngleZ = -0.76794487F;

		leftTrackModel[170].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 355
		leftTrackModel[170].setRotationPoint(74.6F, -13F, 19.5F);
		leftTrackModel[170].rotateAngleZ = -1.57079633F;

		leftTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 356
		leftTrackModel[171].setRotationPoint(74.6F, -8F, 19.5F);
		leftTrackModel[171].rotateAngleZ = -2.00712864F;

		leftTrackModel[172].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 357
		leftTrackModel[172].setRotationPoint(72.5F, -3.5F, 19.5F);
		leftTrackModel[172].rotateAngleZ = -2.30383461F;

		leftTrackModel[173].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 358
		leftTrackModel[173].setRotationPoint(69.1F, 0.2F, 19.5F);
		leftTrackModel[173].rotateAngleZ = -2.42600766F;

		leftTrackModel[174].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 359
		leftTrackModel[174].setRotationPoint(65.4F, 3.5F, 19.5F);
		leftTrackModel[174].rotateAngleZ = -2.49582083F;

		leftTrackModel[175].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 360
		leftTrackModel[175].setRotationPoint(61.4F, 6.5F, 19.5F);
		leftTrackModel[175].rotateAngleZ = -2.63544717F;

		leftTrackModel[176].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 361
		leftTrackModel[176].setRotationPoint(57F, 9F, 19.5F);
		leftTrackModel[176].rotateAngleZ = -3.14159265F;

		leftTrackModel[177].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 362
		leftTrackModel[177].setRotationPoint(52F, 9F, 19.5F);
		leftTrackModel[177].rotateAngleZ = -3.14159265F;

		leftTrackModel[178].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 363
		leftTrackModel[178].setRotationPoint(47F, 9F, 19.5F);
		leftTrackModel[178].rotateAngleZ = -3.14159265F;

		leftTrackModel[179].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 364
		leftTrackModel[179].setRotationPoint(42F, 9F, 19.5F);
		leftTrackModel[179].rotateAngleZ = -3.14159265F;

		leftTrackModel[180].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 365
		leftTrackModel[180].setRotationPoint(37F, 9F, 19.5F);
		leftTrackModel[180].rotateAngleZ = -3.14159265F;

		leftTrackModel[181].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 366
		leftTrackModel[181].setRotationPoint(32F, 9F, 19.5F);
		leftTrackModel[181].rotateAngleZ = -3.14159265F;

		leftTrackModel[182].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 367
		leftTrackModel[182].setRotationPoint(27F, 9F, 19.5F);
		leftTrackModel[182].rotateAngleZ = -3.14159265F;

		leftTrackModel[183].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 368
		leftTrackModel[183].setRotationPoint(22F, 9F, 19.5F);
		leftTrackModel[183].rotateAngleZ = -3.14159265F;

		leftTrackModel[184].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 369
		leftTrackModel[184].setRotationPoint(17F, 9F, 19.5F);
		leftTrackModel[184].rotateAngleZ = -3.14159265F;

		leftTrackModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		leftTrackModel[185].setRotationPoint(12F, 9F, 19.5F);
		leftTrackModel[185].rotateAngleZ = -3.14159265F;

		leftTrackModel[186].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 371
		leftTrackModel[186].setRotationPoint(12F, 9F, 19.5F);
		leftTrackModel[186].rotateAngleZ = -3.14159265F;

		leftTrackModel[187].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftTrackModel[187].setRotationPoint(12F, 9F, 20.5F);
		leftTrackModel[187].rotateAngleZ = -3.14159265F;

		leftTrackModel[188].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftTrackModel[188].setRotationPoint(12F, 9F, 22.5F);
		leftTrackModel[188].rotateAngleZ = -3.14159265F;

		leftTrackModel[189].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 374
		leftTrackModel[189].setRotationPoint(12F, 9F, 32.5F);
		leftTrackModel[189].rotateAngleZ = -3.14159265F;

		leftTrackModel[190].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		leftTrackModel[190].setRotationPoint(12F, 9F, 21.5F);
		leftTrackModel[190].rotateAngleZ = -3.14159265F;

		leftTrackModel[191].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		leftTrackModel[191].setRotationPoint(12F, 9F, 20.5F);
		leftTrackModel[191].rotateAngleZ = -3.14159265F;

		leftTrackModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		leftTrackModel[192].setRotationPoint(7F, 9F, 19.5F);
		leftTrackModel[192].rotateAngleZ = -3.14159265F;

		leftTrackModel[193].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 385
		leftTrackModel[193].setRotationPoint(7F, 9F, 19.5F);
		leftTrackModel[193].rotateAngleZ = -3.14159265F;

		leftTrackModel[194].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		leftTrackModel[194].setRotationPoint(7F, 9F, 20.5F);
		leftTrackModel[194].rotateAngleZ = -3.14159265F;

		leftTrackModel[195].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftTrackModel[195].setRotationPoint(7F, 9F, 22.5F);
		leftTrackModel[195].rotateAngleZ = -3.14159265F;

		leftTrackModel[196].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 388
		leftTrackModel[196].setRotationPoint(7F, 9F, 32.5F);
		leftTrackModel[196].rotateAngleZ = -3.14159265F;

		leftTrackModel[197].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftTrackModel[197].setRotationPoint(7F, 9F, 21.5F);
		leftTrackModel[197].rotateAngleZ = -3.14159265F;

		leftTrackModel[198].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		leftTrackModel[198].setRotationPoint(7F, 9F, 20.5F);
		leftTrackModel[198].rotateAngleZ = -3.14159265F;

		leftTrackModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		leftTrackModel[199].setRotationPoint(2F, 9F, 19.5F);
		leftTrackModel[199].rotateAngleZ = -3.14159265F;

		leftTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 399
		leftTrackModel[200].setRotationPoint(2F, 9F, 19.5F);
		leftTrackModel[200].rotateAngleZ = -3.14159265F;

		leftTrackModel[201].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		leftTrackModel[201].setRotationPoint(2F, 9F, 20.5F);
		leftTrackModel[201].rotateAngleZ = -3.14159265F;

		leftTrackModel[202].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		leftTrackModel[202].setRotationPoint(2F, 9F, 22.5F);
		leftTrackModel[202].rotateAngleZ = -3.14159265F;

		leftTrackModel[203].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 402
		leftTrackModel[203].setRotationPoint(2F, 9F, 32.5F);
		leftTrackModel[203].rotateAngleZ = -3.14159265F;

		leftTrackModel[204].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		leftTrackModel[204].setRotationPoint(2F, 9F, 21.5F);
		leftTrackModel[204].rotateAngleZ = -3.14159265F;

		leftTrackModel[205].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		leftTrackModel[205].setRotationPoint(2F, 9F, 20.5F);
		leftTrackModel[205].rotateAngleZ = -3.14159265F;

		leftTrackModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		leftTrackModel[206].setRotationPoint(-3F, 9F, 19.5F);
		leftTrackModel[206].rotateAngleZ = -3.14159265F;

		leftTrackModel[207].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 413
		leftTrackModel[207].setRotationPoint(-3F, 9F, 19.5F);
		leftTrackModel[207].rotateAngleZ = -3.14159265F;

		leftTrackModel[208].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		leftTrackModel[208].setRotationPoint(-3F, 9F, 20.5F);
		leftTrackModel[208].rotateAngleZ = -3.14159265F;

		leftTrackModel[209].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		leftTrackModel[209].setRotationPoint(-3F, 9F, 22.5F);
		leftTrackModel[209].rotateAngleZ = -3.14159265F;

		leftTrackModel[210].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 416
		leftTrackModel[210].setRotationPoint(-3F, 9F, 32.5F);
		leftTrackModel[210].rotateAngleZ = -3.14159265F;

		leftTrackModel[211].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		leftTrackModel[211].setRotationPoint(-3F, 9F, 21.5F);
		leftTrackModel[211].rotateAngleZ = -3.14159265F;

		leftTrackModel[212].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		leftTrackModel[212].setRotationPoint(-3F, 9F, 20.5F);
		leftTrackModel[212].rotateAngleZ = -3.14159265F;

		leftTrackModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		leftTrackModel[213].setRotationPoint(-8F, 9F, 19.5F);
		leftTrackModel[213].rotateAngleZ = -3.14159265F;

		leftTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 427
		leftTrackModel[214].setRotationPoint(-8F, 9F, 19.5F);
		leftTrackModel[214].rotateAngleZ = -3.14159265F;

		leftTrackModel[215].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		leftTrackModel[215].setRotationPoint(-8F, 9F, 20.5F);
		leftTrackModel[215].rotateAngleZ = -3.14159265F;

		leftTrackModel[216].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		leftTrackModel[216].setRotationPoint(-8F, 9F, 22.5F);
		leftTrackModel[216].rotateAngleZ = -3.14159265F;

		leftTrackModel[217].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 430
		leftTrackModel[217].setRotationPoint(-8F, 9F, 32.5F);
		leftTrackModel[217].rotateAngleZ = -3.14159265F;

		leftTrackModel[218].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		leftTrackModel[218].setRotationPoint(-8F, 9F, 21.5F);
		leftTrackModel[218].rotateAngleZ = -3.14159265F;

		leftTrackModel[219].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		leftTrackModel[219].setRotationPoint(-8F, 9F, 20.5F);
		leftTrackModel[219].rotateAngleZ = -3.14159265F;

		leftTrackModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		leftTrackModel[220].setRotationPoint(-13F, 9F, 19.5F);
		leftTrackModel[220].rotateAngleZ = -3.14159265F;

		leftTrackModel[221].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 441
		leftTrackModel[221].setRotationPoint(-13F, 9F, 19.5F);
		leftTrackModel[221].rotateAngleZ = -3.14159265F;

		leftTrackModel[222].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		leftTrackModel[222].setRotationPoint(-13F, 9F, 20.5F);
		leftTrackModel[222].rotateAngleZ = -3.14159265F;

		leftTrackModel[223].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		leftTrackModel[223].setRotationPoint(-13F, 9F, 22.5F);
		leftTrackModel[223].rotateAngleZ = -3.14159265F;

		leftTrackModel[224].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 444
		leftTrackModel[224].setRotationPoint(-13F, 9F, 32.5F);
		leftTrackModel[224].rotateAngleZ = -3.14159265F;

		leftTrackModel[225].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		leftTrackModel[225].setRotationPoint(-13F, 9F, 21.5F);
		leftTrackModel[225].rotateAngleZ = -3.14159265F;

		leftTrackModel[226].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		leftTrackModel[226].setRotationPoint(-13F, 9F, 20.5F);
		leftTrackModel[226].rotateAngleZ = -3.14159265F;

		leftTrackModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		leftTrackModel[227].setRotationPoint(-18F, 9F, 19.5F);
		leftTrackModel[227].rotateAngleZ = -3.14159265F;

		leftTrackModel[228].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 455
		leftTrackModel[228].setRotationPoint(-18F, 9F, 19.5F);
		leftTrackModel[228].rotateAngleZ = -3.14159265F;

		leftTrackModel[229].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		leftTrackModel[229].setRotationPoint(-18F, 9F, 20.5F);
		leftTrackModel[229].rotateAngleZ = -3.14159265F;

		leftTrackModel[230].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		leftTrackModel[230].setRotationPoint(-18F, 9F, 22.5F);
		leftTrackModel[230].rotateAngleZ = -3.14159265F;

		leftTrackModel[231].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 458
		leftTrackModel[231].setRotationPoint(-18F, 9F, 32.5F);
		leftTrackModel[231].rotateAngleZ = -3.14159265F;

		leftTrackModel[232].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		leftTrackModel[232].setRotationPoint(-18F, 9F, 21.5F);
		leftTrackModel[232].rotateAngleZ = -3.14159265F;

		leftTrackModel[233].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		leftTrackModel[233].setRotationPoint(-18F, 9F, 20.5F);
		leftTrackModel[233].rotateAngleZ = -3.14159265F;

		leftTrackModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		leftTrackModel[234].setRotationPoint(-23F, 9F, 19.5F);
		leftTrackModel[234].rotateAngleZ = -3.14159265F;

		leftTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 469
		leftTrackModel[235].setRotationPoint(-23F, 9F, 19.5F);
		leftTrackModel[235].rotateAngleZ = -3.14159265F;

		leftTrackModel[236].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		leftTrackModel[236].setRotationPoint(-23F, 9F, 20.5F);
		leftTrackModel[236].rotateAngleZ = -3.14159265F;

		leftTrackModel[237].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		leftTrackModel[237].setRotationPoint(-23F, 9F, 22.5F);
		leftTrackModel[237].rotateAngleZ = -3.14159265F;

		leftTrackModel[238].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 472
		leftTrackModel[238].setRotationPoint(-23F, 9F, 32.5F);
		leftTrackModel[238].rotateAngleZ = -3.14159265F;

		leftTrackModel[239].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		leftTrackModel[239].setRotationPoint(-23F, 9F, 21.5F);
		leftTrackModel[239].rotateAngleZ = -3.14159265F;

		leftTrackModel[240].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		leftTrackModel[240].setRotationPoint(-23F, 9F, 20.5F);
		leftTrackModel[240].rotateAngleZ = -3.14159265F;

		leftTrackModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		leftTrackModel[241].setRotationPoint(-28F, 9F, 19.5F);
		leftTrackModel[241].rotateAngleZ = -3.14159265F;

		leftTrackModel[242].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 483
		leftTrackModel[242].setRotationPoint(-28F, 9F, 19.5F);
		leftTrackModel[242].rotateAngleZ = -3.14159265F;

		leftTrackModel[243].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		leftTrackModel[243].setRotationPoint(-28F, 9F, 20.5F);
		leftTrackModel[243].rotateAngleZ = -3.14159265F;

		leftTrackModel[244].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		leftTrackModel[244].setRotationPoint(-28F, 9F, 22.5F);
		leftTrackModel[244].rotateAngleZ = -3.14159265F;

		leftTrackModel[245].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 486
		leftTrackModel[245].setRotationPoint(-28F, 9F, 32.5F);
		leftTrackModel[245].rotateAngleZ = -3.14159265F;

		leftTrackModel[246].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		leftTrackModel[246].setRotationPoint(-28F, 9F, 21.5F);
		leftTrackModel[246].rotateAngleZ = -3.14159265F;

		leftTrackModel[247].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		leftTrackModel[247].setRotationPoint(-28F, 9F, 20.5F);
		leftTrackModel[247].rotateAngleZ = -3.14159265F;

		leftTrackModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		leftTrackModel[248].setRotationPoint(-33F, 9F, 19.5F);
		leftTrackModel[248].rotateAngleZ = -3.14159265F;

		leftTrackModel[249].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 497
		leftTrackModel[249].setRotationPoint(-33F, 9F, 19.5F);
		leftTrackModel[249].rotateAngleZ = -3.14159265F;

		leftTrackModel[250].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		leftTrackModel[250].setRotationPoint(-33F, 9F, 20.5F);
		leftTrackModel[250].rotateAngleZ = -3.14159265F;

		leftTrackModel[251].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		leftTrackModel[251].setRotationPoint(-33F, 9F, 22.5F);
		leftTrackModel[251].rotateAngleZ = -3.14159265F;

		leftTrackModel[252].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 500
		leftTrackModel[252].setRotationPoint(-33F, 9F, 32.5F);
		leftTrackModel[252].rotateAngleZ = -3.14159265F;

		leftTrackModel[253].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		leftTrackModel[253].setRotationPoint(-33F, 9F, 21.5F);
		leftTrackModel[253].rotateAngleZ = -3.14159265F;

		leftTrackModel[254].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		leftTrackModel[254].setRotationPoint(-33F, 9F, 20.5F);
		leftTrackModel[254].rotateAngleZ = -3.14159265F;

		leftTrackModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		leftTrackModel[255].setRotationPoint(-38F, 9F, 19.5F);
		leftTrackModel[255].rotateAngleZ = -3.14159265F;

		leftTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 511
		leftTrackModel[256].setRotationPoint(-38F, 9F, 19.5F);
		leftTrackModel[256].rotateAngleZ = -3.14159265F;

		leftTrackModel[257].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		leftTrackModel[257].setRotationPoint(-38F, 9F, 20.5F);
		leftTrackModel[257].rotateAngleZ = -3.14159265F;

		leftTrackModel[258].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		leftTrackModel[258].setRotationPoint(-38F, 9F, 22.5F);
		leftTrackModel[258].rotateAngleZ = -3.14159265F;

		leftTrackModel[259].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 514
		leftTrackModel[259].setRotationPoint(-38F, 9F, 32.5F);
		leftTrackModel[259].rotateAngleZ = -3.14159265F;

		leftTrackModel[260].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		leftTrackModel[260].setRotationPoint(-38F, 9F, 21.5F);
		leftTrackModel[260].rotateAngleZ = -3.14159265F;

		leftTrackModel[261].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		leftTrackModel[261].setRotationPoint(-38F, 9F, 20.5F);
		leftTrackModel[261].rotateAngleZ = -3.14159265F;

		leftTrackModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		leftTrackModel[262].setRotationPoint(-43F, 9F, 19.5F);
		leftTrackModel[262].rotateAngleZ = -3.14159265F;

		leftTrackModel[263].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 525
		leftTrackModel[263].setRotationPoint(-43F, 9F, 19.5F);
		leftTrackModel[263].rotateAngleZ = -3.14159265F;

		leftTrackModel[264].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		leftTrackModel[264].setRotationPoint(-43F, 9F, 20.5F);
		leftTrackModel[264].rotateAngleZ = -3.14159265F;

		leftTrackModel[265].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		leftTrackModel[265].setRotationPoint(-43F, 9F, 22.5F);
		leftTrackModel[265].rotateAngleZ = -3.14159265F;

		leftTrackModel[266].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 528
		leftTrackModel[266].setRotationPoint(-43F, 9F, 32.5F);
		leftTrackModel[266].rotateAngleZ = -3.14159265F;

		leftTrackModel[267].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		leftTrackModel[267].setRotationPoint(-43F, 9F, 21.5F);
		leftTrackModel[267].rotateAngleZ = -3.14159265F;

		leftTrackModel[268].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		leftTrackModel[268].setRotationPoint(-43F, 9F, 20.5F);
		leftTrackModel[268].rotateAngleZ = -3.14159265F;

		leftTrackModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		leftTrackModel[269].setRotationPoint(-48F, 9F, 19.5F);
		leftTrackModel[269].rotateAngleZ = -3.14159265F;

		leftTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 539
		leftTrackModel[270].setRotationPoint(-48F, 9F, 19.5F);
		leftTrackModel[270].rotateAngleZ = -3.14159265F;

		leftTrackModel[271].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		leftTrackModel[271].setRotationPoint(-48F, 9F, 20.5F);
		leftTrackModel[271].rotateAngleZ = -3.14159265F;

		leftTrackModel[272].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		leftTrackModel[272].setRotationPoint(-48F, 9F, 22.5F);
		leftTrackModel[272].rotateAngleZ = -3.14159265F;

		leftTrackModel[273].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 542
		leftTrackModel[273].setRotationPoint(-48F, 9F, 32.5F);
		leftTrackModel[273].rotateAngleZ = -3.14159265F;

		leftTrackModel[274].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		leftTrackModel[274].setRotationPoint(-48F, 9F, 21.5F);
		leftTrackModel[274].rotateAngleZ = -3.14159265F;

		leftTrackModel[275].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		leftTrackModel[275].setRotationPoint(-48F, 9F, 20.5F);
		leftTrackModel[275].rotateAngleZ = -3.14159265F;

		leftTrackModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		leftTrackModel[276].setRotationPoint(-53F, 9F, 19.5F);
		leftTrackModel[276].rotateAngleZ = -3.43829863F;

		leftTrackModel[277].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 553
		leftTrackModel[277].setRotationPoint(-53F, 9F, 19.5F);
		leftTrackModel[277].rotateAngleZ = -3.43829863F;

		leftTrackModel[278].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		leftTrackModel[278].setRotationPoint(-53F, 9F, 20.5F);
		leftTrackModel[278].rotateAngleZ = -3.43829863F;

		leftTrackModel[279].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		leftTrackModel[279].setRotationPoint(-53F, 9F, 22.5F);
		leftTrackModel[279].rotateAngleZ = -3.43829863F;

		leftTrackModel[280].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 556
		leftTrackModel[280].setRotationPoint(-53F, 9F, 32.5F);
		leftTrackModel[280].rotateAngleZ = -3.43829863F;

		leftTrackModel[281].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		leftTrackModel[281].setRotationPoint(-53F, 9F, 21.5F);
		leftTrackModel[281].rotateAngleZ = -3.43829863F;

		leftTrackModel[282].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		leftTrackModel[282].setRotationPoint(-53F, 9F, 20.5F);
		leftTrackModel[282].rotateAngleZ = -3.43829863F;

		leftTrackModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		leftTrackModel[283].setRotationPoint(-57.8F, 7.6F, 19.5F);
		leftTrackModel[283].rotateAngleZ = -3.63028484F;

		leftTrackModel[284].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 567
		leftTrackModel[284].setRotationPoint(-57.8F, 7.6F, 19.5F);
		leftTrackModel[284].rotateAngleZ = -3.63028484F;

		leftTrackModel[285].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		leftTrackModel[285].setRotationPoint(-57.8F, 7.6F, 20.5F);
		leftTrackModel[285].rotateAngleZ = -3.63028484F;

		leftTrackModel[286].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		leftTrackModel[286].setRotationPoint(-57.8F, 7.6F, 22.5F);
		leftTrackModel[286].rotateAngleZ = -3.63028484F;

		leftTrackModel[287].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 570
		leftTrackModel[287].setRotationPoint(-57.8F, 7.6F, 32.5F);
		leftTrackModel[287].rotateAngleZ = -3.63028484F;

		leftTrackModel[288].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		leftTrackModel[288].setRotationPoint(-57.8F, 7.6F, 21.5F);
		leftTrackModel[288].rotateAngleZ = -3.63028484F;

		leftTrackModel[289].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		leftTrackModel[289].setRotationPoint(-57.8F, 7.6F, 20.5F);
		leftTrackModel[289].rotateAngleZ = -3.63028484F;

		leftTrackModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		leftTrackModel[290].setRotationPoint(-61.8F, 5.5F, 19.5F);
		leftTrackModel[290].rotateAngleZ = -3.71755131F;

		leftTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 581
		leftTrackModel[291].setRotationPoint(-61.8F, 5.5F, 19.5F);
		leftTrackModel[291].rotateAngleZ = -3.71755131F;

		leftTrackModel[292].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		leftTrackModel[292].setRotationPoint(-61.8F, 5.5F, 20.5F);
		leftTrackModel[292].rotateAngleZ = -3.71755131F;

		leftTrackModel[293].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		leftTrackModel[293].setRotationPoint(-61.8F, 5.5F, 22.5F);
		leftTrackModel[293].rotateAngleZ = -3.71755131F;

		leftTrackModel[294].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 584
		leftTrackModel[294].setRotationPoint(-61.8F, 5.5F, 32.5F);
		leftTrackModel[294].rotateAngleZ = -3.71755131F;

		leftTrackModel[295].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		leftTrackModel[295].setRotationPoint(-61.8F, 5.5F, 21.5F);
		leftTrackModel[295].rotateAngleZ = -3.71755131F;

		leftTrackModel[296].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		leftTrackModel[296].setRotationPoint(-61.8F, 5.5F, 20.5F);
		leftTrackModel[296].rotateAngleZ = -3.71755131F;

		leftTrackModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		leftTrackModel[297].setRotationPoint(-66F, 2.8F, 19.5F);
		leftTrackModel[297].rotateAngleZ = -3.90953752F;

		leftTrackModel[298].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 595
		leftTrackModel[298].setRotationPoint(-66F, 2.8F, 19.5F);
		leftTrackModel[298].rotateAngleZ = -3.90953752F;

		leftTrackModel[299].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		leftTrackModel[299].setRotationPoint(-66F, 2.8F, 20.5F);
		leftTrackModel[299].rotateAngleZ = -3.90953752F;

		leftTrackModel[300].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		leftTrackModel[300].setRotationPoint(-66F, 2.8F, 22.5F);
		leftTrackModel[300].rotateAngleZ = -3.90953752F;

		leftTrackModel[301].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 598
		leftTrackModel[301].setRotationPoint(-66F, 2.8F, 32.5F);
		leftTrackModel[301].rotateAngleZ = -3.90953752F;

		leftTrackModel[302].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		leftTrackModel[302].setRotationPoint(-66F, 2.8F, 21.5F);
		leftTrackModel[302].rotateAngleZ = -3.90953752F;

		leftTrackModel[303].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		leftTrackModel[303].setRotationPoint(-66F, 2.8F, 20.5F);
		leftTrackModel[303].rotateAngleZ = -3.90953752F;

		leftTrackModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		leftTrackModel[304].setRotationPoint(-69.6F, -0.65F, 19.5F);
		leftTrackModel[304].rotateAngleZ = -4.31096325F;

		leftTrackModel[305].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 609
		leftTrackModel[305].setRotationPoint(-69.6F, -0.65F, 19.5F);
		leftTrackModel[305].rotateAngleZ = -4.31096325F;

		leftTrackModel[306].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		leftTrackModel[306].setRotationPoint(-69.6F, -0.65F, 20.5F);
		leftTrackModel[306].rotateAngleZ = -4.31096325F;

		leftTrackModel[307].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		leftTrackModel[307].setRotationPoint(-69.6F, -0.65F, 22.5F);
		leftTrackModel[307].rotateAngleZ = -4.31096325F;

		leftTrackModel[308].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 612
		leftTrackModel[308].setRotationPoint(-69.6F, -0.65F, 32.5F);
		leftTrackModel[308].rotateAngleZ = -4.31096325F;

		leftTrackModel[309].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		leftTrackModel[309].setRotationPoint(-69.6F, -0.65F, 21.5F);
		leftTrackModel[309].rotateAngleZ = -4.31096325F;

		leftTrackModel[310].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		leftTrackModel[310].setRotationPoint(-69.6F, -0.65F, 20.5F);
		leftTrackModel[310].rotateAngleZ = -4.31096325F;

		leftTrackModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		leftTrackModel[311].setRotationPoint(-71.6F, -5.2F, 19.5F);
		leftTrackModel[311].rotateAngleZ = -4.71238898F;

		leftTrackModel[312].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 623
		leftTrackModel[312].setRotationPoint(-71.6F, -5.2F, 19.5F);
		leftTrackModel[312].rotateAngleZ = -4.71238898F;

		leftTrackModel[313].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		leftTrackModel[313].setRotationPoint(-71.6F, -5.2F, 20.5F);
		leftTrackModel[313].rotateAngleZ = -4.71238898F;

		leftTrackModel[314].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		leftTrackModel[314].setRotationPoint(-71.6F, -5.2F, 22.5F);
		leftTrackModel[314].rotateAngleZ = -4.71238898F;

		leftTrackModel[315].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 626
		leftTrackModel[315].setRotationPoint(-71.6F, -5.2F, 32.5F);
		leftTrackModel[315].rotateAngleZ = -4.71238898F;

		leftTrackModel[316].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		leftTrackModel[316].setRotationPoint(-71.6F, -5.2F, 21.5F);
		leftTrackModel[316].rotateAngleZ = -4.71238898F;

		leftTrackModel[317].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		leftTrackModel[317].setRotationPoint(-71.6F, -5.2F, 20.5F);
		leftTrackModel[317].rotateAngleZ = -4.71238898F;

		leftTrackModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		leftTrackModel[318].setRotationPoint(-71.6F, -10.2F, 19.5F);
		leftTrackModel[318].rotateAngleZ = -5.68977336F;

		leftTrackModel[319].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 637
		leftTrackModel[319].setRotationPoint(-71.6F, -10.2F, 19.5F);
		leftTrackModel[319].rotateAngleZ = -5.68977336F;

		leftTrackModel[320].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		leftTrackModel[320].setRotationPoint(-71.6F, -10.2F, 20.5F);
		leftTrackModel[320].rotateAngleZ = -5.68977336F;

		leftTrackModel[321].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		leftTrackModel[321].setRotationPoint(-71.6F, -10.2F, 22.5F);
		leftTrackModel[321].rotateAngleZ = -5.68977336F;

		leftTrackModel[322].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 640
		leftTrackModel[322].setRotationPoint(-71.6F, -10.2F, 32.5F);
		leftTrackModel[322].rotateAngleZ = -5.68977336F;

		leftTrackModel[323].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		leftTrackModel[323].setRotationPoint(-71.6F, -10.2F, 21.5F);
		leftTrackModel[323].rotateAngleZ = -5.68977336F;

		leftTrackModel[324].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		leftTrackModel[324].setRotationPoint(-71.6F, -10.2F, 20.5F);
		leftTrackModel[324].rotateAngleZ = -5.68977336F;

		leftTrackModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		leftTrackModel[325].setRotationPoint(-67.5F, -13F, 19.5F);

		leftTrackModel[326].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 651
		leftTrackModel[326].setRotationPoint(-67.5F, -13F, 19.5F);

		leftTrackModel[327].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		leftTrackModel[327].setRotationPoint(-67.5F, -13F, 20.5F);

		leftTrackModel[328].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		leftTrackModel[328].setRotationPoint(-67.5F, -13F, 22.5F);

		leftTrackModel[329].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 654
		leftTrackModel[329].setRotationPoint(-67.5F, -13F, 32.5F);

		leftTrackModel[330].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		leftTrackModel[330].setRotationPoint(-67.5F, -13F, 21.5F);

		leftTrackModel[331].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		leftTrackModel[331].setRotationPoint(-67.5F, -13F, 20.5F);

		leftTrackModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		leftTrackModel[332].setRotationPoint(-62.5F, -13F, 19.5F);

		leftTrackModel[333].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 665
		leftTrackModel[333].setRotationPoint(-62.5F, -13F, 19.5F);

		leftTrackModel[334].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		leftTrackModel[334].setRotationPoint(-62.5F, -13F, 20.5F);

		leftTrackModel[335].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		leftTrackModel[335].setRotationPoint(-62.5F, -13F, 22.5F);

		leftTrackModel[336].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 668
		leftTrackModel[336].setRotationPoint(-62.5F, -13F, 32.5F);

		leftTrackModel[337].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		leftTrackModel[337].setRotationPoint(-62.5F, -13F, 21.5F);

		leftTrackModel[338].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		leftTrackModel[338].setRotationPoint(-62.5F, -13F, 20.5F);

		leftTrackModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		leftTrackModel[339].setRotationPoint(-57.5F, -13F, 19.5F);

		leftTrackModel[340].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 679
		leftTrackModel[340].setRotationPoint(-57.5F, -13F, 19.5F);

		leftTrackModel[341].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		leftTrackModel[341].setRotationPoint(-57.5F, -13F, 20.5F);

		leftTrackModel[342].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		leftTrackModel[342].setRotationPoint(-57.5F, -13F, 22.5F);

		leftTrackModel[343].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 682
		leftTrackModel[343].setRotationPoint(-57.5F, -13F, 32.5F);

		leftTrackModel[344].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 683
		leftTrackModel[344].setRotationPoint(-57.5F, -13F, 21.5F);

		leftTrackModel[345].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		leftTrackModel[345].setRotationPoint(-57.5F, -13F, 20.5F);

		leftTrackModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		leftTrackModel[346].setRotationPoint(-52.5F, -13F, 19.5F);

		leftTrackModel[347].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 693
		leftTrackModel[347].setRotationPoint(-52.5F, -13F, 19.5F);

		leftTrackModel[348].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		leftTrackModel[348].setRotationPoint(-52.5F, -13F, 20.5F);

		leftTrackModel[349].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		leftTrackModel[349].setRotationPoint(-52.5F, -13F, 22.5F);

		leftTrackModel[350].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 696
		leftTrackModel[350].setRotationPoint(-52.5F, -13F, 32.5F);

		leftTrackModel[351].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		leftTrackModel[351].setRotationPoint(-52.5F, -13F, 21.5F);

		leftTrackModel[352].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		leftTrackModel[352].setRotationPoint(-52.5F, -13F, 20.5F);

		leftTrackModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		leftTrackModel[353].setRotationPoint(-47.5F, -13F, 19.5F);

		leftTrackModel[354].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 707
		leftTrackModel[354].setRotationPoint(-47.5F, -13F, 19.5F);

		leftTrackModel[355].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		leftTrackModel[355].setRotationPoint(-47.5F, -13F, 20.5F);

		leftTrackModel[356].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		leftTrackModel[356].setRotationPoint(-47.5F, -13F, 22.5F);

		leftTrackModel[357].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 710
		leftTrackModel[357].setRotationPoint(-47.5F, -13F, 32.5F);

		leftTrackModel[358].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711
		leftTrackModel[358].setRotationPoint(-47.5F, -13F, 21.5F);

		leftTrackModel[359].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		leftTrackModel[359].setRotationPoint(-47.5F, -13F, 20.5F);

		leftTrackModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		leftTrackModel[360].setRotationPoint(-42.5F, -13F, 19.5F);

		leftTrackModel[361].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 721
		leftTrackModel[361].setRotationPoint(-42.5F, -13F, 19.5F);

		leftTrackModel[362].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		leftTrackModel[362].setRotationPoint(-42.5F, -13F, 20.5F);

		leftTrackModel[363].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		leftTrackModel[363].setRotationPoint(-42.5F, -13F, 22.5F);

		leftTrackModel[364].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 724
		leftTrackModel[364].setRotationPoint(-42.5F, -13F, 32.5F);

		leftTrackModel[365].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		leftTrackModel[365].setRotationPoint(-42.5F, -13F, 21.5F);

		leftTrackModel[366].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		leftTrackModel[366].setRotationPoint(-42.5F, -13F, 20.5F);

		leftTrackModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		leftTrackModel[367].setRotationPoint(-37.5F, -13F, 19.5F);

		leftTrackModel[368].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 735
		leftTrackModel[368].setRotationPoint(-37.5F, -13F, 19.5F);

		leftTrackModel[369].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		leftTrackModel[369].setRotationPoint(-37.5F, -13F, 20.5F);

		leftTrackModel[370].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		leftTrackModel[370].setRotationPoint(-37.5F, -13F, 22.5F);

		leftTrackModel[371].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 738
		leftTrackModel[371].setRotationPoint(-37.5F, -13F, 32.5F);

		leftTrackModel[372].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
		leftTrackModel[372].setRotationPoint(-37.5F, -13F, 21.5F);

		leftTrackModel[373].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		leftTrackModel[373].setRotationPoint(-37.5F, -13F, 20.5F);

		leftTrackModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		leftTrackModel[374].setRotationPoint(-32.5F, -13F, 19.5F);

		leftTrackModel[375].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 749
		leftTrackModel[375].setRotationPoint(-32.5F, -13F, 19.5F);

		leftTrackModel[376].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		leftTrackModel[376].setRotationPoint(-32.5F, -13F, 20.5F);

		leftTrackModel[377].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		leftTrackModel[377].setRotationPoint(-32.5F, -13F, 22.5F);

		leftTrackModel[378].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 752
		leftTrackModel[378].setRotationPoint(-32.5F, -13F, 32.5F);

		leftTrackModel[379].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		leftTrackModel[379].setRotationPoint(-32.5F, -13F, 21.5F);

		leftTrackModel[380].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		leftTrackModel[380].setRotationPoint(-32.5F, -13F, 20.5F);

		leftTrackModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		leftTrackModel[381].setRotationPoint(-27.5F, -13F, 19.5F);

		leftTrackModel[382].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 763
		leftTrackModel[382].setRotationPoint(-27.5F, -13F, 19.5F);

		leftTrackModel[383].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		leftTrackModel[383].setRotationPoint(-27.5F, -13F, 20.5F);

		leftTrackModel[384].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		leftTrackModel[384].setRotationPoint(-27.5F, -13F, 22.5F);

		leftTrackModel[385].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 766
		leftTrackModel[385].setRotationPoint(-27.5F, -13F, 32.5F);

		leftTrackModel[386].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		leftTrackModel[386].setRotationPoint(-27.5F, -13F, 21.5F);

		leftTrackModel[387].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		leftTrackModel[387].setRotationPoint(-27.5F, -13F, 20.5F);

		leftTrackModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		leftTrackModel[388].setRotationPoint(-22.5F, -13F, 19.5F);

		leftTrackModel[389].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 777
		leftTrackModel[389].setRotationPoint(-22.5F, -13F, 19.5F);

		leftTrackModel[390].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		leftTrackModel[390].setRotationPoint(-22.5F, -13F, 20.5F);

		leftTrackModel[391].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		leftTrackModel[391].setRotationPoint(-22.5F, -13F, 22.5F);

		leftTrackModel[392].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 780
		leftTrackModel[392].setRotationPoint(-22.5F, -13F, 32.5F);

		leftTrackModel[393].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		leftTrackModel[393].setRotationPoint(-22.5F, -13F, 21.5F);

		leftTrackModel[394].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		leftTrackModel[394].setRotationPoint(-22.5F, -13F, 20.5F);

		leftTrackModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		leftTrackModel[395].setRotationPoint(-17.5F, -13F, 19.5F);

		leftTrackModel[396].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 791
		leftTrackModel[396].setRotationPoint(-17.5F, -13F, 19.5F);

		leftTrackModel[397].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		leftTrackModel[397].setRotationPoint(-17.5F, -13F, 20.5F);

		leftTrackModel[398].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		leftTrackModel[398].setRotationPoint(-17.5F, -13F, 22.5F);

		leftTrackModel[399].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 794
		leftTrackModel[399].setRotationPoint(-17.5F, -13F, 32.5F);

		leftTrackModel[400].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 795
		leftTrackModel[400].setRotationPoint(-17.5F, -13F, 21.5F);

		leftTrackModel[401].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		leftTrackModel[401].setRotationPoint(-17.5F, -13F, 20.5F);

		leftTrackModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		leftTrackModel[402].setRotationPoint(-12.5F, -13F, 19.5F);

		leftTrackModel[403].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 805
		leftTrackModel[403].setRotationPoint(-12.5F, -13F, 19.5F);

		leftTrackModel[404].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		leftTrackModel[404].setRotationPoint(-12.5F, -13F, 20.5F);

		leftTrackModel[405].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		leftTrackModel[405].setRotationPoint(-12.5F, -13F, 22.5F);

		leftTrackModel[406].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 808
		leftTrackModel[406].setRotationPoint(-12.5F, -13F, 32.5F);

		leftTrackModel[407].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		leftTrackModel[407].setRotationPoint(-12.5F, -13F, 21.5F);

		leftTrackModel[408].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		leftTrackModel[408].setRotationPoint(-12.5F, -13F, 20.5F);

		leftTrackModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 818
		leftTrackModel[409].setRotationPoint(-7.5F, -13F, 19.5F);

		leftTrackModel[410].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 819
		leftTrackModel[410].setRotationPoint(-7.5F, -13F, 19.5F);

		leftTrackModel[411].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		leftTrackModel[411].setRotationPoint(-7.5F, -13F, 20.5F);

		leftTrackModel[412].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
		leftTrackModel[412].setRotationPoint(-7.5F, -13F, 22.5F);

		leftTrackModel[413].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 822
		leftTrackModel[413].setRotationPoint(-7.5F, -13F, 32.5F);

		leftTrackModel[414].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		leftTrackModel[414].setRotationPoint(-7.5F, -13F, 21.5F);

		leftTrackModel[415].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		leftTrackModel[415].setRotationPoint(-7.5F, -13F, 20.5F);

		leftTrackModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		leftTrackModel[416].setRotationPoint(-2.5F, -13F, 19.5F);

		leftTrackModel[417].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 833
		leftTrackModel[417].setRotationPoint(-2.5F, -13F, 19.5F);

		leftTrackModel[418].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		leftTrackModel[418].setRotationPoint(-2.5F, -13F, 20.5F);

		leftTrackModel[419].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		leftTrackModel[419].setRotationPoint(-2.5F, -13F, 22.5F);

		leftTrackModel[420].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 836
		leftTrackModel[420].setRotationPoint(-2.5F, -13F, 32.5F);

		leftTrackModel[421].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		leftTrackModel[421].setRotationPoint(-2.5F, -13F, 21.5F);

		leftTrackModel[422].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		leftTrackModel[422].setRotationPoint(-2.5F, -13F, 20.5F);

		leftTrackModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		leftTrackModel[423].setRotationPoint(2.5F, -13F, 19.5F);

		leftTrackModel[424].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 847
		leftTrackModel[424].setRotationPoint(2.5F, -13F, 19.5F);

		leftTrackModel[425].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		leftTrackModel[425].setRotationPoint(2.5F, -13F, 20.5F);

		leftTrackModel[426].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		leftTrackModel[426].setRotationPoint(2.5F, -13F, 22.5F);

		leftTrackModel[427].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 850
		leftTrackModel[427].setRotationPoint(2.5F, -13F, 32.5F);

		leftTrackModel[428].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 851
		leftTrackModel[428].setRotationPoint(2.5F, -13F, 21.5F);

		leftTrackModel[429].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
		leftTrackModel[429].setRotationPoint(2.5F, -13F, 20.5F);

		leftTrackModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 860
		leftTrackModel[430].setRotationPoint(7.5F, -13F, 19.5F);

		leftTrackModel[431].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 861
		leftTrackModel[431].setRotationPoint(7.5F, -13F, 19.5F);

		leftTrackModel[432].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		leftTrackModel[432].setRotationPoint(7.5F, -13F, 20.5F);

		leftTrackModel[433].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
		leftTrackModel[433].setRotationPoint(7.5F, -13F, 22.5F);

		leftTrackModel[434].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 864
		leftTrackModel[434].setRotationPoint(7.5F, -13F, 32.5F);

		leftTrackModel[435].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 865
		leftTrackModel[435].setRotationPoint(7.5F, -13F, 21.5F);

		leftTrackModel[436].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		leftTrackModel[436].setRotationPoint(7.5F, -13F, 20.5F);

		leftTrackModel[437].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		leftTrackModel[437].setRotationPoint(12.5F, -13F, 19.5F);

		leftTrackModel[438].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 875
		leftTrackModel[438].setRotationPoint(12.5F, -13F, 19.5F);

		leftTrackModel[439].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		leftTrackModel[439].setRotationPoint(12.5F, -13F, 20.5F);

		leftTrackModel[440].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 877
		leftTrackModel[440].setRotationPoint(12.5F, -13F, 22.5F);

		leftTrackModel[441].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 878
		leftTrackModel[441].setRotationPoint(12.5F, -13F, 32.5F);

		leftTrackModel[442].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		leftTrackModel[442].setRotationPoint(12.5F, -13F, 21.5F);

		leftTrackModel[443].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		leftTrackModel[443].setRotationPoint(12.5F, -13F, 20.5F);

		leftTrackModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 888
		leftTrackModel[444].setRotationPoint(17.5F, -13F, 19.5F);

		leftTrackModel[445].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 889
		leftTrackModel[445].setRotationPoint(17.5F, -13F, 19.5F);

		leftTrackModel[446].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		leftTrackModel[446].setRotationPoint(17.5F, -13F, 20.5F);

		leftTrackModel[447].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		leftTrackModel[447].setRotationPoint(17.5F, -13F, 22.5F);

		leftTrackModel[448].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 892
		leftTrackModel[448].setRotationPoint(17.5F, -13F, 32.5F);

		leftTrackModel[449].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 893
		leftTrackModel[449].setRotationPoint(17.5F, -13F, 21.5F);

		leftTrackModel[450].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		leftTrackModel[450].setRotationPoint(17.5F, -13F, 20.5F);

		leftTrackModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		leftTrackModel[451].setRotationPoint(22.5F, -13F, 19.5F);

		leftTrackModel[452].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 903
		leftTrackModel[452].setRotationPoint(22.5F, -13F, 19.5F);

		leftTrackModel[453].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		leftTrackModel[453].setRotationPoint(22.5F, -13F, 20.5F);

		leftTrackModel[454].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		leftTrackModel[454].setRotationPoint(22.5F, -13F, 22.5F);

		leftTrackModel[455].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 906
		leftTrackModel[455].setRotationPoint(22.5F, -13F, 32.5F);

		leftTrackModel[456].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		leftTrackModel[456].setRotationPoint(22.5F, -13F, 21.5F);

		leftTrackModel[457].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		leftTrackModel[457].setRotationPoint(22.5F, -13F, 20.5F);

		leftTrackModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		leftTrackModel[458].setRotationPoint(27.5F, -13F, 19.5F);

		leftTrackModel[459].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 917
		leftTrackModel[459].setRotationPoint(27.5F, -13F, 19.5F);

		leftTrackModel[460].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		leftTrackModel[460].setRotationPoint(27.5F, -13F, 20.5F);

		leftTrackModel[461].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 919
		leftTrackModel[461].setRotationPoint(27.5F, -13F, 22.5F);

		leftTrackModel[462].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 920
		leftTrackModel[462].setRotationPoint(27.5F, -13F, 32.5F);

		leftTrackModel[463].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		leftTrackModel[463].setRotationPoint(27.5F, -13F, 21.5F);

		leftTrackModel[464].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		leftTrackModel[464].setRotationPoint(27.5F, -13F, 20.5F);

		leftTrackModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		leftTrackModel[465].setRotationPoint(32.5F, -13F, 19.5F);

		leftTrackModel[466].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 931
		leftTrackModel[466].setRotationPoint(32.5F, -13F, 19.5F);

		leftTrackModel[467].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		leftTrackModel[467].setRotationPoint(32.5F, -13F, 20.5F);

		leftTrackModel[468].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 933
		leftTrackModel[468].setRotationPoint(32.5F, -13F, 22.5F);

		leftTrackModel[469].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 934
		leftTrackModel[469].setRotationPoint(32.5F, -13F, 32.5F);

		leftTrackModel[470].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 935
		leftTrackModel[470].setRotationPoint(32.5F, -13F, 21.5F);

		leftTrackModel[471].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 936
		leftTrackModel[471].setRotationPoint(32.5F, -13F, 20.5F);

		leftTrackModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		leftTrackModel[472].setRotationPoint(37.5F, -13F, 19.5F);

		leftTrackModel[473].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 945
		leftTrackModel[473].setRotationPoint(37.5F, -13F, 19.5F);

		leftTrackModel[474].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
		leftTrackModel[474].setRotationPoint(37.5F, -13F, 20.5F);

		leftTrackModel[475].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		leftTrackModel[475].setRotationPoint(37.5F, -13F, 22.5F);

		leftTrackModel[476].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 948
		leftTrackModel[476].setRotationPoint(37.5F, -13F, 32.5F);

		leftTrackModel[477].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		leftTrackModel[477].setRotationPoint(37.5F, -13F, 21.5F);

		leftTrackModel[478].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		leftTrackModel[478].setRotationPoint(37.5F, -13F, 20.5F);

		leftTrackModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 958
		leftTrackModel[479].setRotationPoint(42.5F, -13F, 19.5F);

		leftTrackModel[480].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 959
		leftTrackModel[480].setRotationPoint(42.5F, -13F, 19.5F);

		leftTrackModel[481].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		leftTrackModel[481].setRotationPoint(42.5F, -13F, 20.5F);

		leftTrackModel[482].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 961
		leftTrackModel[482].setRotationPoint(42.5F, -13F, 22.5F);

		leftTrackModel[483].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 962
		leftTrackModel[483].setRotationPoint(42.5F, -13F, 32.5F);

		leftTrackModel[484].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 963
		leftTrackModel[484].setRotationPoint(42.5F, -13F, 21.5F);

		leftTrackModel[485].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		leftTrackModel[485].setRotationPoint(42.5F, -13F, 20.5F);

		leftTrackModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		leftTrackModel[486].setRotationPoint(47.5F, -13F, 19.5F);

		leftTrackModel[487].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 973
		leftTrackModel[487].setRotationPoint(47.5F, -13F, 19.5F);

		leftTrackModel[488].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		leftTrackModel[488].setRotationPoint(47.5F, -13F, 20.5F);

		leftTrackModel[489].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		leftTrackModel[489].setRotationPoint(47.5F, -13F, 22.5F);

		leftTrackModel[490].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 976
		leftTrackModel[490].setRotationPoint(47.5F, -13F, 32.5F);

		leftTrackModel[491].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		leftTrackModel[491].setRotationPoint(47.5F, -13F, 21.5F);

		leftTrackModel[492].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		leftTrackModel[492].setRotationPoint(47.5F, -13F, 20.5F);

		leftTrackModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		leftTrackModel[493].setRotationPoint(52.5F, -13F, 19.5F);

		leftTrackModel[494].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 987
		leftTrackModel[494].setRotationPoint(52.5F, -13F, 19.5F);

		leftTrackModel[495].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 988
		leftTrackModel[495].setRotationPoint(52.5F, -13F, 20.5F);

		leftTrackModel[496].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 989
		leftTrackModel[496].setRotationPoint(52.5F, -13F, 22.5F);

		leftTrackModel[497].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 990
		leftTrackModel[497].setRotationPoint(52.5F, -13F, 32.5F);

		leftTrackModel[498].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		leftTrackModel[498].setRotationPoint(52.5F, -13F, 21.5F);

		leftTrackModel[499].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 992
		leftTrackModel[499].setRotationPoint(52.5F, -13F, 20.5F);
	}

	private void initleftTrackModel_2()
	{
		leftTrackModel[500] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 1000
		leftTrackModel[501] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 1001
		leftTrackModel[502] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 1002
		leftTrackModel[503] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 1003
		leftTrackModel[504] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1004
		leftTrackModel[505] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1005
		leftTrackModel[506] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 1006
		leftTrackModel[507] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 1014
		leftTrackModel[508] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 1015
		leftTrackModel[509] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 1016
		leftTrackModel[510] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 1017
		leftTrackModel[511] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1018
		leftTrackModel[512] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1019
		leftTrackModel[513] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 1020

		leftTrackModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		leftTrackModel[500].setRotationPoint(57.5F, -13F, 19.5F);
		leftTrackModel[500].rotateAngleZ = 0.50614548F;

		leftTrackModel[501].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1001
		leftTrackModel[501].setRotationPoint(57.5F, -13F, 19.5F);
		leftTrackModel[501].rotateAngleZ = 0.50614548F;

		leftTrackModel[502].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1002
		leftTrackModel[502].setRotationPoint(57.5F, -13F, 20.5F);
		leftTrackModel[502].rotateAngleZ = 0.50614548F;

		leftTrackModel[503].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		leftTrackModel[503].setRotationPoint(57.5F, -13F, 22.5F);
		leftTrackModel[503].rotateAngleZ = 0.50614548F;

		leftTrackModel[504].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1004
		leftTrackModel[504].setRotationPoint(57.5F, -13F, 32.5F);
		leftTrackModel[504].rotateAngleZ = 0.50614548F;

		leftTrackModel[505].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		leftTrackModel[505].setRotationPoint(57.5F, -13F, 21.5F);
		leftTrackModel[505].rotateAngleZ = 0.50614548F;

		leftTrackModel[506].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		leftTrackModel[506].setRotationPoint(57.5F, -13F, 20.5F);
		leftTrackModel[506].rotateAngleZ = 0.50614548F;

		leftTrackModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		leftTrackModel[507].setRotationPoint(61.5F, -15F, 19.5F);
		leftTrackModel[507].rotateAngleZ = 0.31415927F;

		leftTrackModel[508].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1015
		leftTrackModel[508].setRotationPoint(61.5F, -15F, 19.5F);
		leftTrackModel[508].rotateAngleZ = 0.31415927F;

		leftTrackModel[509].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		leftTrackModel[509].setRotationPoint(61.5F, -15F, 20.5F);
		leftTrackModel[509].rotateAngleZ = 0.31415927F;

		leftTrackModel[510].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		leftTrackModel[510].setRotationPoint(61.5F, -15F, 22.5F);
		leftTrackModel[510].rotateAngleZ = 0.31415927F;

		leftTrackModel[511].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1018
		leftTrackModel[511].setRotationPoint(61.5F, -15F, 32.5F);
		leftTrackModel[511].rotateAngleZ = 0.31415927F;

		leftTrackModel[512].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		leftTrackModel[512].setRotationPoint(61.5F, -15F, 21.5F);
		leftTrackModel[512].rotateAngleZ = 0.31415927F;

		leftTrackModel[513].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		leftTrackModel[513].setRotationPoint(61.5F, -15F, 20.5F);
		leftTrackModel[513].rotateAngleZ = 0.31415927F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 300, 1350, textureX, textureY); // Import Box438
		rightTrackModel[1] = new ModelRendererTurbo(this, 300, 1365, textureX, textureY); // Import Box439
		rightTrackModel[2] = new ModelRendererTurbo(this, 300, 1380, textureX, textureY); // Import Box440
		rightTrackModel[3] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box441
		rightTrackModel[4] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box442
		rightTrackModel[5] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box443
		rightTrackModel[6] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box444
		rightTrackModel[7] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box445
		rightTrackModel[8] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box446
		rightTrackModel[9] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box447
		rightTrackModel[10] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box448
		rightTrackModel[11] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box449
		rightTrackModel[12] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box450
		rightTrackModel[13] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box451
		rightTrackModel[14] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box452
		rightTrackModel[15] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box453
		rightTrackModel[16] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box454
		rightTrackModel[17] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box455
		rightTrackModel[18] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box456
		rightTrackModel[19] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box457
		rightTrackModel[20] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box458
		rightTrackModel[21] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box459
		rightTrackModel[22] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box460
		rightTrackModel[23] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box461
		rightTrackModel[24] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box462
		rightTrackModel[25] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box463
		rightTrackModel[26] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box464
		rightTrackModel[27] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box465
		rightTrackModel[28] = new ModelRendererTurbo(this, 300, 1442, textureX, textureY); // Import Box466
		rightTrackModel[29] = new ModelRendererTurbo(this, 300, 1431, textureX, textureY); // Import Box467
		rightTrackModel[30] = new ModelRendererTurbo(this, 300, 1396, textureX, textureY); // Import Box468
		rightTrackModel[31] = new ModelRendererTurbo(this, 300, 1410, textureX, textureY); // Import Box469
		rightTrackModel[32] = new ModelRendererTurbo(this, 300, 1422, textureX, textureY); // Import Box470
		rightTrackModel[33] = new ModelRendererTurbo(this, 300, 1451, textureX, textureY); // Import Box471
		rightTrackModel[34] = new ModelRendererTurbo(this, 300, 1463, textureX, textureY); // Import Box473
		rightTrackModel[35] = new ModelRendererTurbo(this, 300, 1474, textureX, textureY); // Import Box474
		rightTrackModel[36] = new ModelRendererTurbo(this, 300, 1484, textureX, textureY); // Import Box475
		rightTrackModel[37] = new ModelRendererTurbo(this, 300, 1495, textureX, textureY); // Import Box476
		rightTrackModel[38] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import Box485
		rightTrackModel[39] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import Box486
		rightTrackModel[40] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box487
		rightTrackModel[41] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box488
		rightTrackModel[42] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box489
		rightTrackModel[43] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box490
		rightTrackModel[44] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box491
		rightTrackModel[45] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box492
		rightTrackModel[46] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box493
		rightTrackModel[47] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box494
		rightTrackModel[48] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box495
		rightTrackModel[49] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import Box496
		rightTrackModel[50] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box497
		rightTrackModel[51] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box498
		rightTrackModel[52] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box499
		rightTrackModel[53] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import Box500
		rightTrackModel[54] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box501
		rightTrackModel[55] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box502
		rightTrackModel[56] = new ModelRendererTurbo(this, 300, 1826, textureX, textureY); // Import Box503
		rightTrackModel[57] = new ModelRendererTurbo(this, 300, 1808, textureX, textureY); // Import Box504
		rightTrackModel[58] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box505
		rightTrackModel[59] = new ModelRendererTurbo(this, 300, 1843, textureX, textureY); // Import Box506
		rightTrackModel[60] = new ModelRendererTurbo(this, 300, 1835, textureX, textureY); // Import Box507
		rightTrackModel[61] = new ModelRendererTurbo(this, 300, 1792, textureX, textureY); // Import Box508
		rightTrackModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box509
		rightTrackModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box510
		rightTrackModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box511
		rightTrackModel[65] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 138
		rightTrackModel[66] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 139
		rightTrackModel[67] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 140
		rightTrackModel[68] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 141
		rightTrackModel[69] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 142
		rightTrackModel[70] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 143
		rightTrackModel[71] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 144
		rightTrackModel[72] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 145
		rightTrackModel[73] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 146
		rightTrackModel[74] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 147
		rightTrackModel[75] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 148
		rightTrackModel[76] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 149
		rightTrackModel[77] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 150
		rightTrackModel[78] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 151
		rightTrackModel[79] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 158
		rightTrackModel[80] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 159
		rightTrackModel[81] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 160
		rightTrackModel[82] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 161
		rightTrackModel[83] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 162
		rightTrackModel[84] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 163
		rightTrackModel[85] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 164
		rightTrackModel[86] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 171
		rightTrackModel[87] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 172
		rightTrackModel[88] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 173
		rightTrackModel[89] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 174
		rightTrackModel[90] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 175
		rightTrackModel[91] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 176
		rightTrackModel[92] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 177
		rightTrackModel[93] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 184
		rightTrackModel[94] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 185
		rightTrackModel[95] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 186
		rightTrackModel[96] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 187
		rightTrackModel[97] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 188
		rightTrackModel[98] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 189
		rightTrackModel[99] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 190
		rightTrackModel[100] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 197
		rightTrackModel[101] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 198
		rightTrackModel[102] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 199
		rightTrackModel[103] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 200
		rightTrackModel[104] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 201
		rightTrackModel[105] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 202
		rightTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 203
		rightTrackModel[107] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 210
		rightTrackModel[108] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 211
		rightTrackModel[109] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 212
		rightTrackModel[110] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 213
		rightTrackModel[111] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 214
		rightTrackModel[112] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 215
		rightTrackModel[113] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 216
		rightTrackModel[114] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 223
		rightTrackModel[115] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 224
		rightTrackModel[116] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 225
		rightTrackModel[117] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 226
		rightTrackModel[118] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 227
		rightTrackModel[119] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 228
		rightTrackModel[120] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 229
		rightTrackModel[121] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 236
		rightTrackModel[122] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 237
		rightTrackModel[123] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 238
		rightTrackModel[124] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 239
		rightTrackModel[125] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 240
		rightTrackModel[126] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 241
		rightTrackModel[127] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 242
		rightTrackModel[128] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 249
		rightTrackModel[129] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 250
		rightTrackModel[130] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 251
		rightTrackModel[131] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 252
		rightTrackModel[132] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 253
		rightTrackModel[133] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 254
		rightTrackModel[134] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 255
		rightTrackModel[135] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 262
		rightTrackModel[136] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 263
		rightTrackModel[137] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 264
		rightTrackModel[138] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 265
		rightTrackModel[139] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 266
		rightTrackModel[140] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 267
		rightTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 268
		rightTrackModel[142] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 275
		rightTrackModel[143] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 276
		rightTrackModel[144] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 277
		rightTrackModel[145] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 278
		rightTrackModel[146] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 279
		rightTrackModel[147] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 280
		rightTrackModel[148] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 281
		rightTrackModel[149] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 288
		rightTrackModel[150] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 289
		rightTrackModel[151] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 290
		rightTrackModel[152] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 291
		rightTrackModel[153] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 292
		rightTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 293
		rightTrackModel[155] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 294
		rightTrackModel[156] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 301
		rightTrackModel[157] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 302
		rightTrackModel[158] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 303
		rightTrackModel[159] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 304
		rightTrackModel[160] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 305
		rightTrackModel[161] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 306
		rightTrackModel[162] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 307
		rightTrackModel[163] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 314
		rightTrackModel[164] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 315
		rightTrackModel[165] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 316
		rightTrackModel[166] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 317
		rightTrackModel[167] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 318
		rightTrackModel[168] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 319
		rightTrackModel[169] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 320
		rightTrackModel[170] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 327
		rightTrackModel[171] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 328
		rightTrackModel[172] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 329
		rightTrackModel[173] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 330
		rightTrackModel[174] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 331
		rightTrackModel[175] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 332
		rightTrackModel[176] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 333
		rightTrackModel[177] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 340
		rightTrackModel[178] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 341
		rightTrackModel[179] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 342
		rightTrackModel[180] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 343
		rightTrackModel[181] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 344
		rightTrackModel[182] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 345
		rightTrackModel[183] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 346
		rightTrackModel[184] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 377
		rightTrackModel[185] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 378
		rightTrackModel[186] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 379
		rightTrackModel[187] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 380
		rightTrackModel[188] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 381
		rightTrackModel[189] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 382
		rightTrackModel[190] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 383
		rightTrackModel[191] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 391
		rightTrackModel[192] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 392
		rightTrackModel[193] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 393
		rightTrackModel[194] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 394
		rightTrackModel[195] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 395
		rightTrackModel[196] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 396
		rightTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 397
		rightTrackModel[198] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 405
		rightTrackModel[199] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 406
		rightTrackModel[200] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 407
		rightTrackModel[201] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 408
		rightTrackModel[202] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 409
		rightTrackModel[203] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 410
		rightTrackModel[204] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 411
		rightTrackModel[205] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 419
		rightTrackModel[206] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 420
		rightTrackModel[207] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 421
		rightTrackModel[208] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 422
		rightTrackModel[209] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 423
		rightTrackModel[210] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 424
		rightTrackModel[211] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 425
		rightTrackModel[212] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 433
		rightTrackModel[213] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 434
		rightTrackModel[214] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 435
		rightTrackModel[215] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 436
		rightTrackModel[216] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 437
		rightTrackModel[217] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 438
		rightTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 439
		rightTrackModel[219] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 447
		rightTrackModel[220] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 448
		rightTrackModel[221] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 449
		rightTrackModel[222] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 450
		rightTrackModel[223] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 451
		rightTrackModel[224] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 452
		rightTrackModel[225] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 453
		rightTrackModel[226] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 461
		rightTrackModel[227] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 462
		rightTrackModel[228] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 463
		rightTrackModel[229] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 464
		rightTrackModel[230] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 465
		rightTrackModel[231] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 466
		rightTrackModel[232] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 467
		rightTrackModel[233] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 475
		rightTrackModel[234] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 476
		rightTrackModel[235] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 477
		rightTrackModel[236] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 478
		rightTrackModel[237] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 479
		rightTrackModel[238] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 480
		rightTrackModel[239] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 481
		rightTrackModel[240] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 489
		rightTrackModel[241] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 490
		rightTrackModel[242] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 491
		rightTrackModel[243] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 492
		rightTrackModel[244] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 493
		rightTrackModel[245] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 494
		rightTrackModel[246] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 495
		rightTrackModel[247] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 503
		rightTrackModel[248] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 504
		rightTrackModel[249] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 505
		rightTrackModel[250] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 506
		rightTrackModel[251] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 507
		rightTrackModel[252] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 508
		rightTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 509
		rightTrackModel[254] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 517
		rightTrackModel[255] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 518
		rightTrackModel[256] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 519
		rightTrackModel[257] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 520
		rightTrackModel[258] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 521
		rightTrackModel[259] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 522
		rightTrackModel[260] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 523
		rightTrackModel[261] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 531
		rightTrackModel[262] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 532
		rightTrackModel[263] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 533
		rightTrackModel[264] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 534
		rightTrackModel[265] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 535
		rightTrackModel[266] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 536
		rightTrackModel[267] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 537
		rightTrackModel[268] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 545
		rightTrackModel[269] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 546
		rightTrackModel[270] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 547
		rightTrackModel[271] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 548
		rightTrackModel[272] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 549
		rightTrackModel[273] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 550
		rightTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 551
		rightTrackModel[275] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 559
		rightTrackModel[276] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 560
		rightTrackModel[277] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 561
		rightTrackModel[278] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 562
		rightTrackModel[279] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 563
		rightTrackModel[280] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 564
		rightTrackModel[281] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 565
		rightTrackModel[282] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 573
		rightTrackModel[283] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 574
		rightTrackModel[284] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 575
		rightTrackModel[285] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 576
		rightTrackModel[286] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 577
		rightTrackModel[287] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 578
		rightTrackModel[288] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 579
		rightTrackModel[289] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 587
		rightTrackModel[290] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 588
		rightTrackModel[291] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 589
		rightTrackModel[292] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 590
		rightTrackModel[293] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 591
		rightTrackModel[294] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 592
		rightTrackModel[295] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 593
		rightTrackModel[296] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 601
		rightTrackModel[297] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 602
		rightTrackModel[298] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 603
		rightTrackModel[299] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 604
		rightTrackModel[300] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 605
		rightTrackModel[301] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 606
		rightTrackModel[302] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 607
		rightTrackModel[303] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 615
		rightTrackModel[304] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 616
		rightTrackModel[305] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 617
		rightTrackModel[306] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 618
		rightTrackModel[307] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 619
		rightTrackModel[308] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 620
		rightTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 621
		rightTrackModel[310] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 629
		rightTrackModel[311] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 630
		rightTrackModel[312] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 631
		rightTrackModel[313] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 632
		rightTrackModel[314] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 633
		rightTrackModel[315] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 634
		rightTrackModel[316] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 635
		rightTrackModel[317] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 643
		rightTrackModel[318] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 644
		rightTrackModel[319] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 645
		rightTrackModel[320] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 646
		rightTrackModel[321] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 647
		rightTrackModel[322] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 648
		rightTrackModel[323] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 649
		rightTrackModel[324] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 657
		rightTrackModel[325] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 658
		rightTrackModel[326] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 659
		rightTrackModel[327] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 660
		rightTrackModel[328] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 661
		rightTrackModel[329] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 662
		rightTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 663
		rightTrackModel[331] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 671
		rightTrackModel[332] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 672
		rightTrackModel[333] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 673
		rightTrackModel[334] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 674
		rightTrackModel[335] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 675
		rightTrackModel[336] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 676
		rightTrackModel[337] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 677
		rightTrackModel[338] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 685
		rightTrackModel[339] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 686
		rightTrackModel[340] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 687
		rightTrackModel[341] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 688
		rightTrackModel[342] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 689
		rightTrackModel[343] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 690
		rightTrackModel[344] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 691
		rightTrackModel[345] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 699
		rightTrackModel[346] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 700
		rightTrackModel[347] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 701
		rightTrackModel[348] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 702
		rightTrackModel[349] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 703
		rightTrackModel[350] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 704
		rightTrackModel[351] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 705
		rightTrackModel[352] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 713
		rightTrackModel[353] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 714
		rightTrackModel[354] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 715
		rightTrackModel[355] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 716
		rightTrackModel[356] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 717
		rightTrackModel[357] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 718
		rightTrackModel[358] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 719
		rightTrackModel[359] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 727
		rightTrackModel[360] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 728
		rightTrackModel[361] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 729
		rightTrackModel[362] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 730
		rightTrackModel[363] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 731
		rightTrackModel[364] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 732
		rightTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 733
		rightTrackModel[366] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 741
		rightTrackModel[367] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 742
		rightTrackModel[368] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 743
		rightTrackModel[369] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 744
		rightTrackModel[370] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 745
		rightTrackModel[371] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 746
		rightTrackModel[372] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 747
		rightTrackModel[373] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 755
		rightTrackModel[374] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 756
		rightTrackModel[375] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 757
		rightTrackModel[376] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 758
		rightTrackModel[377] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 759
		rightTrackModel[378] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 760
		rightTrackModel[379] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 761
		rightTrackModel[380] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 769
		rightTrackModel[381] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 770
		rightTrackModel[382] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 771
		rightTrackModel[383] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 772
		rightTrackModel[384] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 773
		rightTrackModel[385] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 774
		rightTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 775
		rightTrackModel[387] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 783
		rightTrackModel[388] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 784
		rightTrackModel[389] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 785
		rightTrackModel[390] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 786
		rightTrackModel[391] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 787
		rightTrackModel[392] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 788
		rightTrackModel[393] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 789
		rightTrackModel[394] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 797
		rightTrackModel[395] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 798
		rightTrackModel[396] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 799
		rightTrackModel[397] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 800
		rightTrackModel[398] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 801
		rightTrackModel[399] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 802
		rightTrackModel[400] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 803
		rightTrackModel[401] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 811
		rightTrackModel[402] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 812
		rightTrackModel[403] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 813
		rightTrackModel[404] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 814
		rightTrackModel[405] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 815
		rightTrackModel[406] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 816
		rightTrackModel[407] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 817
		rightTrackModel[408] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 825
		rightTrackModel[409] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 826
		rightTrackModel[410] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 827
		rightTrackModel[411] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 828
		rightTrackModel[412] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 829
		rightTrackModel[413] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 830
		rightTrackModel[414] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 831
		rightTrackModel[415] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 839
		rightTrackModel[416] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 840
		rightTrackModel[417] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 841
		rightTrackModel[418] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 842
		rightTrackModel[419] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 843
		rightTrackModel[420] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 844
		rightTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 845
		rightTrackModel[422] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 853
		rightTrackModel[423] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 854
		rightTrackModel[424] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 855
		rightTrackModel[425] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 856
		rightTrackModel[426] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 857
		rightTrackModel[427] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 858
		rightTrackModel[428] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 859
		rightTrackModel[429] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 867
		rightTrackModel[430] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 868
		rightTrackModel[431] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 869
		rightTrackModel[432] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 870
		rightTrackModel[433] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 871
		rightTrackModel[434] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 872
		rightTrackModel[435] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 873
		rightTrackModel[436] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 881
		rightTrackModel[437] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 882
		rightTrackModel[438] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 883
		rightTrackModel[439] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 884
		rightTrackModel[440] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 885
		rightTrackModel[441] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 886
		rightTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 887
		rightTrackModel[443] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 895
		rightTrackModel[444] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 896
		rightTrackModel[445] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 897
		rightTrackModel[446] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 898
		rightTrackModel[447] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 899
		rightTrackModel[448] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 900
		rightTrackModel[449] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 901
		rightTrackModel[450] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 909
		rightTrackModel[451] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 910
		rightTrackModel[452] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 911
		rightTrackModel[453] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 912
		rightTrackModel[454] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 913
		rightTrackModel[455] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 914
		rightTrackModel[456] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 915
		rightTrackModel[457] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 923
		rightTrackModel[458] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 924
		rightTrackModel[459] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 925
		rightTrackModel[460] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 926
		rightTrackModel[461] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 927
		rightTrackModel[462] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 928
		rightTrackModel[463] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 929
		rightTrackModel[464] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 937
		rightTrackModel[465] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 938
		rightTrackModel[466] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 939
		rightTrackModel[467] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 940
		rightTrackModel[468] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 941
		rightTrackModel[469] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 942
		rightTrackModel[470] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 943
		rightTrackModel[471] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 951
		rightTrackModel[472] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 952
		rightTrackModel[473] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 953
		rightTrackModel[474] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 954
		rightTrackModel[475] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 955
		rightTrackModel[476] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 956
		rightTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 957
		rightTrackModel[478] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 965
		rightTrackModel[479] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 966
		rightTrackModel[480] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 967
		rightTrackModel[481] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 968
		rightTrackModel[482] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 969
		rightTrackModel[483] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 970
		rightTrackModel[484] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 971
		rightTrackModel[485] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 979
		rightTrackModel[486] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 980
		rightTrackModel[487] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 981
		rightTrackModel[488] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 982
		rightTrackModel[489] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 983
		rightTrackModel[490] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 984
		rightTrackModel[491] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 985
		rightTrackModel[492] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 993
		rightTrackModel[493] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 994
		rightTrackModel[494] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 995
		rightTrackModel[495] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 996
		rightTrackModel[496] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 997
		rightTrackModel[497] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 998
		rightTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 999
		rightTrackModel[499] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 1007

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box438
		rightTrackModel[0].setRotationPoint(62F, -11.5F, -32.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box439
		rightTrackModel[1].setRotationPoint(62F, -7.5F, -32.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box440
		rightTrackModel[2].setRotationPoint(62F, -15.5F, -32.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box441
		rightTrackModel[3].setRotationPoint(43.5F, -4F, -30.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box442
		rightTrackModel[4].setRotationPoint(43.5F, 2F, -30.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box443
		rightTrackModel[5].setRotationPoint(45.5F, 6F, -30.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box444
		rightTrackModel[6].setRotationPoint(43.5F, -8F, -30.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box445
		rightTrackModel[7].setRotationPoint(45.5F, -10F, -30.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box446
		rightTrackModel[8].setRotationPoint(27F, -10F, -30.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box447
		rightTrackModel[9].setRotationPoint(25F, -8F, -30.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box448
		rightTrackModel[10].setRotationPoint(25F, -4F, -30.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box449
		rightTrackModel[11].setRotationPoint(25F, 2F, -30.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box450
		rightTrackModel[12].setRotationPoint(27F, 6F, -30.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box451
		rightTrackModel[13].setRotationPoint(3.5F, -10F, -30.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box452
		rightTrackModel[14].setRotationPoint(1.5F, -8F, -30.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box453
		rightTrackModel[15].setRotationPoint(1.5F, -4F, -30.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box454
		rightTrackModel[16].setRotationPoint(1.5F, 2F, -30.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box455
		rightTrackModel[17].setRotationPoint(3.5F, 6F, -30.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box456
		rightTrackModel[18].setRotationPoint(-15.5F, -10F, -30.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box457
		rightTrackModel[19].setRotationPoint(-17.5F, -8F, -30.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box458
		rightTrackModel[20].setRotationPoint(-17.5F, -4F, -30.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box459
		rightTrackModel[21].setRotationPoint(-17.5F, 2F, -30.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box460
		rightTrackModel[22].setRotationPoint(-15.5F, 6F, -30.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box461
		rightTrackModel[23].setRotationPoint(-36F, -10F, -30.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box462
		rightTrackModel[24].setRotationPoint(-38F, -8F, -30.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box463
		rightTrackModel[25].setRotationPoint(-38F, -4F, -30.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box464
		rightTrackModel[26].setRotationPoint(-38F, 2F, -30.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box465
		rightTrackModel[27].setRotationPoint(-36F, 6F, -30.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box466
		rightTrackModel[28].setRotationPoint(-54.5F, -10F, -30.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box467
		rightTrackModel[29].setRotationPoint(-56.5F, -8F, -30.5F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box468
		rightTrackModel[30].setRotationPoint(-56.5F, -4F, -30.5F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box469
		rightTrackModel[31].setRotationPoint(-56.5F, 2F, -30.5F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 14, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import Box470
		rightTrackModel[32].setRotationPoint(-54.5F, 6F, -30.5F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box471
		rightTrackModel[33].setRotationPoint(-70.5F, -9F, -32.5F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box473
		rightTrackModel[34].setRotationPoint(-70.5F, -11F, -32.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box474
		rightTrackModel[35].setRotationPoint(-69.5F, -12F, -32.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box475
		rightTrackModel[36].setRotationPoint(-70.5F, -6F, -32.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box476
		rightTrackModel[37].setRotationPoint(-69.5F, -4F, -32.5F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box485
		rightTrackModel[38].setRotationPoint(-42.5F, -12F, -22.5F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box486
		rightTrackModel[39].setRotationPoint(-42.5F, -12F, -20.5F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box487
		rightTrackModel[40].setRotationPoint(-34.5F, -4F, -19.5F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box488
		rightTrackModel[41].setRotationPoint(-26.5F, -3F, -19.5F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box489
		rightTrackModel[42].setRotationPoint(-50.5F, -4F, -19.5F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box490
		rightTrackModel[43].setRotationPoint(-51.5F, -3F, -19.5F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box491
		rightTrackModel[44].setRotationPoint(-29.5F, -2F, -24.5F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box492
		rightTrackModel[45].setRotationPoint(-49.5F, -2F, -24.5F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box493
		rightTrackModel[46].setRotationPoint(-11.5F, -3F, -19.5F);

		rightTrackModel[47].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box494
		rightTrackModel[47].setRotationPoint(-10.5F, -4F, -19.5F);

		rightTrackModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box495
		rightTrackModel[48].setRotationPoint(5.5F, -4F, -19.5F);

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box496
		rightTrackModel[49].setRotationPoint(-2.5F, -12F, -20.5F);

		rightTrackModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box497
		rightTrackModel[50].setRotationPoint(-9.5F, -2F, -24.5F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box498
		rightTrackModel[51].setRotationPoint(10.5F, -2F, -24.5F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box499
		rightTrackModel[52].setRotationPoint(13.5F, -3F, -19.5F);

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box500
		rightTrackModel[53].setRotationPoint(-2.5F, -12F, -22.5F);

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box501
		rightTrackModel[54].setRotationPoint(29.5F, -3F, -19.5F);

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box502
		rightTrackModel[55].setRotationPoint(30.5F, -4F, -19.5F);

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box503
		rightTrackModel[56].setRotationPoint(46.5F, -4F, -19.5F);

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 8, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box504
		rightTrackModel[57].setRotationPoint(38.5F, -12F, -20.5F);

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box505
		rightTrackModel[58].setRotationPoint(31.5F, -2F, -24.5F);

		rightTrackModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box506
		rightTrackModel[59].setRotationPoint(51.5F, -2F, -24.5F);

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box507
		rightTrackModel[60].setRotationPoint(54.5F, -3F, -19.5F);

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box508
		rightTrackModel[61].setRotationPoint(38.5F, -12F, -22.5F);

		rightTrackModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box509
		rightTrackModel[62].setRotationPoint(66F, -10.5F, -23.5F);

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box510
		rightTrackModel[63].setRotationPoint(66F, -11.5F, -23.5F);

		rightTrackModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box511
		rightTrackModel[64].setRotationPoint(66F, -8.5F, -23.5F);

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rightTrackModel[65].setRotationPoint(66F, -16.5F, -35.5F);

		rightTrackModel[66].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 139
		rightTrackModel[66].setRotationPoint(66F, -16.5F, -35.5F);

		rightTrackModel[67].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		rightTrackModel[67].setRotationPoint(66F, -16.5F, -34.5F);

		rightTrackModel[68].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		rightTrackModel[68].setRotationPoint(66F, -16.5F, -34.5F);

		rightTrackModel[69].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		rightTrackModel[69].setRotationPoint(66F, -16.5F, -32.5F);

		rightTrackModel[70].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 143
		rightTrackModel[70].setRotationPoint(66F, -16.5F, -22.5F);

		rightTrackModel[71].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		rightTrackModel[71].setRotationPoint(66F, -16.5F, -33.5F);

		rightTrackModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		rightTrackModel[72].setRotationPoint(71F, -16.5F, -35.5F);
		rightTrackModel[72].rotateAngleZ = -0.76794487F;

		rightTrackModel[73].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 146
		rightTrackModel[73].setRotationPoint(71F, -16.5F, -35.5F);
		rightTrackModel[73].rotateAngleZ = -0.76794487F;

		rightTrackModel[74].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		rightTrackModel[74].setRotationPoint(71F, -16.5F, -34.5F);
		rightTrackModel[74].rotateAngleZ = -0.76794487F;

		rightTrackModel[75].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		rightTrackModel[75].setRotationPoint(71F, -16.5F, -34.5F);
		rightTrackModel[75].rotateAngleZ = -0.76794487F;

		rightTrackModel[76].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		rightTrackModel[76].setRotationPoint(71F, -16.5F, -32.5F);
		rightTrackModel[76].rotateAngleZ = -0.76794487F;

		rightTrackModel[77].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 150
		rightTrackModel[77].setRotationPoint(71F, -16.5F, -22.5F);
		rightTrackModel[77].rotateAngleZ = -0.76794487F;

		rightTrackModel[78].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		rightTrackModel[78].setRotationPoint(71F, -16.5F, -33.5F);
		rightTrackModel[78].rotateAngleZ = -0.76794487F;

		rightTrackModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightTrackModel[79].setRotationPoint(74.6F, -13F, -35.5F);
		rightTrackModel[79].rotateAngleZ = -1.57079633F;

		rightTrackModel[80].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 159
		rightTrackModel[80].setRotationPoint(74.6F, -13F, -35.5F);
		rightTrackModel[80].rotateAngleZ = -1.57079633F;

		rightTrackModel[81].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		rightTrackModel[81].setRotationPoint(74.6F, -13F, -34.5F);
		rightTrackModel[81].rotateAngleZ = -1.57079633F;

		rightTrackModel[82].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightTrackModel[82].setRotationPoint(74.6F, -13F, -34.5F);
		rightTrackModel[82].rotateAngleZ = -1.57079633F;

		rightTrackModel[83].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		rightTrackModel[83].setRotationPoint(74.6F, -13F, -32.5F);
		rightTrackModel[83].rotateAngleZ = -1.57079633F;

		rightTrackModel[84].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 163
		rightTrackModel[84].setRotationPoint(74.6F, -13F, -22.5F);
		rightTrackModel[84].rotateAngleZ = -1.57079633F;

		rightTrackModel[85].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightTrackModel[85].setRotationPoint(74.6F, -13F, -33.5F);
		rightTrackModel[85].rotateAngleZ = -1.57079633F;

		rightTrackModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightTrackModel[86].setRotationPoint(74.6F, -8F, -35.5F);
		rightTrackModel[86].rotateAngleZ = -2.00712864F;

		rightTrackModel[87].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 172
		rightTrackModel[87].setRotationPoint(74.6F, -8F, -35.5F);
		rightTrackModel[87].rotateAngleZ = -2.00712864F;

		rightTrackModel[88].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		rightTrackModel[88].setRotationPoint(74.6F, -8F, -34.5F);
		rightTrackModel[88].rotateAngleZ = -2.00712864F;

		rightTrackModel[89].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		rightTrackModel[89].setRotationPoint(74.6F, -8F, -34.5F);
		rightTrackModel[89].rotateAngleZ = -2.00712864F;

		rightTrackModel[90].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightTrackModel[90].setRotationPoint(74.6F, -8F, -32.5F);
		rightTrackModel[90].rotateAngleZ = -2.00712864F;

		rightTrackModel[91].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 176
		rightTrackModel[91].setRotationPoint(74.6F, -8F, -22.5F);
		rightTrackModel[91].rotateAngleZ = -2.00712864F;

		rightTrackModel[92].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightTrackModel[92].setRotationPoint(74.6F, -8F, -33.5F);
		rightTrackModel[92].rotateAngleZ = -2.00712864F;

		rightTrackModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		rightTrackModel[93].setRotationPoint(72.5F, -3.5F, -35.5F);
		rightTrackModel[93].rotateAngleZ = -2.30383461F;

		rightTrackModel[94].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 185
		rightTrackModel[94].setRotationPoint(72.5F, -3.5F, -35.5F);
		rightTrackModel[94].rotateAngleZ = -2.30383461F;

		rightTrackModel[95].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		rightTrackModel[95].setRotationPoint(72.5F, -3.5F, -34.5F);
		rightTrackModel[95].rotateAngleZ = -2.30383461F;

		rightTrackModel[96].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		rightTrackModel[96].setRotationPoint(72.5F, -3.5F, -34.5F);
		rightTrackModel[96].rotateAngleZ = -2.30383461F;

		rightTrackModel[97].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		rightTrackModel[97].setRotationPoint(72.5F, -3.5F, -32.5F);
		rightTrackModel[97].rotateAngleZ = -2.30383461F;

		rightTrackModel[98].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 189
		rightTrackModel[98].setRotationPoint(72.5F, -3.5F, -22.5F);
		rightTrackModel[98].rotateAngleZ = -2.30383461F;

		rightTrackModel[99].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightTrackModel[99].setRotationPoint(72.5F, -3.5F, -33.5F);
		rightTrackModel[99].rotateAngleZ = -2.30383461F;

		rightTrackModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightTrackModel[100].setRotationPoint(69.1F, 0.2F, -35.5F);
		rightTrackModel[100].rotateAngleZ = -2.42600766F;

		rightTrackModel[101].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 198
		rightTrackModel[101].setRotationPoint(69.1F, 0.2F, -35.5F);
		rightTrackModel[101].rotateAngleZ = -2.42600766F;

		rightTrackModel[102].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightTrackModel[102].setRotationPoint(69.1F, 0.2F, -34.5F);
		rightTrackModel[102].rotateAngleZ = -2.42600766F;

		rightTrackModel[103].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rightTrackModel[103].setRotationPoint(69.1F, 0.2F, -34.5F);
		rightTrackModel[103].rotateAngleZ = -2.42600766F;

		rightTrackModel[104].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightTrackModel[104].setRotationPoint(69.1F, 0.2F, -32.5F);
		rightTrackModel[104].rotateAngleZ = -2.42600766F;

		rightTrackModel[105].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 202
		rightTrackModel[105].setRotationPoint(69.1F, 0.2F, -22.5F);
		rightTrackModel[105].rotateAngleZ = -2.42600766F;

		rightTrackModel[106].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightTrackModel[106].setRotationPoint(69.1F, 0.2F, -33.5F);
		rightTrackModel[106].rotateAngleZ = -2.42600766F;

		rightTrackModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightTrackModel[107].setRotationPoint(65.4F, 3.5F, -35.5F);
		rightTrackModel[107].rotateAngleZ = -2.49582083F;

		rightTrackModel[108].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 211
		rightTrackModel[108].setRotationPoint(65.4F, 3.5F, -35.5F);
		rightTrackModel[108].rotateAngleZ = -2.49582083F;

		rightTrackModel[109].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightTrackModel[109].setRotationPoint(65.4F, 3.5F, -34.5F);
		rightTrackModel[109].rotateAngleZ = -2.49582083F;

		rightTrackModel[110].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightTrackModel[110].setRotationPoint(65.4F, 3.5F, -34.5F);
		rightTrackModel[110].rotateAngleZ = -2.49582083F;

		rightTrackModel[111].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightTrackModel[111].setRotationPoint(65.4F, 3.5F, -32.5F);
		rightTrackModel[111].rotateAngleZ = -2.49582083F;

		rightTrackModel[112].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 215
		rightTrackModel[112].setRotationPoint(65.4F, 3.5F, -22.5F);
		rightTrackModel[112].rotateAngleZ = -2.49582083F;

		rightTrackModel[113].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightTrackModel[113].setRotationPoint(65.4F, 3.5F, -33.5F);
		rightTrackModel[113].rotateAngleZ = -2.49582083F;

		rightTrackModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackModel[114].setRotationPoint(61.4F, 6.5F, -35.5F);
		rightTrackModel[114].rotateAngleZ = -2.63544717F;

		rightTrackModel[115].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 224
		rightTrackModel[115].setRotationPoint(61.4F, 6.5F, -35.5F);
		rightTrackModel[115].rotateAngleZ = -2.63544717F;

		rightTrackModel[116].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightTrackModel[116].setRotationPoint(61.4F, 6.5F, -34.5F);
		rightTrackModel[116].rotateAngleZ = -2.63544717F;

		rightTrackModel[117].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightTrackModel[117].setRotationPoint(61.4F, 6.5F, -34.5F);
		rightTrackModel[117].rotateAngleZ = -2.63544717F;

		rightTrackModel[118].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackModel[118].setRotationPoint(61.4F, 6.5F, -32.5F);
		rightTrackModel[118].rotateAngleZ = -2.63544717F;

		rightTrackModel[119].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 228
		rightTrackModel[119].setRotationPoint(61.4F, 6.5F, -22.5F);
		rightTrackModel[119].rotateAngleZ = -2.63544717F;

		rightTrackModel[120].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackModel[120].setRotationPoint(61.4F, 6.5F, -33.5F);
		rightTrackModel[120].rotateAngleZ = -2.63544717F;

		rightTrackModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightTrackModel[121].setRotationPoint(57F, 9F, -35.5F);
		rightTrackModel[121].rotateAngleZ = -3.14159265F;

		rightTrackModel[122].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 237
		rightTrackModel[122].setRotationPoint(57F, 9F, -35.5F);
		rightTrackModel[122].rotateAngleZ = -3.14159265F;

		rightTrackModel[123].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackModel[123].setRotationPoint(57F, 9F, -34.5F);
		rightTrackModel[123].rotateAngleZ = -3.14159265F;

		rightTrackModel[124].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightTrackModel[124].setRotationPoint(57F, 9F, -34.5F);
		rightTrackModel[124].rotateAngleZ = -3.14159265F;

		rightTrackModel[125].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackModel[125].setRotationPoint(57F, 9F, -32.5F);
		rightTrackModel[125].rotateAngleZ = -3.14159265F;

		rightTrackModel[126].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 241
		rightTrackModel[126].setRotationPoint(57F, 9F, -22.5F);
		rightTrackModel[126].rotateAngleZ = -3.14159265F;

		rightTrackModel[127].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightTrackModel[127].setRotationPoint(57F, 9F, -33.5F);
		rightTrackModel[127].rotateAngleZ = -3.14159265F;

		rightTrackModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackModel[128].setRotationPoint(52F, 9F, -35.5F);
		rightTrackModel[128].rotateAngleZ = -3.14159265F;

		rightTrackModel[129].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 250
		rightTrackModel[129].setRotationPoint(52F, 9F, -35.5F);
		rightTrackModel[129].rotateAngleZ = -3.14159265F;

		rightTrackModel[130].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightTrackModel[130].setRotationPoint(52F, 9F, -34.5F);
		rightTrackModel[130].rotateAngleZ = -3.14159265F;

		rightTrackModel[131].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		rightTrackModel[131].setRotationPoint(52F, 9F, -34.5F);
		rightTrackModel[131].rotateAngleZ = -3.14159265F;

		rightTrackModel[132].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		rightTrackModel[132].setRotationPoint(52F, 9F, -32.5F);
		rightTrackModel[132].rotateAngleZ = -3.14159265F;

		rightTrackModel[133].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 254
		rightTrackModel[133].setRotationPoint(52F, 9F, -22.5F);
		rightTrackModel[133].rotateAngleZ = -3.14159265F;

		rightTrackModel[134].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		rightTrackModel[134].setRotationPoint(52F, 9F, -33.5F);
		rightTrackModel[134].rotateAngleZ = -3.14159265F;

		rightTrackModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		rightTrackModel[135].setRotationPoint(47F, 9F, -35.5F);
		rightTrackModel[135].rotateAngleZ = -3.14159265F;

		rightTrackModel[136].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 263
		rightTrackModel[136].setRotationPoint(47F, 9F, -35.5F);
		rightTrackModel[136].rotateAngleZ = -3.14159265F;

		rightTrackModel[137].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightTrackModel[137].setRotationPoint(47F, 9F, -34.5F);
		rightTrackModel[137].rotateAngleZ = -3.14159265F;

		rightTrackModel[138].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightTrackModel[138].setRotationPoint(47F, 9F, -34.5F);
		rightTrackModel[138].rotateAngleZ = -3.14159265F;

		rightTrackModel[139].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		rightTrackModel[139].setRotationPoint(47F, 9F, -32.5F);
		rightTrackModel[139].rotateAngleZ = -3.14159265F;

		rightTrackModel[140].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 267
		rightTrackModel[140].setRotationPoint(47F, 9F, -22.5F);
		rightTrackModel[140].rotateAngleZ = -3.14159265F;

		rightTrackModel[141].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightTrackModel[141].setRotationPoint(47F, 9F, -33.5F);
		rightTrackModel[141].rotateAngleZ = -3.14159265F;

		rightTrackModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		rightTrackModel[142].setRotationPoint(42F, 9F, -35.5F);
		rightTrackModel[142].rotateAngleZ = -3.14159265F;

		rightTrackModel[143].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 276
		rightTrackModel[143].setRotationPoint(42F, 9F, -35.5F);
		rightTrackModel[143].rotateAngleZ = -3.14159265F;

		rightTrackModel[144].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		rightTrackModel[144].setRotationPoint(42F, 9F, -34.5F);
		rightTrackModel[144].rotateAngleZ = -3.14159265F;

		rightTrackModel[145].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightTrackModel[145].setRotationPoint(42F, 9F, -34.5F);
		rightTrackModel[145].rotateAngleZ = -3.14159265F;

		rightTrackModel[146].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightTrackModel[146].setRotationPoint(42F, 9F, -32.5F);
		rightTrackModel[146].rotateAngleZ = -3.14159265F;

		rightTrackModel[147].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 280
		rightTrackModel[147].setRotationPoint(42F, 9F, -22.5F);
		rightTrackModel[147].rotateAngleZ = -3.14159265F;

		rightTrackModel[148].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightTrackModel[148].setRotationPoint(42F, 9F, -33.5F);
		rightTrackModel[148].rotateAngleZ = -3.14159265F;

		rightTrackModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightTrackModel[149].setRotationPoint(37F, 9F, -35.5F);
		rightTrackModel[149].rotateAngleZ = -3.14159265F;

		rightTrackModel[150].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 289
		rightTrackModel[150].setRotationPoint(37F, 9F, -35.5F);
		rightTrackModel[150].rotateAngleZ = -3.14159265F;

		rightTrackModel[151].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackModel[151].setRotationPoint(37F, 9F, -34.5F);
		rightTrackModel[151].rotateAngleZ = -3.14159265F;

		rightTrackModel[152].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackModel[152].setRotationPoint(37F, 9F, -34.5F);
		rightTrackModel[152].rotateAngleZ = -3.14159265F;

		rightTrackModel[153].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackModel[153].setRotationPoint(37F, 9F, -32.5F);
		rightTrackModel[153].rotateAngleZ = -3.14159265F;

		rightTrackModel[154].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 293
		rightTrackModel[154].setRotationPoint(37F, 9F, -22.5F);
		rightTrackModel[154].rotateAngleZ = -3.14159265F;

		rightTrackModel[155].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackModel[155].setRotationPoint(37F, 9F, -33.5F);
		rightTrackModel[155].rotateAngleZ = -3.14159265F;

		rightTrackModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightTrackModel[156].setRotationPoint(32F, 9F, -35.5F);
		rightTrackModel[156].rotateAngleZ = -3.14159265F;

		rightTrackModel[157].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 302
		rightTrackModel[157].setRotationPoint(32F, 9F, -35.5F);
		rightTrackModel[157].rotateAngleZ = -3.14159265F;

		rightTrackModel[158].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightTrackModel[158].setRotationPoint(32F, 9F, -34.5F);
		rightTrackModel[158].rotateAngleZ = -3.14159265F;

		rightTrackModel[159].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightTrackModel[159].setRotationPoint(32F, 9F, -34.5F);
		rightTrackModel[159].rotateAngleZ = -3.14159265F;

		rightTrackModel[160].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightTrackModel[160].setRotationPoint(32F, 9F, -32.5F);
		rightTrackModel[160].rotateAngleZ = -3.14159265F;

		rightTrackModel[161].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 306
		rightTrackModel[161].setRotationPoint(32F, 9F, -22.5F);
		rightTrackModel[161].rotateAngleZ = -3.14159265F;

		rightTrackModel[162].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		rightTrackModel[162].setRotationPoint(32F, 9F, -33.5F);
		rightTrackModel[162].rotateAngleZ = -3.14159265F;

		rightTrackModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightTrackModel[163].setRotationPoint(27F, 9F, -35.5F);
		rightTrackModel[163].rotateAngleZ = -3.14159265F;

		rightTrackModel[164].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 315
		rightTrackModel[164].setRotationPoint(27F, 9F, -35.5F);
		rightTrackModel[164].rotateAngleZ = -3.14159265F;

		rightTrackModel[165].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightTrackModel[165].setRotationPoint(27F, 9F, -34.5F);
		rightTrackModel[165].rotateAngleZ = -3.14159265F;

		rightTrackModel[166].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightTrackModel[166].setRotationPoint(27F, 9F, -34.5F);
		rightTrackModel[166].rotateAngleZ = -3.14159265F;

		rightTrackModel[167].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightTrackModel[167].setRotationPoint(27F, 9F, -32.5F);
		rightTrackModel[167].rotateAngleZ = -3.14159265F;

		rightTrackModel[168].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 319
		rightTrackModel[168].setRotationPoint(27F, 9F, -22.5F);
		rightTrackModel[168].rotateAngleZ = -3.14159265F;

		rightTrackModel[169].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		rightTrackModel[169].setRotationPoint(27F, 9F, -33.5F);
		rightTrackModel[169].rotateAngleZ = -3.14159265F;

		rightTrackModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		rightTrackModel[170].setRotationPoint(22F, 9F, -35.5F);
		rightTrackModel[170].rotateAngleZ = -3.14159265F;

		rightTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 328
		rightTrackModel[171].setRotationPoint(22F, 9F, -35.5F);
		rightTrackModel[171].rotateAngleZ = -3.14159265F;

		rightTrackModel[172].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		rightTrackModel[172].setRotationPoint(22F, 9F, -34.5F);
		rightTrackModel[172].rotateAngleZ = -3.14159265F;

		rightTrackModel[173].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightTrackModel[173].setRotationPoint(22F, 9F, -34.5F);
		rightTrackModel[173].rotateAngleZ = -3.14159265F;

		rightTrackModel[174].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		rightTrackModel[174].setRotationPoint(22F, 9F, -32.5F);
		rightTrackModel[174].rotateAngleZ = -3.14159265F;

		rightTrackModel[175].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 332
		rightTrackModel[175].setRotationPoint(22F, 9F, -22.5F);
		rightTrackModel[175].rotateAngleZ = -3.14159265F;

		rightTrackModel[176].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		rightTrackModel[176].setRotationPoint(22F, 9F, -33.5F);
		rightTrackModel[176].rotateAngleZ = -3.14159265F;

		rightTrackModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightTrackModel[177].setRotationPoint(17F, 9F, -35.5F);
		rightTrackModel[177].rotateAngleZ = -3.14159265F;

		rightTrackModel[178].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 341
		rightTrackModel[178].setRotationPoint(17F, 9F, -35.5F);
		rightTrackModel[178].rotateAngleZ = -3.14159265F;

		rightTrackModel[179].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		rightTrackModel[179].setRotationPoint(17F, 9F, -34.5F);
		rightTrackModel[179].rotateAngleZ = -3.14159265F;

		rightTrackModel[180].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		rightTrackModel[180].setRotationPoint(17F, 9F, -34.5F);
		rightTrackModel[180].rotateAngleZ = -3.14159265F;

		rightTrackModel[181].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		rightTrackModel[181].setRotationPoint(17F, 9F, -32.5F);
		rightTrackModel[181].rotateAngleZ = -3.14159265F;

		rightTrackModel[182].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 345
		rightTrackModel[182].setRotationPoint(17F, 9F, -22.5F);
		rightTrackModel[182].rotateAngleZ = -3.14159265F;

		rightTrackModel[183].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightTrackModel[183].setRotationPoint(17F, 9F, -33.5F);
		rightTrackModel[183].rotateAngleZ = -3.14159265F;

		rightTrackModel[184].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		rightTrackModel[184].setRotationPoint(12F, 9F, -34.5F);
		rightTrackModel[184].rotateAngleZ = -3.14159265F;

		rightTrackModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		rightTrackModel[185].setRotationPoint(12F, 9F, -35.5F);
		rightTrackModel[185].rotateAngleZ = -3.14159265F;

		rightTrackModel[186].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 379
		rightTrackModel[186].setRotationPoint(12F, 9F, -35.5F);
		rightTrackModel[186].rotateAngleZ = -3.14159265F;

		rightTrackModel[187].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		rightTrackModel[187].setRotationPoint(12F, 9F, -34.5F);
		rightTrackModel[187].rotateAngleZ = -3.14159265F;

		rightTrackModel[188].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		rightTrackModel[188].setRotationPoint(12F, 9F, -33.5F);
		rightTrackModel[188].rotateAngleZ = -3.14159265F;

		rightTrackModel[189].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		rightTrackModel[189].setRotationPoint(12F, 9F, -32.5F);
		rightTrackModel[189].rotateAngleZ = -3.14159265F;

		rightTrackModel[190].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 383
		rightTrackModel[190].setRotationPoint(12F, 9F, -22.5F);
		rightTrackModel[190].rotateAngleZ = -3.14159265F;

		rightTrackModel[191].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		rightTrackModel[191].setRotationPoint(7F, 9F, -34.5F);
		rightTrackModel[191].rotateAngleZ = -3.14159265F;

		rightTrackModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		rightTrackModel[192].setRotationPoint(7F, 9F, -35.5F);
		rightTrackModel[192].rotateAngleZ = -3.14159265F;

		rightTrackModel[193].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 393
		rightTrackModel[193].setRotationPoint(7F, 9F, -35.5F);
		rightTrackModel[193].rotateAngleZ = -3.14159265F;

		rightTrackModel[194].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		rightTrackModel[194].setRotationPoint(7F, 9F, -34.5F);
		rightTrackModel[194].rotateAngleZ = -3.14159265F;

		rightTrackModel[195].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		rightTrackModel[195].setRotationPoint(7F, 9F, -33.5F);
		rightTrackModel[195].rotateAngleZ = -3.14159265F;

		rightTrackModel[196].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightTrackModel[196].setRotationPoint(7F, 9F, -32.5F);
		rightTrackModel[196].rotateAngleZ = -3.14159265F;

		rightTrackModel[197].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 397
		rightTrackModel[197].setRotationPoint(7F, 9F, -22.5F);
		rightTrackModel[197].rotateAngleZ = -3.14159265F;

		rightTrackModel[198].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		rightTrackModel[198].setRotationPoint(2F, 9F, -34.5F);
		rightTrackModel[198].rotateAngleZ = -3.14159265F;

		rightTrackModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		rightTrackModel[199].setRotationPoint(2F, 9F, -35.5F);
		rightTrackModel[199].rotateAngleZ = -3.14159265F;

		rightTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 407
		rightTrackModel[200].setRotationPoint(2F, 9F, -35.5F);
		rightTrackModel[200].rotateAngleZ = -3.14159265F;

		rightTrackModel[201].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		rightTrackModel[201].setRotationPoint(2F, 9F, -34.5F);
		rightTrackModel[201].rotateAngleZ = -3.14159265F;

		rightTrackModel[202].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		rightTrackModel[202].setRotationPoint(2F, 9F, -33.5F);
		rightTrackModel[202].rotateAngleZ = -3.14159265F;

		rightTrackModel[203].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		rightTrackModel[203].setRotationPoint(2F, 9F, -32.5F);
		rightTrackModel[203].rotateAngleZ = -3.14159265F;

		rightTrackModel[204].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 411
		rightTrackModel[204].setRotationPoint(2F, 9F, -22.5F);
		rightTrackModel[204].rotateAngleZ = -3.14159265F;

		rightTrackModel[205].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		rightTrackModel[205].setRotationPoint(-3F, 9F, -34.5F);
		rightTrackModel[205].rotateAngleZ = -3.14159265F;

		rightTrackModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		rightTrackModel[206].setRotationPoint(-3F, 9F, -35.5F);
		rightTrackModel[206].rotateAngleZ = -3.14159265F;

		rightTrackModel[207].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 421
		rightTrackModel[207].setRotationPoint(-3F, 9F, -35.5F);
		rightTrackModel[207].rotateAngleZ = -3.14159265F;

		rightTrackModel[208].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		rightTrackModel[208].setRotationPoint(-3F, 9F, -34.5F);
		rightTrackModel[208].rotateAngleZ = -3.14159265F;

		rightTrackModel[209].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		rightTrackModel[209].setRotationPoint(-3F, 9F, -33.5F);
		rightTrackModel[209].rotateAngleZ = -3.14159265F;

		rightTrackModel[210].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		rightTrackModel[210].setRotationPoint(-3F, 9F, -32.5F);
		rightTrackModel[210].rotateAngleZ = -3.14159265F;

		rightTrackModel[211].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 425
		rightTrackModel[211].setRotationPoint(-3F, 9F, -22.5F);
		rightTrackModel[211].rotateAngleZ = -3.14159265F;

		rightTrackModel[212].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		rightTrackModel[212].setRotationPoint(-8F, 9F, -34.5F);
		rightTrackModel[212].rotateAngleZ = -3.14159265F;

		rightTrackModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightTrackModel[213].setRotationPoint(-8F, 9F, -35.5F);
		rightTrackModel[213].rotateAngleZ = -3.14159265F;

		rightTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 435
		rightTrackModel[214].setRotationPoint(-8F, 9F, -35.5F);
		rightTrackModel[214].rotateAngleZ = -3.14159265F;

		rightTrackModel[215].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		rightTrackModel[215].setRotationPoint(-8F, 9F, -34.5F);
		rightTrackModel[215].rotateAngleZ = -3.14159265F;

		rightTrackModel[216].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		rightTrackModel[216].setRotationPoint(-8F, 9F, -33.5F);
		rightTrackModel[216].rotateAngleZ = -3.14159265F;

		rightTrackModel[217].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		rightTrackModel[217].setRotationPoint(-8F, 9F, -32.5F);
		rightTrackModel[217].rotateAngleZ = -3.14159265F;

		rightTrackModel[218].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 439
		rightTrackModel[218].setRotationPoint(-8F, 9F, -22.5F);
		rightTrackModel[218].rotateAngleZ = -3.14159265F;

		rightTrackModel[219].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightTrackModel[219].setRotationPoint(-13F, 9F, -34.5F);
		rightTrackModel[219].rotateAngleZ = -3.14159265F;

		rightTrackModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		rightTrackModel[220].setRotationPoint(-13F, 9F, -35.5F);
		rightTrackModel[220].rotateAngleZ = -3.14159265F;

		rightTrackModel[221].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 449
		rightTrackModel[221].setRotationPoint(-13F, 9F, -35.5F);
		rightTrackModel[221].rotateAngleZ = -3.14159265F;

		rightTrackModel[222].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		rightTrackModel[222].setRotationPoint(-13F, 9F, -34.5F);
		rightTrackModel[222].rotateAngleZ = -3.14159265F;

		rightTrackModel[223].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightTrackModel[223].setRotationPoint(-13F, 9F, -33.5F);
		rightTrackModel[223].rotateAngleZ = -3.14159265F;

		rightTrackModel[224].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		rightTrackModel[224].setRotationPoint(-13F, 9F, -32.5F);
		rightTrackModel[224].rotateAngleZ = -3.14159265F;

		rightTrackModel[225].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 453
		rightTrackModel[225].setRotationPoint(-13F, 9F, -22.5F);
		rightTrackModel[225].rotateAngleZ = -3.14159265F;

		rightTrackModel[226].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackModel[226].setRotationPoint(-18F, 9F, -34.5F);
		rightTrackModel[226].rotateAngleZ = -3.14159265F;

		rightTrackModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		rightTrackModel[227].setRotationPoint(-18F, 9F, -35.5F);
		rightTrackModel[227].rotateAngleZ = -3.14159265F;

		rightTrackModel[228].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 463
		rightTrackModel[228].setRotationPoint(-18F, 9F, -35.5F);
		rightTrackModel[228].rotateAngleZ = -3.14159265F;

		rightTrackModel[229].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		rightTrackModel[229].setRotationPoint(-18F, 9F, -34.5F);
		rightTrackModel[229].rotateAngleZ = -3.14159265F;

		rightTrackModel[230].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightTrackModel[230].setRotationPoint(-18F, 9F, -33.5F);
		rightTrackModel[230].rotateAngleZ = -3.14159265F;

		rightTrackModel[231].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightTrackModel[231].setRotationPoint(-18F, 9F, -32.5F);
		rightTrackModel[231].rotateAngleZ = -3.14159265F;

		rightTrackModel[232].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 467
		rightTrackModel[232].setRotationPoint(-18F, 9F, -22.5F);
		rightTrackModel[232].rotateAngleZ = -3.14159265F;

		rightTrackModel[233].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		rightTrackModel[233].setRotationPoint(-23F, 9F, -34.5F);
		rightTrackModel[233].rotateAngleZ = -3.14159265F;

		rightTrackModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		rightTrackModel[234].setRotationPoint(-23F, 9F, -35.5F);
		rightTrackModel[234].rotateAngleZ = -3.14159265F;

		rightTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 477
		rightTrackModel[235].setRotationPoint(-23F, 9F, -35.5F);
		rightTrackModel[235].rotateAngleZ = -3.14159265F;

		rightTrackModel[236].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		rightTrackModel[236].setRotationPoint(-23F, 9F, -34.5F);
		rightTrackModel[236].rotateAngleZ = -3.14159265F;

		rightTrackModel[237].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		rightTrackModel[237].setRotationPoint(-23F, 9F, -33.5F);
		rightTrackModel[237].rotateAngleZ = -3.14159265F;

		rightTrackModel[238].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightTrackModel[238].setRotationPoint(-23F, 9F, -32.5F);
		rightTrackModel[238].rotateAngleZ = -3.14159265F;

		rightTrackModel[239].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 481
		rightTrackModel[239].setRotationPoint(-23F, 9F, -22.5F);
		rightTrackModel[239].rotateAngleZ = -3.14159265F;

		rightTrackModel[240].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		rightTrackModel[240].setRotationPoint(-28F, 9F, -34.5F);
		rightTrackModel[240].rotateAngleZ = -3.14159265F;

		rightTrackModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		rightTrackModel[241].setRotationPoint(-28F, 9F, -35.5F);
		rightTrackModel[241].rotateAngleZ = -3.14159265F;

		rightTrackModel[242].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 491
		rightTrackModel[242].setRotationPoint(-28F, 9F, -35.5F);
		rightTrackModel[242].rotateAngleZ = -3.14159265F;

		rightTrackModel[243].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		rightTrackModel[243].setRotationPoint(-28F, 9F, -34.5F);
		rightTrackModel[243].rotateAngleZ = -3.14159265F;

		rightTrackModel[244].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightTrackModel[244].setRotationPoint(-28F, 9F, -33.5F);
		rightTrackModel[244].rotateAngleZ = -3.14159265F;

		rightTrackModel[245].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		rightTrackModel[245].setRotationPoint(-28F, 9F, -32.5F);
		rightTrackModel[245].rotateAngleZ = -3.14159265F;

		rightTrackModel[246].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 495
		rightTrackModel[246].setRotationPoint(-28F, 9F, -22.5F);
		rightTrackModel[246].rotateAngleZ = -3.14159265F;

		rightTrackModel[247].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightTrackModel[247].setRotationPoint(-33F, 9F, -34.5F);
		rightTrackModel[247].rotateAngleZ = -3.14159265F;

		rightTrackModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		rightTrackModel[248].setRotationPoint(-33F, 9F, -35.5F);
		rightTrackModel[248].rotateAngleZ = -3.14159265F;

		rightTrackModel[249].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 505
		rightTrackModel[249].setRotationPoint(-33F, 9F, -35.5F);
		rightTrackModel[249].rotateAngleZ = -3.14159265F;

		rightTrackModel[250].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		rightTrackModel[250].setRotationPoint(-33F, 9F, -34.5F);
		rightTrackModel[250].rotateAngleZ = -3.14159265F;

		rightTrackModel[251].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		rightTrackModel[251].setRotationPoint(-33F, 9F, -33.5F);
		rightTrackModel[251].rotateAngleZ = -3.14159265F;

		rightTrackModel[252].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		rightTrackModel[252].setRotationPoint(-33F, 9F, -32.5F);
		rightTrackModel[252].rotateAngleZ = -3.14159265F;

		rightTrackModel[253].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 509
		rightTrackModel[253].setRotationPoint(-33F, 9F, -22.5F);
		rightTrackModel[253].rotateAngleZ = -3.14159265F;

		rightTrackModel[254].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		rightTrackModel[254].setRotationPoint(-38F, 9F, -34.5F);
		rightTrackModel[254].rotateAngleZ = -3.14159265F;

		rightTrackModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightTrackModel[255].setRotationPoint(-38F, 9F, -35.5F);
		rightTrackModel[255].rotateAngleZ = -3.14159265F;

		rightTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 519
		rightTrackModel[256].setRotationPoint(-38F, 9F, -35.5F);
		rightTrackModel[256].rotateAngleZ = -3.14159265F;

		rightTrackModel[257].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		rightTrackModel[257].setRotationPoint(-38F, 9F, -34.5F);
		rightTrackModel[257].rotateAngleZ = -3.14159265F;

		rightTrackModel[258].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		rightTrackModel[258].setRotationPoint(-38F, 9F, -33.5F);
		rightTrackModel[258].rotateAngleZ = -3.14159265F;

		rightTrackModel[259].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		rightTrackModel[259].setRotationPoint(-38F, 9F, -32.5F);
		rightTrackModel[259].rotateAngleZ = -3.14159265F;

		rightTrackModel[260].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 523
		rightTrackModel[260].setRotationPoint(-38F, 9F, -22.5F);
		rightTrackModel[260].rotateAngleZ = -3.14159265F;

		rightTrackModel[261].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		rightTrackModel[261].setRotationPoint(-43F, 9F, -34.5F);
		rightTrackModel[261].rotateAngleZ = -3.14159265F;

		rightTrackModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		rightTrackModel[262].setRotationPoint(-43F, 9F, -35.5F);
		rightTrackModel[262].rotateAngleZ = -3.14159265F;

		rightTrackModel[263].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 533
		rightTrackModel[263].setRotationPoint(-43F, 9F, -35.5F);
		rightTrackModel[263].rotateAngleZ = -3.14159265F;

		rightTrackModel[264].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		rightTrackModel[264].setRotationPoint(-43F, 9F, -34.5F);
		rightTrackModel[264].rotateAngleZ = -3.14159265F;

		rightTrackModel[265].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		rightTrackModel[265].setRotationPoint(-43F, 9F, -33.5F);
		rightTrackModel[265].rotateAngleZ = -3.14159265F;

		rightTrackModel[266].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		rightTrackModel[266].setRotationPoint(-43F, 9F, -32.5F);
		rightTrackModel[266].rotateAngleZ = -3.14159265F;

		rightTrackModel[267].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 537
		rightTrackModel[267].setRotationPoint(-43F, 9F, -22.5F);
		rightTrackModel[267].rotateAngleZ = -3.14159265F;

		rightTrackModel[268].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		rightTrackModel[268].setRotationPoint(-48F, 9F, -34.5F);
		rightTrackModel[268].rotateAngleZ = -3.14159265F;

		rightTrackModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		rightTrackModel[269].setRotationPoint(-48F, 9F, -35.5F);
		rightTrackModel[269].rotateAngleZ = -3.14159265F;

		rightTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 547
		rightTrackModel[270].setRotationPoint(-48F, 9F, -35.5F);
		rightTrackModel[270].rotateAngleZ = -3.14159265F;

		rightTrackModel[271].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		rightTrackModel[271].setRotationPoint(-48F, 9F, -34.5F);
		rightTrackModel[271].rotateAngleZ = -3.14159265F;

		rightTrackModel[272].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		rightTrackModel[272].setRotationPoint(-48F, 9F, -33.5F);
		rightTrackModel[272].rotateAngleZ = -3.14159265F;

		rightTrackModel[273].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		rightTrackModel[273].setRotationPoint(-48F, 9F, -32.5F);
		rightTrackModel[273].rotateAngleZ = -3.14159265F;

		rightTrackModel[274].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 551
		rightTrackModel[274].setRotationPoint(-48F, 9F, -22.5F);
		rightTrackModel[274].rotateAngleZ = -3.14159265F;

		rightTrackModel[275].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightTrackModel[275].setRotationPoint(-53F, 9F, -34.5F);
		rightTrackModel[275].rotateAngleZ = -3.43829863F;

		rightTrackModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		rightTrackModel[276].setRotationPoint(-53F, 9F, -35.5F);
		rightTrackModel[276].rotateAngleZ = -3.43829863F;

		rightTrackModel[277].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 561
		rightTrackModel[277].setRotationPoint(-53F, 9F, -35.5F);
		rightTrackModel[277].rotateAngleZ = -3.43829863F;

		rightTrackModel[278].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		rightTrackModel[278].setRotationPoint(-53F, 9F, -34.5F);
		rightTrackModel[278].rotateAngleZ = -3.43829863F;

		rightTrackModel[279].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		rightTrackModel[279].setRotationPoint(-53F, 9F, -33.5F);
		rightTrackModel[279].rotateAngleZ = -3.43829863F;

		rightTrackModel[280].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		rightTrackModel[280].setRotationPoint(-53F, 9F, -32.5F);
		rightTrackModel[280].rotateAngleZ = -3.43829863F;

		rightTrackModel[281].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 565
		rightTrackModel[281].setRotationPoint(-53F, 9F, -22.5F);
		rightTrackModel[281].rotateAngleZ = -3.43829863F;

		rightTrackModel[282].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		rightTrackModel[282].setRotationPoint(-57.8F, 7.6F, -34.5F);
		rightTrackModel[282].rotateAngleZ = -3.63028484F;

		rightTrackModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		rightTrackModel[283].setRotationPoint(-57.8F, 7.6F, -35.5F);
		rightTrackModel[283].rotateAngleZ = -3.63028484F;

		rightTrackModel[284].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 575
		rightTrackModel[284].setRotationPoint(-57.8F, 7.6F, -35.5F);
		rightTrackModel[284].rotateAngleZ = -3.63028484F;

		rightTrackModel[285].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		rightTrackModel[285].setRotationPoint(-57.8F, 7.6F, -34.5F);
		rightTrackModel[285].rotateAngleZ = -3.63028484F;

		rightTrackModel[286].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		rightTrackModel[286].setRotationPoint(-57.8F, 7.6F, -33.5F);
		rightTrackModel[286].rotateAngleZ = -3.63028484F;

		rightTrackModel[287].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		rightTrackModel[287].setRotationPoint(-57.8F, 7.6F, -32.5F);
		rightTrackModel[287].rotateAngleZ = -3.63028484F;

		rightTrackModel[288].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 579
		rightTrackModel[288].setRotationPoint(-57.8F, 7.6F, -22.5F);
		rightTrackModel[288].rotateAngleZ = -3.63028484F;

		rightTrackModel[289].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		rightTrackModel[289].setRotationPoint(-61.8F, 5.5F, -34.5F);
		rightTrackModel[289].rotateAngleZ = -3.71755131F;

		rightTrackModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightTrackModel[290].setRotationPoint(-61.8F, 5.5F, -35.5F);
		rightTrackModel[290].rotateAngleZ = -3.71755131F;

		rightTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 589
		rightTrackModel[291].setRotationPoint(-61.8F, 5.5F, -35.5F);
		rightTrackModel[291].rotateAngleZ = -3.71755131F;

		rightTrackModel[292].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		rightTrackModel[292].setRotationPoint(-61.8F, 5.5F, -34.5F);
		rightTrackModel[292].rotateAngleZ = -3.71755131F;

		rightTrackModel[293].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		rightTrackModel[293].setRotationPoint(-61.8F, 5.5F, -33.5F);
		rightTrackModel[293].rotateAngleZ = -3.71755131F;

		rightTrackModel[294].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		rightTrackModel[294].setRotationPoint(-61.8F, 5.5F, -32.5F);
		rightTrackModel[294].rotateAngleZ = -3.71755131F;

		rightTrackModel[295].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 593
		rightTrackModel[295].setRotationPoint(-61.8F, 5.5F, -22.5F);
		rightTrackModel[295].rotateAngleZ = -3.71755131F;

		rightTrackModel[296].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		rightTrackModel[296].setRotationPoint(-66F, 2.8F, -34.5F);
		rightTrackModel[296].rotateAngleZ = -3.90953752F;

		rightTrackModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		rightTrackModel[297].setRotationPoint(-66F, 2.8F, -35.5F);
		rightTrackModel[297].rotateAngleZ = -3.90953752F;

		rightTrackModel[298].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 603
		rightTrackModel[298].setRotationPoint(-66F, 2.8F, -35.5F);
		rightTrackModel[298].rotateAngleZ = -3.90953752F;

		rightTrackModel[299].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		rightTrackModel[299].setRotationPoint(-66F, 2.8F, -34.5F);
		rightTrackModel[299].rotateAngleZ = -3.90953752F;

		rightTrackModel[300].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		rightTrackModel[300].setRotationPoint(-66F, 2.8F, -33.5F);
		rightTrackModel[300].rotateAngleZ = -3.90953752F;

		rightTrackModel[301].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		rightTrackModel[301].setRotationPoint(-66F, 2.8F, -32.5F);
		rightTrackModel[301].rotateAngleZ = -3.90953752F;

		rightTrackModel[302].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 607
		rightTrackModel[302].setRotationPoint(-66F, 2.8F, -22.5F);
		rightTrackModel[302].rotateAngleZ = -3.90953752F;

		rightTrackModel[303].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		rightTrackModel[303].setRotationPoint(-69.6F, -0.65F, -34.5F);
		rightTrackModel[303].rotateAngleZ = -4.31096325F;

		rightTrackModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		rightTrackModel[304].setRotationPoint(-69.6F, -0.65F, -35.5F);
		rightTrackModel[304].rotateAngleZ = -4.31096325F;

		rightTrackModel[305].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 617
		rightTrackModel[305].setRotationPoint(-69.6F, -0.65F, -35.5F);
		rightTrackModel[305].rotateAngleZ = -4.31096325F;

		rightTrackModel[306].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		rightTrackModel[306].setRotationPoint(-69.6F, -0.65F, -34.5F);
		rightTrackModel[306].rotateAngleZ = -4.31096325F;

		rightTrackModel[307].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		rightTrackModel[307].setRotationPoint(-69.6F, -0.65F, -33.5F);
		rightTrackModel[307].rotateAngleZ = -4.31096325F;

		rightTrackModel[308].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		rightTrackModel[308].setRotationPoint(-69.6F, -0.65F, -32.5F);
		rightTrackModel[308].rotateAngleZ = -4.31096325F;

		rightTrackModel[309].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 621
		rightTrackModel[309].setRotationPoint(-69.6F, -0.65F, -22.5F);
		rightTrackModel[309].rotateAngleZ = -4.31096325F;

		rightTrackModel[310].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		rightTrackModel[310].setRotationPoint(-71.6F, -5.2F, -34.5F);
		rightTrackModel[310].rotateAngleZ = -4.71238898F;

		rightTrackModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		rightTrackModel[311].setRotationPoint(-71.6F, -5.2F, -35.5F);
		rightTrackModel[311].rotateAngleZ = -4.71238898F;

		rightTrackModel[312].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 631
		rightTrackModel[312].setRotationPoint(-71.6F, -5.2F, -35.5F);
		rightTrackModel[312].rotateAngleZ = -4.71238898F;

		rightTrackModel[313].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		rightTrackModel[313].setRotationPoint(-71.6F, -5.2F, -34.5F);
		rightTrackModel[313].rotateAngleZ = -4.71238898F;

		rightTrackModel[314].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		rightTrackModel[314].setRotationPoint(-71.6F, -5.2F, -33.5F);
		rightTrackModel[314].rotateAngleZ = -4.71238898F;

		rightTrackModel[315].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		rightTrackModel[315].setRotationPoint(-71.6F, -5.2F, -32.5F);
		rightTrackModel[315].rotateAngleZ = -4.71238898F;

		rightTrackModel[316].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 635
		rightTrackModel[316].setRotationPoint(-71.6F, -5.2F, -22.5F);
		rightTrackModel[316].rotateAngleZ = -4.71238898F;

		rightTrackModel[317].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		rightTrackModel[317].setRotationPoint(-71.6F, -10.2F, -34.5F);
		rightTrackModel[317].rotateAngleZ = -5.68977336F;

		rightTrackModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		rightTrackModel[318].setRotationPoint(-71.6F, -10.2F, -35.5F);
		rightTrackModel[318].rotateAngleZ = -5.68977336F;

		rightTrackModel[319].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 645
		rightTrackModel[319].setRotationPoint(-71.6F, -10.2F, -35.5F);
		rightTrackModel[319].rotateAngleZ = -5.68977336F;

		rightTrackModel[320].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		rightTrackModel[320].setRotationPoint(-71.6F, -10.2F, -34.5F);
		rightTrackModel[320].rotateAngleZ = -5.68977336F;

		rightTrackModel[321].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		rightTrackModel[321].setRotationPoint(-71.6F, -10.2F, -33.5F);
		rightTrackModel[321].rotateAngleZ = -5.68977336F;

		rightTrackModel[322].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		rightTrackModel[322].setRotationPoint(-71.6F, -10.2F, -32.5F);
		rightTrackModel[322].rotateAngleZ = -5.68977336F;

		rightTrackModel[323].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 649
		rightTrackModel[323].setRotationPoint(-71.6F, -10.2F, -22.5F);
		rightTrackModel[323].rotateAngleZ = -5.68977336F;

		rightTrackModel[324].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		rightTrackModel[324].setRotationPoint(-67.5F, -13F, -34.5F);

		rightTrackModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		rightTrackModel[325].setRotationPoint(-67.5F, -13F, -35.5F);

		rightTrackModel[326].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 659
		rightTrackModel[326].setRotationPoint(-67.5F, -13F, -35.5F);

		rightTrackModel[327].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		rightTrackModel[327].setRotationPoint(-67.5F, -13F, -34.5F);

		rightTrackModel[328].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		rightTrackModel[328].setRotationPoint(-67.5F, -13F, -33.5F);

		rightTrackModel[329].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		rightTrackModel[329].setRotationPoint(-67.5F, -13F, -32.5F);

		rightTrackModel[330].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 663
		rightTrackModel[330].setRotationPoint(-67.5F, -13F, -22.5F);

		rightTrackModel[331].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		rightTrackModel[331].setRotationPoint(-62.5F, -13F, -34.5F);

		rightTrackModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		rightTrackModel[332].setRotationPoint(-62.5F, -13F, -35.5F);

		rightTrackModel[333].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 673
		rightTrackModel[333].setRotationPoint(-62.5F, -13F, -35.5F);

		rightTrackModel[334].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		rightTrackModel[334].setRotationPoint(-62.5F, -13F, -34.5F);

		rightTrackModel[335].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		rightTrackModel[335].setRotationPoint(-62.5F, -13F, -33.5F);

		rightTrackModel[336].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		rightTrackModel[336].setRotationPoint(-62.5F, -13F, -32.5F);

		rightTrackModel[337].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 677
		rightTrackModel[337].setRotationPoint(-62.5F, -13F, -22.5F);

		rightTrackModel[338].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		rightTrackModel[338].setRotationPoint(-57.5F, -13F, -34.5F);

		rightTrackModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		rightTrackModel[339].setRotationPoint(-57.5F, -13F, -35.5F);

		rightTrackModel[340].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 687
		rightTrackModel[340].setRotationPoint(-57.5F, -13F, -35.5F);

		rightTrackModel[341].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		rightTrackModel[341].setRotationPoint(-57.5F, -13F, -34.5F);

		rightTrackModel[342].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		rightTrackModel[342].setRotationPoint(-57.5F, -13F, -33.5F);

		rightTrackModel[343].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 690
		rightTrackModel[343].setRotationPoint(-57.5F, -13F, -32.5F);

		rightTrackModel[344].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 691
		rightTrackModel[344].setRotationPoint(-57.5F, -13F, -22.5F);

		rightTrackModel[345].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		rightTrackModel[345].setRotationPoint(-52.5F, -13F, -34.5F);

		rightTrackModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		rightTrackModel[346].setRotationPoint(-52.5F, -13F, -35.5F);

		rightTrackModel[347].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 701
		rightTrackModel[347].setRotationPoint(-52.5F, -13F, -35.5F);

		rightTrackModel[348].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		rightTrackModel[348].setRotationPoint(-52.5F, -13F, -34.5F);

		rightTrackModel[349].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		rightTrackModel[349].setRotationPoint(-52.5F, -13F, -33.5F);

		rightTrackModel[350].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		rightTrackModel[350].setRotationPoint(-52.5F, -13F, -32.5F);

		rightTrackModel[351].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 705
		rightTrackModel[351].setRotationPoint(-52.5F, -13F, -22.5F);

		rightTrackModel[352].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		rightTrackModel[352].setRotationPoint(-47.5F, -13F, -34.5F);

		rightTrackModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		rightTrackModel[353].setRotationPoint(-47.5F, -13F, -35.5F);

		rightTrackModel[354].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 715
		rightTrackModel[354].setRotationPoint(-47.5F, -13F, -35.5F);

		rightTrackModel[355].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		rightTrackModel[355].setRotationPoint(-47.5F, -13F, -34.5F);

		rightTrackModel[356].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		rightTrackModel[356].setRotationPoint(-47.5F, -13F, -33.5F);

		rightTrackModel[357].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		rightTrackModel[357].setRotationPoint(-47.5F, -13F, -32.5F);

		rightTrackModel[358].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 719
		rightTrackModel[358].setRotationPoint(-47.5F, -13F, -22.5F);

		rightTrackModel[359].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		rightTrackModel[359].setRotationPoint(-42.5F, -13F, -34.5F);

		rightTrackModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		rightTrackModel[360].setRotationPoint(-42.5F, -13F, -35.5F);

		rightTrackModel[361].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 729
		rightTrackModel[361].setRotationPoint(-42.5F, -13F, -35.5F);

		rightTrackModel[362].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		rightTrackModel[362].setRotationPoint(-42.5F, -13F, -34.5F);

		rightTrackModel[363].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		rightTrackModel[363].setRotationPoint(-42.5F, -13F, -33.5F);

		rightTrackModel[364].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		rightTrackModel[364].setRotationPoint(-42.5F, -13F, -32.5F);

		rightTrackModel[365].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 733
		rightTrackModel[365].setRotationPoint(-42.5F, -13F, -22.5F);

		rightTrackModel[366].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 741
		rightTrackModel[366].setRotationPoint(-37.5F, -13F, -34.5F);

		rightTrackModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		rightTrackModel[367].setRotationPoint(-37.5F, -13F, -35.5F);

		rightTrackModel[368].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 743
		rightTrackModel[368].setRotationPoint(-37.5F, -13F, -35.5F);

		rightTrackModel[369].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		rightTrackModel[369].setRotationPoint(-37.5F, -13F, -34.5F);

		rightTrackModel[370].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		rightTrackModel[370].setRotationPoint(-37.5F, -13F, -33.5F);

		rightTrackModel[371].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		rightTrackModel[371].setRotationPoint(-37.5F, -13F, -32.5F);

		rightTrackModel[372].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 747
		rightTrackModel[372].setRotationPoint(-37.5F, -13F, -22.5F);

		rightTrackModel[373].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 755
		rightTrackModel[373].setRotationPoint(-32.5F, -13F, -34.5F);

		rightTrackModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		rightTrackModel[374].setRotationPoint(-32.5F, -13F, -35.5F);

		rightTrackModel[375].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 757
		rightTrackModel[375].setRotationPoint(-32.5F, -13F, -35.5F);

		rightTrackModel[376].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		rightTrackModel[376].setRotationPoint(-32.5F, -13F, -34.5F);

		rightTrackModel[377].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		rightTrackModel[377].setRotationPoint(-32.5F, -13F, -33.5F);

		rightTrackModel[378].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		rightTrackModel[378].setRotationPoint(-32.5F, -13F, -32.5F);

		rightTrackModel[379].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 761
		rightTrackModel[379].setRotationPoint(-32.5F, -13F, -22.5F);

		rightTrackModel[380].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		rightTrackModel[380].setRotationPoint(-27.5F, -13F, -34.5F);

		rightTrackModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		rightTrackModel[381].setRotationPoint(-27.5F, -13F, -35.5F);

		rightTrackModel[382].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 771
		rightTrackModel[382].setRotationPoint(-27.5F, -13F, -35.5F);

		rightTrackModel[383].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		rightTrackModel[383].setRotationPoint(-27.5F, -13F, -34.5F);

		rightTrackModel[384].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		rightTrackModel[384].setRotationPoint(-27.5F, -13F, -33.5F);

		rightTrackModel[385].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		rightTrackModel[385].setRotationPoint(-27.5F, -13F, -32.5F);

		rightTrackModel[386].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 775
		rightTrackModel[386].setRotationPoint(-27.5F, -13F, -22.5F);

		rightTrackModel[387].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		rightTrackModel[387].setRotationPoint(-22.5F, -13F, -34.5F);

		rightTrackModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		rightTrackModel[388].setRotationPoint(-22.5F, -13F, -35.5F);

		rightTrackModel[389].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 785
		rightTrackModel[389].setRotationPoint(-22.5F, -13F, -35.5F);

		rightTrackModel[390].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		rightTrackModel[390].setRotationPoint(-22.5F, -13F, -34.5F);

		rightTrackModel[391].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		rightTrackModel[391].setRotationPoint(-22.5F, -13F, -33.5F);

		rightTrackModel[392].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		rightTrackModel[392].setRotationPoint(-22.5F, -13F, -32.5F);

		rightTrackModel[393].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 789
		rightTrackModel[393].setRotationPoint(-22.5F, -13F, -22.5F);

		rightTrackModel[394].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		rightTrackModel[394].setRotationPoint(-17.5F, -13F, -34.5F);

		rightTrackModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		rightTrackModel[395].setRotationPoint(-17.5F, -13F, -35.5F);

		rightTrackModel[396].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 799
		rightTrackModel[396].setRotationPoint(-17.5F, -13F, -35.5F);

		rightTrackModel[397].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		rightTrackModel[397].setRotationPoint(-17.5F, -13F, -34.5F);

		rightTrackModel[398].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		rightTrackModel[398].setRotationPoint(-17.5F, -13F, -33.5F);

		rightTrackModel[399].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		rightTrackModel[399].setRotationPoint(-17.5F, -13F, -32.5F);

		rightTrackModel[400].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 803
		rightTrackModel[400].setRotationPoint(-17.5F, -13F, -22.5F);

		rightTrackModel[401].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		rightTrackModel[401].setRotationPoint(-12.5F, -13F, -34.5F);

		rightTrackModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		rightTrackModel[402].setRotationPoint(-12.5F, -13F, -35.5F);

		rightTrackModel[403].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 813
		rightTrackModel[403].setRotationPoint(-12.5F, -13F, -35.5F);

		rightTrackModel[404].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		rightTrackModel[404].setRotationPoint(-12.5F, -13F, -34.5F);

		rightTrackModel[405].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		rightTrackModel[405].setRotationPoint(-12.5F, -13F, -33.5F);

		rightTrackModel[406].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		rightTrackModel[406].setRotationPoint(-12.5F, -13F, -32.5F);

		rightTrackModel[407].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 817
		rightTrackModel[407].setRotationPoint(-12.5F, -13F, -22.5F);

		rightTrackModel[408].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		rightTrackModel[408].setRotationPoint(-7.5F, -13F, -34.5F);

		rightTrackModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		rightTrackModel[409].setRotationPoint(-7.5F, -13F, -35.5F);

		rightTrackModel[410].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 827
		rightTrackModel[410].setRotationPoint(-7.5F, -13F, -35.5F);

		rightTrackModel[411].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		rightTrackModel[411].setRotationPoint(-7.5F, -13F, -34.5F);

		rightTrackModel[412].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
		rightTrackModel[412].setRotationPoint(-7.5F, -13F, -33.5F);

		rightTrackModel[413].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
		rightTrackModel[413].setRotationPoint(-7.5F, -13F, -32.5F);

		rightTrackModel[414].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 831
		rightTrackModel[414].setRotationPoint(-7.5F, -13F, -22.5F);

		rightTrackModel[415].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839
		rightTrackModel[415].setRotationPoint(-2.5F, -13F, -34.5F);

		rightTrackModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840
		rightTrackModel[416].setRotationPoint(-2.5F, -13F, -35.5F);

		rightTrackModel[417].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 841
		rightTrackModel[417].setRotationPoint(-2.5F, -13F, -35.5F);

		rightTrackModel[418].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		rightTrackModel[418].setRotationPoint(-2.5F, -13F, -34.5F);

		rightTrackModel[419].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		rightTrackModel[419].setRotationPoint(-2.5F, -13F, -33.5F);

		rightTrackModel[420].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		rightTrackModel[420].setRotationPoint(-2.5F, -13F, -32.5F);

		rightTrackModel[421].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 845
		rightTrackModel[421].setRotationPoint(-2.5F, -13F, -22.5F);

		rightTrackModel[422].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		rightTrackModel[422].setRotationPoint(2.5F, -13F, -34.5F);

		rightTrackModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 854
		rightTrackModel[423].setRotationPoint(2.5F, -13F, -35.5F);

		rightTrackModel[424].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 855
		rightTrackModel[424].setRotationPoint(2.5F, -13F, -35.5F);

		rightTrackModel[425].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		rightTrackModel[425].setRotationPoint(2.5F, -13F, -34.5F);

		rightTrackModel[426].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 857
		rightTrackModel[426].setRotationPoint(2.5F, -13F, -33.5F);

		rightTrackModel[427].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 858
		rightTrackModel[427].setRotationPoint(2.5F, -13F, -32.5F);

		rightTrackModel[428].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 859
		rightTrackModel[428].setRotationPoint(2.5F, -13F, -22.5F);

		rightTrackModel[429].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		rightTrackModel[429].setRotationPoint(7.5F, -13F, -34.5F);

		rightTrackModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		rightTrackModel[430].setRotationPoint(7.5F, -13F, -35.5F);

		rightTrackModel[431].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 869
		rightTrackModel[431].setRotationPoint(7.5F, -13F, -35.5F);

		rightTrackModel[432].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		rightTrackModel[432].setRotationPoint(7.5F, -13F, -34.5F);

		rightTrackModel[433].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		rightTrackModel[433].setRotationPoint(7.5F, -13F, -33.5F);

		rightTrackModel[434].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 872
		rightTrackModel[434].setRotationPoint(7.5F, -13F, -32.5F);

		rightTrackModel[435].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 873
		rightTrackModel[435].setRotationPoint(7.5F, -13F, -22.5F);

		rightTrackModel[436].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		rightTrackModel[436].setRotationPoint(12.5F, -13F, -34.5F);

		rightTrackModel[437].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		rightTrackModel[437].setRotationPoint(12.5F, -13F, -35.5F);

		rightTrackModel[438].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 883
		rightTrackModel[438].setRotationPoint(12.5F, -13F, -35.5F);

		rightTrackModel[439].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		rightTrackModel[439].setRotationPoint(12.5F, -13F, -34.5F);

		rightTrackModel[440].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 885
		rightTrackModel[440].setRotationPoint(12.5F, -13F, -33.5F);

		rightTrackModel[441].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 886
		rightTrackModel[441].setRotationPoint(12.5F, -13F, -32.5F);

		rightTrackModel[442].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 887
		rightTrackModel[442].setRotationPoint(12.5F, -13F, -22.5F);

		rightTrackModel[443].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 895
		rightTrackModel[443].setRotationPoint(17.5F, -13F, -34.5F);

		rightTrackModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		rightTrackModel[444].setRotationPoint(17.5F, -13F, -35.5F);

		rightTrackModel[445].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 897
		rightTrackModel[445].setRotationPoint(17.5F, -13F, -35.5F);

		rightTrackModel[446].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		rightTrackModel[446].setRotationPoint(17.5F, -13F, -34.5F);

		rightTrackModel[447].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		rightTrackModel[447].setRotationPoint(17.5F, -13F, -33.5F);

		rightTrackModel[448].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		rightTrackModel[448].setRotationPoint(17.5F, -13F, -32.5F);

		rightTrackModel[449].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 901
		rightTrackModel[449].setRotationPoint(17.5F, -13F, -22.5F);

		rightTrackModel[450].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		rightTrackModel[450].setRotationPoint(22.5F, -13F, -34.5F);

		rightTrackModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		rightTrackModel[451].setRotationPoint(22.5F, -13F, -35.5F);

		rightTrackModel[452].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 911
		rightTrackModel[452].setRotationPoint(22.5F, -13F, -35.5F);

		rightTrackModel[453].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		rightTrackModel[453].setRotationPoint(22.5F, -13F, -34.5F);

		rightTrackModel[454].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		rightTrackModel[454].setRotationPoint(22.5F, -13F, -33.5F);

		rightTrackModel[455].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		rightTrackModel[455].setRotationPoint(22.5F, -13F, -32.5F);

		rightTrackModel[456].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 915
		rightTrackModel[456].setRotationPoint(22.5F, -13F, -22.5F);

		rightTrackModel[457].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
		rightTrackModel[457].setRotationPoint(27.5F, -13F, -34.5F);

		rightTrackModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		rightTrackModel[458].setRotationPoint(27.5F, -13F, -35.5F);

		rightTrackModel[459].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 925
		rightTrackModel[459].setRotationPoint(27.5F, -13F, -35.5F);

		rightTrackModel[460].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		rightTrackModel[460].setRotationPoint(27.5F, -13F, -34.5F);

		rightTrackModel[461].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		rightTrackModel[461].setRotationPoint(27.5F, -13F, -33.5F);

		rightTrackModel[462].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		rightTrackModel[462].setRotationPoint(27.5F, -13F, -32.5F);

		rightTrackModel[463].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 929
		rightTrackModel[463].setRotationPoint(27.5F, -13F, -22.5F);

		rightTrackModel[464].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 937
		rightTrackModel[464].setRotationPoint(32.5F, -13F, -34.5F);

		rightTrackModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		rightTrackModel[465].setRotationPoint(32.5F, -13F, -35.5F);

		rightTrackModel[466].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 939
		rightTrackModel[466].setRotationPoint(32.5F, -13F, -35.5F);

		rightTrackModel[467].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 940
		rightTrackModel[467].setRotationPoint(32.5F, -13F, -34.5F);

		rightTrackModel[468].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 941
		rightTrackModel[468].setRotationPoint(32.5F, -13F, -33.5F);

		rightTrackModel[469].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		rightTrackModel[469].setRotationPoint(32.5F, -13F, -32.5F);

		rightTrackModel[470].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 943
		rightTrackModel[470].setRotationPoint(32.5F, -13F, -22.5F);

		rightTrackModel[471].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 951
		rightTrackModel[471].setRotationPoint(37.5F, -13F, -34.5F);

		rightTrackModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		rightTrackModel[472].setRotationPoint(37.5F, -13F, -35.5F);

		rightTrackModel[473].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 953
		rightTrackModel[473].setRotationPoint(37.5F, -13F, -35.5F);

		rightTrackModel[474].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		rightTrackModel[474].setRotationPoint(37.5F, -13F, -34.5F);

		rightTrackModel[475].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		rightTrackModel[475].setRotationPoint(37.5F, -13F, -33.5F);

		rightTrackModel[476].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 956
		rightTrackModel[476].setRotationPoint(37.5F, -13F, -32.5F);

		rightTrackModel[477].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 957
		rightTrackModel[477].setRotationPoint(37.5F, -13F, -22.5F);

		rightTrackModel[478].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		rightTrackModel[478].setRotationPoint(42.5F, -13F, -34.5F);

		rightTrackModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		rightTrackModel[479].setRotationPoint(42.5F, -13F, -35.5F);

		rightTrackModel[480].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 967
		rightTrackModel[480].setRotationPoint(42.5F, -13F, -35.5F);

		rightTrackModel[481].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		rightTrackModel[481].setRotationPoint(42.5F, -13F, -34.5F);

		rightTrackModel[482].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		rightTrackModel[482].setRotationPoint(42.5F, -13F, -33.5F);

		rightTrackModel[483].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		rightTrackModel[483].setRotationPoint(42.5F, -13F, -32.5F);

		rightTrackModel[484].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 971
		rightTrackModel[484].setRotationPoint(42.5F, -13F, -22.5F);

		rightTrackModel[485].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
		rightTrackModel[485].setRotationPoint(47.5F, -13F, -34.5F);

		rightTrackModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		rightTrackModel[486].setRotationPoint(47.5F, -13F, -35.5F);

		rightTrackModel[487].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 981
		rightTrackModel[487].setRotationPoint(47.5F, -13F, -35.5F);

		rightTrackModel[488].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 982
		rightTrackModel[488].setRotationPoint(47.5F, -13F, -34.5F);

		rightTrackModel[489].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		rightTrackModel[489].setRotationPoint(47.5F, -13F, -33.5F);

		rightTrackModel[490].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 984
		rightTrackModel[490].setRotationPoint(47.5F, -13F, -32.5F);

		rightTrackModel[491].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 985
		rightTrackModel[491].setRotationPoint(47.5F, -13F, -22.5F);

		rightTrackModel[492].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 993
		rightTrackModel[492].setRotationPoint(52.5F, -13F, -34.5F);

		rightTrackModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 994
		rightTrackModel[493].setRotationPoint(52.5F, -13F, -35.5F);

		rightTrackModel[494].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 995
		rightTrackModel[494].setRotationPoint(52.5F, -13F, -35.5F);

		rightTrackModel[495].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 996
		rightTrackModel[495].setRotationPoint(52.5F, -13F, -34.5F);

		rightTrackModel[496].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 997
		rightTrackModel[496].setRotationPoint(52.5F, -13F, -33.5F);

		rightTrackModel[497].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 998
		rightTrackModel[497].setRotationPoint(52.5F, -13F, -32.5F);

		rightTrackModel[498].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 999
		rightTrackModel[498].setRotationPoint(52.5F, -13F, -22.5F);

		rightTrackModel[499].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		rightTrackModel[499].setRotationPoint(57.5F, -13F, -34.5F);
		rightTrackModel[499].rotateAngleZ = 0.50614548F;
	}

	private void initrightTrackModel_2()
	{
		rightTrackModel[500] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 1008
		rightTrackModel[501] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 1009
		rightTrackModel[502] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 1010
		rightTrackModel[503] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1011
		rightTrackModel[504] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 1012
		rightTrackModel[505] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1013
		rightTrackModel[506] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 1021
		rightTrackModel[507] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 1022
		rightTrackModel[508] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 1023
		rightTrackModel[509] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 1024
		rightTrackModel[510] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1025
		rightTrackModel[511] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 1026
		rightTrackModel[512] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1027

		rightTrackModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		rightTrackModel[500].setRotationPoint(57.5F, -13F, -35.5F);
		rightTrackModel[500].rotateAngleZ = 0.50614548F;

		rightTrackModel[501].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1009
		rightTrackModel[501].setRotationPoint(57.5F, -13F, -35.5F);
		rightTrackModel[501].rotateAngleZ = 0.50614548F;

		rightTrackModel[502].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1010
		rightTrackModel[502].setRotationPoint(57.5F, -13F, -34.5F);
		rightTrackModel[502].rotateAngleZ = 0.50614548F;

		rightTrackModel[503].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1011
		rightTrackModel[503].setRotationPoint(57.5F, -13F, -33.5F);
		rightTrackModel[503].rotateAngleZ = 0.50614548F;

		rightTrackModel[504].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1012
		rightTrackModel[504].setRotationPoint(57.5F, -13F, -32.5F);
		rightTrackModel[504].rotateAngleZ = 0.50614548F;

		rightTrackModel[505].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1013
		rightTrackModel[505].setRotationPoint(57.5F, -13F, -22.5F);
		rightTrackModel[505].rotateAngleZ = 0.50614548F;

		rightTrackModel[506].addShapeBox(0.2F, -0.5F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1021
		rightTrackModel[506].setRotationPoint(61.5F, -15F, -34.5F);
		rightTrackModel[506].rotateAngleZ = 0.31415927F;

		rightTrackModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1022
		rightTrackModel[507].setRotationPoint(61.5F, -15F, -35.5F);
		rightTrackModel[507].rotateAngleZ = 0.31415927F;

		rightTrackModel[508].addShapeBox(2F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1023
		rightTrackModel[508].setRotationPoint(61.5F, -15F, -35.5F);
		rightTrackModel[508].rotateAngleZ = 0.31415927F;

		rightTrackModel[509].addShapeBox(3F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		rightTrackModel[509].setRotationPoint(61.5F, -15F, -34.5F);
		rightTrackModel[509].rotateAngleZ = 0.31415927F;

		rightTrackModel[510].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1025
		rightTrackModel[510].setRotationPoint(61.5F, -15F, -33.5F);
		rightTrackModel[510].rotateAngleZ = 0.31415927F;

		rightTrackModel[511].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		rightTrackModel[511].setRotationPoint(61.5F, -15F, -32.5F);
		rightTrackModel[511].rotateAngleZ = 0.31415927F;

		rightTrackModel[512].addShapeBox(1.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1027
		rightTrackModel[512].setRotationPoint(61.5F, -15F, -22.5F);
		rightTrackModel[512].rotateAngleZ = 0.31415927F;
	}
}