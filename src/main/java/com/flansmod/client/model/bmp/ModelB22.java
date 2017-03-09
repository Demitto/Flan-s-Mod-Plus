//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB22 extends ModelVehicle //Same as Filename
{
	int textureX = 3000;
	int textureY = 3000;

	public ModelB22() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];
		turretModel = new ModelRendererTurbo[51];
		leftTrackModel = new ModelRendererTurbo[661];
		rightTrackModel = new ModelRendererTurbo[661];

		initbodyModel_1();
		initturretModel_1();
		initleftTrackModel_1();
		initleftTrackModel_2();
		initrightTrackModel_1();
		initrightTrackModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1322
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1323
		bodyModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1324
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1325
		bodyModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1326
		bodyModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1327
		bodyModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1328
		bodyModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1329
		bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1330
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1331
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1332
		bodyModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1333
		bodyModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1334
		bodyModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1335
		bodyModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1336
		bodyModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1337
		bodyModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1338
		bodyModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1339
		bodyModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1340
		bodyModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1341
		bodyModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1342
		bodyModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1343
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1344
		bodyModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1345
		bodyModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1346
		bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1347
		bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1348
		bodyModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1349
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1350
		bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1351
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1352
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1353
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1354
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1355
		bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1356
		bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1357
		bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1358
		bodyModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1359
		bodyModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1360
		bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1361
		bodyModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1362
		bodyModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1363
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1364
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1365
		bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1366
		bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1367
		bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1368
		bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1369
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1370
		bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1371
		bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1372
		bodyModel[51] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1378
		bodyModel[52] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1379
		bodyModel[53] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1380
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1381
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1382
		bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1383
		bodyModel[57] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1384
		bodyModel[58] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1385
		bodyModel[59] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1386
		bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1387
		bodyModel[61] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1388
		bodyModel[62] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1389
		bodyModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1390
		bodyModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1391
		bodyModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1392
		bodyModel[66] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1393
		bodyModel[67] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1394
		bodyModel[68] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1395
		bodyModel[69] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1396
		bodyModel[70] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1397
		bodyModel[71] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1398
		bodyModel[72] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1399
		bodyModel[73] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1400
		bodyModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1401
		bodyModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1402
		bodyModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1403
		bodyModel[77] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1404
		bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1405
		bodyModel[79] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1406
		bodyModel[80] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1407
		bodyModel[81] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1408
		bodyModel[82] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1409
		bodyModel[83] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1410
		bodyModel[84] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1411
		bodyModel[85] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1412
		bodyModel[86] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1413
		bodyModel[87] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1414
		bodyModel[88] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1415
		bodyModel[89] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1416
		bodyModel[90] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1417
		bodyModel[91] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1418
		bodyModel[92] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1419
		bodyModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1420
		bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1421
		bodyModel[95] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1422
		bodyModel[96] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1423
		bodyModel[97] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1424
		bodyModel[98] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1425
		bodyModel[99] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1426
		bodyModel[100] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1427
		bodyModel[101] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1428
		bodyModel[102] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1429
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1430
		bodyModel[104] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1431
		bodyModel[105] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1432
		bodyModel[106] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1433
		bodyModel[107] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1434
		bodyModel[108] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1435
		bodyModel[109] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1436
		bodyModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1437
		bodyModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1438
		bodyModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1439
		bodyModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1440
		bodyModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1441
		bodyModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1442
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1443
		bodyModel[117] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1444
		bodyModel[118] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1445
		bodyModel[119] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1446
		bodyModel[120] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1447
		bodyModel[121] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1448
		bodyModel[122] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1449
		bodyModel[123] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1450
		bodyModel[124] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1451
		bodyModel[125] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1452
		bodyModel[126] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1453
		bodyModel[127] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1454
		bodyModel[128] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1455
		bodyModel[129] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1456
		bodyModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1457
		bodyModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1458
		bodyModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1459
		bodyModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1460
		bodyModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1461
		bodyModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1462
		bodyModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1463
		bodyModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1464
		bodyModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1465
		bodyModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1466
		bodyModel[140] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1467
		bodyModel[141] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1468
		bodyModel[142] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1469
		bodyModel[143] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1470
		bodyModel[144] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1471
		bodyModel[145] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1472
		bodyModel[146] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1473
		bodyModel[147] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1474
		bodyModel[148] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1475

		bodyModel[0].addShapeBox(0F, 0F, 0F, 30, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1322
		bodyModel[0].setRotationPoint(23F, -6F, -16.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 30, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 1323
		bodyModel[1].setRotationPoint(23F, -2F, -16.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1324
		bodyModel[2].setRotationPoint(23F, -6F, 10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 1325
		bodyModel[3].setRotationPoint(23F, -2F, 10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 5, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1326
		bodyModel[4].setRotationPoint(23F, -11F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 4, 21, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 1327
		bodyModel[5].setRotationPoint(23F, -6F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 18, 9, 21, 0F,0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1328
		bodyModel[6].setRotationPoint(23F, -2F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 30, 5, 6, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1329
		bodyModel[7].setRotationPoint(23F, -11F, -16.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 30, 5, 6, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1330
		bodyModel[8].setRotationPoint(23F, -11F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 21, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1331
		bodyModel[9].setRotationPoint(23F, -13F, -10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 62, 18, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1332
		bodyModel[10].setRotationPoint(-39F, -11F, -16.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1333
		bodyModel[11].setRotationPoint(-46F, -6F, -18.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1334
		bodyModel[12].setRotationPoint(-46F, -5F, -18.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1335
		bodyModel[13].setRotationPoint(-46F, -4F, -18.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1336
		bodyModel[14].setRotationPoint(-38F, 4F, -18.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1337
		bodyModel[15].setRotationPoint(-38F, 2F, -18.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1338
		bodyModel[16].setRotationPoint(-38F, 3F, -18.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1339
		bodyModel[17].setRotationPoint(-25F, 4F, -18.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1340
		bodyModel[18].setRotationPoint(-25F, 2F, -18.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1341
		bodyModel[19].setRotationPoint(-25F, 3F, -18.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1342
		bodyModel[20].setRotationPoint(-12F, 4F, -18.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1343
		bodyModel[21].setRotationPoint(-12F, 2F, -18.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1344
		bodyModel[22].setRotationPoint(-12F, 3F, -18.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1345
		bodyModel[23].setRotationPoint(-0.5F, 4F, -18.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1346
		bodyModel[24].setRotationPoint(-0.5F, 2F, -18.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1347
		bodyModel[25].setRotationPoint(-0.5F, 3F, -18.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1348
		bodyModel[26].setRotationPoint(11F, 4F, -18.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1349
		bodyModel[27].setRotationPoint(11F, 2F, -18.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1350
		bodyModel[28].setRotationPoint(11F, 3F, -18.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1351
		bodyModel[29].setRotationPoint(24F, 4F, -18.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1352
		bodyModel[30].setRotationPoint(24F, 2F, -18.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1353
		bodyModel[31].setRotationPoint(24F, 3F, -18.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1354
		bodyModel[32].setRotationPoint(37F, 4F, -18.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1355
		bodyModel[33].setRotationPoint(37F, 2F, -18.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1356
		bodyModel[34].setRotationPoint(37F, 3F, -18.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1357
		bodyModel[35].setRotationPoint(48F, -4F, -18.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1358
		bodyModel[36].setRotationPoint(48F, -6F, -18.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1359
		bodyModel[37].setRotationPoint(48F, -5F, -18.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1360
		bodyModel[38].setRotationPoint(48F, -4F, 16.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1361
		bodyModel[39].setRotationPoint(48F, -6F, 16.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1362
		bodyModel[40].setRotationPoint(48F, -5F, 16.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 83, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1363
		bodyModel[41].setRotationPoint(-39F, -8F, -28.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 99, 4, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1364
		bodyModel[42].setRotationPoint(-46F, -9F, -29.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1365
		bodyModel[43].setRotationPoint(-46F, -5F, -29.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1366
		bodyModel[44].setRotationPoint(37F, -5F, -29.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1367
		bodyModel[45].setRotationPoint(14F, -5F, -29.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1368
		bodyModel[46].setRotationPoint(-21F, -5F, -29.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1369
		bodyModel[47].setRotationPoint(-1F, -5F, -29.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 99, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1370
		bodyModel[48].setRotationPoint(-46F, -1F, -29.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 83, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1371
		bodyModel[49].setRotationPoint(-39F, -8F, 16.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 99, 4, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1372
		bodyModel[50].setRotationPoint(-46F, -9F, 28.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 99, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 1378
		bodyModel[51].setRotationPoint(-46F, -1F, 28.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 18, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1379
		bodyModel[52].setRotationPoint(-48F, -11F, -16.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 18, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 1380
		bodyModel[53].setRotationPoint(-48F, -11F, 11.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 18, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 1381
		bodyModel[54].setRotationPoint(-51F, -11F, -11.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 82, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1382
		bodyModel[55].setRotationPoint(-39F, -13F, -16.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1383
		bodyModel[56].setRotationPoint(-37F, -12F, -28.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1384
		bodyModel[57].setRotationPoint(-37F, -12F, -29.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1385
		bodyModel[58].setRotationPoint(-37F, -13F, -28.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1386
		bodyModel[59].setRotationPoint(-22F, -13F, -28.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1387
		bodyModel[60].setRotationPoint(-33F, -12.5F, -26.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1388
		bodyModel[61].setRotationPoint(-20F, -12F, -28.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1389
		bodyModel[62].setRotationPoint(-20F, -12F, -29.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1390
		bodyModel[63].setRotationPoint(-20F, -13F, -28.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1391
		bodyModel[64].setRotationPoint(-16F, -12.5F, -26.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1392
		bodyModel[65].setRotationPoint(-5F, -13F, -28.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1393
		bodyModel[66].setRotationPoint(-3F, -12F, -28.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1394
		bodyModel[67].setRotationPoint(-3F, -12F, -29.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1395
		bodyModel[68].setRotationPoint(-3F, -13F, -28.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1396
		bodyModel[69].setRotationPoint(1F, -12.5F, -26.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1397
		bodyModel[70].setRotationPoint(12F, -13F, -28.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1398
		bodyModel[71].setRotationPoint(25F, -12F, -28.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1399
		bodyModel[72].setRotationPoint(25F, -12F, -29.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1400
		bodyModel[73].setRotationPoint(25F, -13F, -28.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1401
		bodyModel[74].setRotationPoint(29F, -12.5F, -26.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1402
		bodyModel[75].setRotationPoint(40F, -13F, -28.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 82, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1403
		bodyModel[76].setRotationPoint(-39F, -13F, 14.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1404
		bodyModel[77].setRotationPoint(-37F, -12F, 16.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1405
		bodyModel[78].setRotationPoint(-37F, -12F, 28.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1406
		bodyModel[79].setRotationPoint(-37F, -13F, 16.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1407
		bodyModel[80].setRotationPoint(-22F, -13F, 16.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1408
		bodyModel[81].setRotationPoint(-33F, -12.5F, 16.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1409
		bodyModel[82].setRotationPoint(-20F, -12F, 16.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1410
		bodyModel[83].setRotationPoint(-20F, -12F, 28.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1411
		bodyModel[84].setRotationPoint(-20F, -13F, 16.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1412
		bodyModel[85].setRotationPoint(-16F, -12.5F, 16.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1413
		bodyModel[86].setRotationPoint(-5F, -13F, 16.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1414
		bodyModel[87].setRotationPoint(-3F, -12F, 16.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1415
		bodyModel[88].setRotationPoint(-3F, -12F, 28.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1416
		bodyModel[89].setRotationPoint(-3F, -13F, 16.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1417
		bodyModel[90].setRotationPoint(1F, -12.5F, 16.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1418
		bodyModel[91].setRotationPoint(12F, -13F, 16.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1419
		bodyModel[92].setRotationPoint(25F, -12F, 16.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1420
		bodyModel[93].setRotationPoint(25F, -12F, 28.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1421
		bodyModel[94].setRotationPoint(25F, -13F, 16.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1422
		bodyModel[95].setRotationPoint(29F, -12.5F, 16.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1423
		bodyModel[96].setRotationPoint(40F, -13F, 16.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1424
		bodyModel[97].setRotationPoint(14F, -13F, -14.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 2, 29, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 1425
		bodyModel[98].setRotationPoint(-33F, -13F, -14.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 38, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1426
		bodyModel[99].setRotationPoint(-24F, -13F, -14.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1427
		bodyModel[100].setRotationPoint(-48F, -13F, -11.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 15, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1428
		bodyModel[101].setRotationPoint(-48F, -13F, 8.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 23, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1429
		bodyModel[102].setRotationPoint(-51F, -13F, -11.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 15, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1430
		bodyModel[103].setRotationPoint(-48F, -12F, -8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1431
		bodyModel[104].setRotationPoint(-47F, -12.5F, -8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1432
		bodyModel[105].setRotationPoint(-45F, -12.5F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1433
		bodyModel[106].setRotationPoint(-43F, -12.5F, -8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1434
		bodyModel[107].setRotationPoint(-41F, -12.5F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1435
		bodyModel[108].setRotationPoint(-39F, -12.5F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1436
		bodyModel[109].setRotationPoint(-37F, -12.5F, -8.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1437
		bodyModel[110].setRotationPoint(-35F, -12.5F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1438
		bodyModel[111].setRotationPoint(37F, -4F, -29.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1439
		bodyModel[112].setRotationPoint(14F, -4F, -29.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1440
		bodyModel[113].setRotationPoint(-1F, -4F, -29.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1441
		bodyModel[114].setRotationPoint(-21F, -4F, -29.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1442
		bodyModel[115].setRotationPoint(-46F, -4F, -29.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1443
		bodyModel[116].setRotationPoint(-21F, -2F, -29.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1444
		bodyModel[117].setRotationPoint(-46F, -2F, -29.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1445
		bodyModel[118].setRotationPoint(-1F, -2F, -29.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1446
		bodyModel[119].setRotationPoint(14F, -2F, -29.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 1447
		bodyModel[120].setRotationPoint(37F, -2F, -29.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1448
		bodyModel[121].setRotationPoint(-46F, -5F, 28.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1449
		bodyModel[122].setRotationPoint(37F, -5F, 28.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1450
		bodyModel[123].setRotationPoint(14F, -5F, 28.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1451
		bodyModel[124].setRotationPoint(-21F, -5F, 28.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1452
		bodyModel[125].setRotationPoint(-1F, -5F, 28.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1453
		bodyModel[126].setRotationPoint(37F, -4F, 28.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1454
		bodyModel[127].setRotationPoint(14F, -4F, 28.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1455
		bodyModel[128].setRotationPoint(-1F, -4F, 28.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1456
		bodyModel[129].setRotationPoint(-21F, -4F, 28.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1457
		bodyModel[130].setRotationPoint(-46F, -4F, 28.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1458
		bodyModel[131].setRotationPoint(-21F, -2F, 28.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1459
		bodyModel[132].setRotationPoint(-46F, -2F, 28.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1460
		bodyModel[133].setRotationPoint(-1F, -2F, 28.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 1461
		bodyModel[134].setRotationPoint(14F, -2F, 28.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 1462
		bodyModel[135].setRotationPoint(37F, -2F, 28.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1463
		bodyModel[136].setRotationPoint(-53F, -10F, -9.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1464
		bodyModel[137].setRotationPoint(-54F, -10F, -9.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1465
		bodyModel[138].setRotationPoint(-55F, -10F, -9.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1466
		bodyModel[139].setRotationPoint(-56F, -10F, -10.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1467
		bodyModel[140].setRotationPoint(-56F, -10F, -5.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 1468
		bodyModel[141].setRotationPoint(-53F, -10F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1469
		bodyModel[142].setRotationPoint(-54F, -10F, -4.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1470
		bodyModel[143].setRotationPoint(-55F, -10F, -4.5F);

		bodyModel[144].addTrapezoid(0F, 0F, 0F, 1, 6, 10, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 1471
		bodyModel[144].setRotationPoint(-52F, -10F, 0.5F);

		bodyModel[145].addTrapezoid(0F, 0F, 0F, 1, 4, 5, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 1472
		bodyModel[145].setRotationPoint(-52F, -2F, 0.5F);

		bodyModel[146].addTrapezoid(0F, 0F, 0F, 1, 4, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 1473
		bodyModel[146].setRotationPoint(-52F, -2F, 8.5F);

		bodyModel[147].addTrapezoid(0F, 0F, 0F, 1, 4, 2, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 1474
		bodyModel[147].setRotationPoint(-52F, -2F, 6.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1475
		bodyModel[148].setRotationPoint(35F, -10F, 2.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1476
		turretModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1477
		turretModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1478
		turretModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1479
		turretModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1480
		turretModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1481
		turretModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1482
		turretModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1483
		turretModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1484
		turretModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1485
		turretModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1486
		turretModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1487
		turretModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1488
		turretModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1489
		turretModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1491
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1492
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1493
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1494
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1495
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1496
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1497
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1498
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1499
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1500
		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1501
		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1502
		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1503
		turretModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1504
		turretModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1505
		turretModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1506
		turretModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1507
		turretModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1508
		turretModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1509
		turretModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1510
		turretModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1511
		turretModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1512
		turretModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1513
		turretModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1514
		turretModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1515
		turretModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1516
		turretModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1517
		turretModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1518
		turretModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1519
		turretModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1520
		turretModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1521
		turretModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1522
		turretModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1523
		turretModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1524
		turretModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1525
		turretModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1526
		turretModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1527

		turretModel[0].addShapeBox(0F, 0F, 0F, 20, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1476
		turretModel[0].setRotationPoint(-10F, -17F, -13F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 20, 12, 26, 0F,-6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1477
		turretModel[1].setRotationPoint(-10F, -29F, -13F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 1478
		turretModel[2].setRotationPoint(10F, -17F, -13F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 12, 12, 26, 0F,0F, 0F, -3F, -3F, -3F, -9F, -3F, -3F, -9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 1479
		turretModel[3].setRotationPoint(10F, -29F, -13F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1480
		turretModel[4].setRotationPoint(22F, -25F, -3F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 3, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1481
		turretModel[5].setRotationPoint(19F, -25F, -3F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 8, 4, 26, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 1482
		turretModel[6].setRotationPoint(-18F, -17F, -13F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 8, 12, 26, 0F,0F, -3F, -9F, 6F, 0F, -3F, 6F, 0F, -3F, 0F, -3F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 1483
		turretModel[7].setRotationPoint(-18F, -29F, -13F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 8, 9, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1484
		turretModel[8].setRotationPoint(-26F, -26F, -7F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 1485
		turretModel[9].setRotationPoint(-26F, -17F, -7F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1486
		turretModel[10].setRotationPoint(-26F, -16F, -5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1487
		turretModel[11].setRotationPoint(19F, -25F, -4F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1488
		turretModel[12].setRotationPoint(19F, -25F, 3F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, -1F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 1489
		turretModel[13].setRotationPoint(22F, -25F, -4F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, 0F, 0F, -1F, 0F); // Box 1491
		turretModel[14].setRotationPoint(22F, -25F, 3F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1492
		turretModel[15].setRotationPoint(6F, -24F, -13F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1493
		turretModel[16].setRotationPoint(-12F, -24F, -13F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 27, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1494
		turretModel[17].setRotationPoint(-12F, -26F, -14F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 6F); // Box 1495
		turretModel[18].setRotationPoint(-22F, -26F, -14F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 6F, 0F, 0F, 0F); // Box 1496
		turretModel[19].setRotationPoint(15F, -26F, -14F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1497
		turretModel[20].setRotationPoint(13F, -24F, -13F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1498
		turretModel[21].setRotationPoint(-4F, -24F, -13F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1499
		turretModel[22].setRotationPoint(-12F, -15F, -15F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 6F); // Box 1500
		turretModel[23].setRotationPoint(-22F, -15F, -15F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 6F, 0F, 0F, 0F); // Box 1501
		turretModel[24].setRotationPoint(15F, -15F, -15F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1502
		turretModel[25].setRotationPoint(-12F, -19F, -15F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1503
		turretModel[26].setRotationPoint(7F, -19F, -15F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 27, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1504
		turretModel[27].setRotationPoint(-12F, -26F, 13F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, -3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F); // Box 1505
		turretModel[28].setRotationPoint(-22F, -26F, 13F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, -3F, 6F, 0F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 6F, 0F, -3F, -6F, 0F, 0F, 0F); // Box 1506
		turretModel[29].setRotationPoint(15F, -26F, 13F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1507
		turretModel[30].setRotationPoint(-12F, -15F, 14F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, -3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F); // Box 1508
		turretModel[31].setRotationPoint(-22F, -15F, 14F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 6F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 6F, 0F, -3F, -6F, 0F, 0F, 0F); // Box 1509
		turretModel[32].setRotationPoint(15F, -15F, 14F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1510
		turretModel[33].setRotationPoint(-12F, -19F, 14F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1511
		turretModel[34].setRotationPoint(7F, -19F, 14F);

		turretModel[35].addTrapezoid(0F, 0F, 0F, 14, 1, 20, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 1512
		turretModel[35].setRotationPoint(-4F, -30F, -10F);

		turretModel[36].addTrapezoid(0F, 0F, 0F, 4, 2, 12, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 1513
		turretModel[36].setRotationPoint(1F, -32F, -8F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 1514
		turretModel[37].setRotationPoint(-3F, -32F, -8F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1515
		turretModel[38].setRotationPoint(5F, -32F, -8F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, -3F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -1F, 0F, 3F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 3F, 0F); // Box 1516
		turretModel[39].setRotationPoint(-18F, -30F, -4F);

		turretModel[40].addShapeBox(0F, -0.5F, -1.5F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1517
		turretModel[40].setRotationPoint(22F, -20.5F, 0F);

		turretModel[41].addShapeBox(0F, -1.5F, -1.5F, 29, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1518
		turretModel[41].setRotationPoint(22F, -20.5F, 0F);

		turretModel[42].addShapeBox(0F, 0.5F, -1.5F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1519
		turretModel[42].setRotationPoint(22F, -20.5F, 0F);

		turretModel[43].addShapeBox(29F, -1F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1520
		turretModel[43].setRotationPoint(22F, -20.5F, 0F);

		turretModel[44].addShapeBox(29F, -2F, -2F, 5, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1521
		turretModel[44].setRotationPoint(22F, -20.5F, 0F);

		turretModel[45].addShapeBox(29F, 1F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1522
		turretModel[45].setRotationPoint(22F, -20.5F, 0F);

		turretModel[46].addShapeBox(29F, -1F, 1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1523
		turretModel[46].setRotationPoint(22F, -20.5F, 0F);

		turretModel[47].addShapeBox(31F, -1F, 1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1524
		turretModel[47].setRotationPoint(22F, -20.5F, 0F);

		turretModel[48].addShapeBox(31F, -1F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1525
		turretModel[48].setRotationPoint(22F, -20.5F, 0F);

		turretModel[49].addShapeBox(33F, -1F, 1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1526
		turretModel[49].setRotationPoint(22F, -20.5F, 0F);

		turretModel[50].addShapeBox(33F, -1F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1527
		turretModel[50].setRotationPoint(22F, -20.5F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 677
		leftTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 678
		leftTrackModel[2] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 679
		leftTrackModel[3] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 680
		leftTrackModel[4] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 681
		leftTrackModel[5] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 682
		leftTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 683
		leftTrackModel[7] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 684
		leftTrackModel[8] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 685
		leftTrackModel[9] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 686
		leftTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 687
		leftTrackModel[11] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 688
		leftTrackModel[12] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 689
		leftTrackModel[13] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 690
		leftTrackModel[14] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 691
		leftTrackModel[15] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 692
		leftTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 693
		leftTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 694
		leftTrackModel[18] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 695
		leftTrackModel[19] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 696
		leftTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 697
		leftTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 698
		leftTrackModel[22] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 699
		leftTrackModel[23] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 700
		leftTrackModel[24] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 701
		leftTrackModel[25] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 702
		leftTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 703
		leftTrackModel[27] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 704
		leftTrackModel[28] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 705
		leftTrackModel[29] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 706
		leftTrackModel[30] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 707
		leftTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 708
		leftTrackModel[32] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 709
		leftTrackModel[33] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 710
		leftTrackModel[34] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 711
		leftTrackModel[35] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 712
		leftTrackModel[36] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 713
		leftTrackModel[37] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 714
		leftTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 715
		leftTrackModel[39] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 716
		leftTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Box 717
		leftTrackModel[41] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Box 718
		leftTrackModel[42] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Box 719
		leftTrackModel[43] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Box 720
		leftTrackModel[44] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Box 721
		leftTrackModel[45] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 722
		leftTrackModel[46] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 723
		leftTrackModel[47] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 724
		leftTrackModel[48] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 725
		leftTrackModel[49] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 726
		leftTrackModel[50] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 727
		leftTrackModel[51] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 728
		leftTrackModel[52] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 729
		leftTrackModel[53] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 730
		leftTrackModel[54] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 731
		leftTrackModel[55] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 732
		leftTrackModel[56] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 733
		leftTrackModel[57] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 734
		leftTrackModel[58] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 735
		leftTrackModel[59] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 736
		leftTrackModel[60] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 737
		leftTrackModel[61] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 738
		leftTrackModel[62] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 739
		leftTrackModel[63] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 740
		leftTrackModel[64] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 741
		leftTrackModel[65] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 742
		leftTrackModel[66] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 743
		leftTrackModel[67] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 744
		leftTrackModel[68] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 745
		leftTrackModel[69] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 746
		leftTrackModel[70] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 747
		leftTrackModel[71] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 748
		leftTrackModel[72] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 749
		leftTrackModel[73] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 750
		leftTrackModel[74] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 751
		leftTrackModel[75] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 752
		leftTrackModel[76] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 753
		leftTrackModel[77] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 754
		leftTrackModel[78] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 755
		leftTrackModel[79] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 756
		leftTrackModel[80] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 757
		leftTrackModel[81] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 758
		leftTrackModel[82] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 759
		leftTrackModel[83] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 760
		leftTrackModel[84] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 761
		leftTrackModel[85] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 762
		leftTrackModel[86] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 763
		leftTrackModel[87] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 764
		leftTrackModel[88] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 765
		leftTrackModel[89] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 766
		leftTrackModel[90] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 767
		leftTrackModel[91] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 768
		leftTrackModel[92] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 769
		leftTrackModel[93] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 770
		leftTrackModel[94] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 771
		leftTrackModel[95] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 772
		leftTrackModel[96] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 773
		leftTrackModel[97] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 774
		leftTrackModel[98] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 775
		leftTrackModel[99] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 776
		leftTrackModel[100] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 777
		leftTrackModel[101] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 778
		leftTrackModel[102] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 779
		leftTrackModel[103] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 780
		leftTrackModel[104] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 781
		leftTrackModel[105] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 782
		leftTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 783
		leftTrackModel[107] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 784
		leftTrackModel[108] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 785
		leftTrackModel[109] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 786
		leftTrackModel[110] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 787
		leftTrackModel[111] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 788
		leftTrackModel[112] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 789
		leftTrackModel[113] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 790
		leftTrackModel[114] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 791
		leftTrackModel[115] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 792
		leftTrackModel[116] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 793
		leftTrackModel[117] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 794
		leftTrackModel[118] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 795
		leftTrackModel[119] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 796
		leftTrackModel[120] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 797
		leftTrackModel[121] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 798
		leftTrackModel[122] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 799
		leftTrackModel[123] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 800
		leftTrackModel[124] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 801
		leftTrackModel[125] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 802
		leftTrackModel[126] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 803
		leftTrackModel[127] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 804
		leftTrackModel[128] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 805
		leftTrackModel[129] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 806
		leftTrackModel[130] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 807
		leftTrackModel[131] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 808
		leftTrackModel[132] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 809
		leftTrackModel[133] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 810
		leftTrackModel[134] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 811
		leftTrackModel[135] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 812
		leftTrackModel[136] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 813
		leftTrackModel[137] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 814
		leftTrackModel[138] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 815
		leftTrackModel[139] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 816
		leftTrackModel[140] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 817
		leftTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 818
		leftTrackModel[142] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 819
		leftTrackModel[143] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 820
		leftTrackModel[144] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 821
		leftTrackModel[145] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 822
		leftTrackModel[146] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 823
		leftTrackModel[147] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 824
		leftTrackModel[148] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 825
		leftTrackModel[149] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 826
		leftTrackModel[150] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 827
		leftTrackModel[151] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 828
		leftTrackModel[152] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 829
		leftTrackModel[153] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 830
		leftTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 831
		leftTrackModel[155] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 832
		leftTrackModel[156] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 833
		leftTrackModel[157] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 834
		leftTrackModel[158] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 835
		leftTrackModel[159] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 836
		leftTrackModel[160] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 837
		leftTrackModel[161] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 838
		leftTrackModel[162] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 839
		leftTrackModel[163] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 840
		leftTrackModel[164] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 841
		leftTrackModel[165] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 842
		leftTrackModel[166] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 843
		leftTrackModel[167] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 844
		leftTrackModel[168] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 845
		leftTrackModel[169] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 846
		leftTrackModel[170] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 847
		leftTrackModel[171] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 848
		leftTrackModel[172] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 849
		leftTrackModel[173] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 850
		leftTrackModel[174] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 851
		leftTrackModel[175] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 852
		leftTrackModel[176] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 853
		leftTrackModel[177] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 854
		leftTrackModel[178] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 855
		leftTrackModel[179] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 856
		leftTrackModel[180] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 857
		leftTrackModel[181] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 858
		leftTrackModel[182] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 859
		leftTrackModel[183] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 860
		leftTrackModel[184] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 861
		leftTrackModel[185] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 862
		leftTrackModel[186] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 863
		leftTrackModel[187] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 864
		leftTrackModel[188] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 865
		leftTrackModel[189] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 866
		leftTrackModel[190] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 867
		leftTrackModel[191] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 868
		leftTrackModel[192] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 869
		leftTrackModel[193] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 870
		leftTrackModel[194] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 871
		leftTrackModel[195] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 872
		leftTrackModel[196] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 873
		leftTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 874
		leftTrackModel[198] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 875
		leftTrackModel[199] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 876
		leftTrackModel[200] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 877
		leftTrackModel[201] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 878
		leftTrackModel[202] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 879
		leftTrackModel[203] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 880
		leftTrackModel[204] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 881
		leftTrackModel[205] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 882
		leftTrackModel[206] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 883
		leftTrackModel[207] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 884
		leftTrackModel[208] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 885
		leftTrackModel[209] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 886
		leftTrackModel[210] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 887
		leftTrackModel[211] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 888
		leftTrackModel[212] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 889
		leftTrackModel[213] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 890
		leftTrackModel[214] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 891
		leftTrackModel[215] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 892
		leftTrackModel[216] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 893
		leftTrackModel[217] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 894
		leftTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 895
		leftTrackModel[219] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 896
		leftTrackModel[220] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 897
		leftTrackModel[221] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 898
		leftTrackModel[222] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 899
		leftTrackModel[223] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 900
		leftTrackModel[224] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 901
		leftTrackModel[225] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 902
		leftTrackModel[226] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 903
		leftTrackModel[227] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 904
		leftTrackModel[228] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 905
		leftTrackModel[229] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 906
		leftTrackModel[230] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 907
		leftTrackModel[231] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 908
		leftTrackModel[232] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 909
		leftTrackModel[233] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 910
		leftTrackModel[234] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 911
		leftTrackModel[235] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 912
		leftTrackModel[236] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 913
		leftTrackModel[237] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 914
		leftTrackModel[238] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 915
		leftTrackModel[239] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 916
		leftTrackModel[240] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 917
		leftTrackModel[241] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 918
		leftTrackModel[242] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 919
		leftTrackModel[243] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 920
		leftTrackModel[244] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 921
		leftTrackModel[245] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 922
		leftTrackModel[246] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 923
		leftTrackModel[247] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 924
		leftTrackModel[248] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 925
		leftTrackModel[249] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 926
		leftTrackModel[250] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 927
		leftTrackModel[251] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 928
		leftTrackModel[252] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 929
		leftTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 930
		leftTrackModel[254] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 931
		leftTrackModel[255] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 932
		leftTrackModel[256] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 933
		leftTrackModel[257] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 934
		leftTrackModel[258] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 935
		leftTrackModel[259] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 936
		leftTrackModel[260] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 937
		leftTrackModel[261] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 938
		leftTrackModel[262] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 939
		leftTrackModel[263] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 940
		leftTrackModel[264] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 941
		leftTrackModel[265] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 942
		leftTrackModel[266] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 943
		leftTrackModel[267] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 944
		leftTrackModel[268] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 945
		leftTrackModel[269] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 946
		leftTrackModel[270] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 947
		leftTrackModel[271] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 948
		leftTrackModel[272] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 949
		leftTrackModel[273] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 950
		leftTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 951
		leftTrackModel[275] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 952
		leftTrackModel[276] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 953
		leftTrackModel[277] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 954
		leftTrackModel[278] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 955
		leftTrackModel[279] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 956
		leftTrackModel[280] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 957
		leftTrackModel[281] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 958
		leftTrackModel[282] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 959
		leftTrackModel[283] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 960
		leftTrackModel[284] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 961
		leftTrackModel[285] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 962
		leftTrackModel[286] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 963
		leftTrackModel[287] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 964
		leftTrackModel[288] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 965
		leftTrackModel[289] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 966
		leftTrackModel[290] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 967
		leftTrackModel[291] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 968
		leftTrackModel[292] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 969
		leftTrackModel[293] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 970
		leftTrackModel[294] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 971
		leftTrackModel[295] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 972
		leftTrackModel[296] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 973
		leftTrackModel[297] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 974
		leftTrackModel[298] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 975
		leftTrackModel[299] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 976
		leftTrackModel[300] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 977
		leftTrackModel[301] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 978
		leftTrackModel[302] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 979
		leftTrackModel[303] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 980
		leftTrackModel[304] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 981
		leftTrackModel[305] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 982
		leftTrackModel[306] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 983
		leftTrackModel[307] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 984
		leftTrackModel[308] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 985
		leftTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 986
		leftTrackModel[310] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 987
		leftTrackModel[311] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 988
		leftTrackModel[312] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 989
		leftTrackModel[313] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 990
		leftTrackModel[314] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 991
		leftTrackModel[315] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 992
		leftTrackModel[316] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 993
		leftTrackModel[317] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 994
		leftTrackModel[318] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 995
		leftTrackModel[319] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 996
		leftTrackModel[320] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 997
		leftTrackModel[321] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 998
		leftTrackModel[322] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 999
		leftTrackModel[323] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1000
		leftTrackModel[324] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1001
		leftTrackModel[325] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1002
		leftTrackModel[326] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1003
		leftTrackModel[327] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1004
		leftTrackModel[328] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1005
		leftTrackModel[329] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1006
		leftTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1007
		leftTrackModel[331] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1008
		leftTrackModel[332] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1009
		leftTrackModel[333] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1010
		leftTrackModel[334] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1011
		leftTrackModel[335] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1012
		leftTrackModel[336] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1013
		leftTrackModel[337] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1014
		leftTrackModel[338] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1015
		leftTrackModel[339] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1016
		leftTrackModel[340] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1017
		leftTrackModel[341] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1018
		leftTrackModel[342] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1019
		leftTrackModel[343] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1020
		leftTrackModel[344] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1021
		leftTrackModel[345] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1022
		leftTrackModel[346] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1023
		leftTrackModel[347] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1024
		leftTrackModel[348] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1025
		leftTrackModel[349] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1026
		leftTrackModel[350] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1027
		leftTrackModel[351] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1028
		leftTrackModel[352] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1029
		leftTrackModel[353] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1030
		leftTrackModel[354] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1031
		leftTrackModel[355] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1032
		leftTrackModel[356] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1033
		leftTrackModel[357] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1034
		leftTrackModel[358] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1035
		leftTrackModel[359] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1036
		leftTrackModel[360] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1037
		leftTrackModel[361] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1038
		leftTrackModel[362] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1039
		leftTrackModel[363] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1040
		leftTrackModel[364] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1041
		leftTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1042
		leftTrackModel[366] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1043
		leftTrackModel[367] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1044
		leftTrackModel[368] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1045
		leftTrackModel[369] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1046
		leftTrackModel[370] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1047
		leftTrackModel[371] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1048
		leftTrackModel[372] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1049
		leftTrackModel[373] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1050
		leftTrackModel[374] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1051
		leftTrackModel[375] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1052
		leftTrackModel[376] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1053
		leftTrackModel[377] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1054
		leftTrackModel[378] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1055
		leftTrackModel[379] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1056
		leftTrackModel[380] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1057
		leftTrackModel[381] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1058
		leftTrackModel[382] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1059
		leftTrackModel[383] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1060
		leftTrackModel[384] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1061
		leftTrackModel[385] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1062
		leftTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1063
		leftTrackModel[387] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1064
		leftTrackModel[388] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1065
		leftTrackModel[389] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1066
		leftTrackModel[390] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1067
		leftTrackModel[391] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1068
		leftTrackModel[392] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1069
		leftTrackModel[393] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1070
		leftTrackModel[394] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1071
		leftTrackModel[395] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1072
		leftTrackModel[396] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1073
		leftTrackModel[397] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1074
		leftTrackModel[398] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1075
		leftTrackModel[399] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1076
		leftTrackModel[400] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1077
		leftTrackModel[401] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1078
		leftTrackModel[402] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1079
		leftTrackModel[403] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1080
		leftTrackModel[404] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1081
		leftTrackModel[405] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1082
		leftTrackModel[406] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1083
		leftTrackModel[407] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1084
		leftTrackModel[408] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1085
		leftTrackModel[409] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1086
		leftTrackModel[410] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1087
		leftTrackModel[411] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1088
		leftTrackModel[412] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1089
		leftTrackModel[413] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1090
		leftTrackModel[414] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1091
		leftTrackModel[415] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1092
		leftTrackModel[416] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1093
		leftTrackModel[417] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1094
		leftTrackModel[418] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1095
		leftTrackModel[419] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1096
		leftTrackModel[420] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1097
		leftTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1098
		leftTrackModel[422] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1099
		leftTrackModel[423] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1100
		leftTrackModel[424] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1101
		leftTrackModel[425] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1102
		leftTrackModel[426] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1103
		leftTrackModel[427] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1104
		leftTrackModel[428] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1105
		leftTrackModel[429] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1106
		leftTrackModel[430] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1107
		leftTrackModel[431] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1108
		leftTrackModel[432] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1109
		leftTrackModel[433] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1110
		leftTrackModel[434] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1111
		leftTrackModel[435] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1112
		leftTrackModel[436] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1113
		leftTrackModel[437] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1114
		leftTrackModel[438] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1115
		leftTrackModel[439] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1116
		leftTrackModel[440] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1117
		leftTrackModel[441] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1118
		leftTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1119
		leftTrackModel[443] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1120
		leftTrackModel[444] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1121
		leftTrackModel[445] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1122
		leftTrackModel[446] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1123
		leftTrackModel[447] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1124
		leftTrackModel[448] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1125
		leftTrackModel[449] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1126
		leftTrackModel[450] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1127
		leftTrackModel[451] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1128
		leftTrackModel[452] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1129
		leftTrackModel[453] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1130
		leftTrackModel[454] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1131
		leftTrackModel[455] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1132
		leftTrackModel[456] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1133
		leftTrackModel[457] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1134
		leftTrackModel[458] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1135
		leftTrackModel[459] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1136
		leftTrackModel[460] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1137
		leftTrackModel[461] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1138
		leftTrackModel[462] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1139
		leftTrackModel[463] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1140
		leftTrackModel[464] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1141
		leftTrackModel[465] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1142
		leftTrackModel[466] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1143
		leftTrackModel[467] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1144
		leftTrackModel[468] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1145
		leftTrackModel[469] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1146
		leftTrackModel[470] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1147
		leftTrackModel[471] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1148
		leftTrackModel[472] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1149
		leftTrackModel[473] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1150
		leftTrackModel[474] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1151
		leftTrackModel[475] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1152
		leftTrackModel[476] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1153
		leftTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1154
		leftTrackModel[478] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1155
		leftTrackModel[479] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1156
		leftTrackModel[480] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1157
		leftTrackModel[481] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1158
		leftTrackModel[482] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1159
		leftTrackModel[483] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1160
		leftTrackModel[484] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1161
		leftTrackModel[485] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1162
		leftTrackModel[486] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1163
		leftTrackModel[487] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1164
		leftTrackModel[488] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1165
		leftTrackModel[489] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1166
		leftTrackModel[490] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1167
		leftTrackModel[491] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1168
		leftTrackModel[492] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1169
		leftTrackModel[493] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1170
		leftTrackModel[494] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1171
		leftTrackModel[495] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1172
		leftTrackModel[496] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1173
		leftTrackModel[497] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1174
		leftTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1175
		leftTrackModel[499] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1176

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		leftTrackModel[0].setRotationPoint(45F, -6F, 18.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		leftTrackModel[1].setRotationPoint(45F, -8F, 18.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		leftTrackModel[2].setRotationPoint(46F, -9F, 18.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 680
		leftTrackModel[3].setRotationPoint(45F, -3F, 18.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 681
		leftTrackModel[4].setRotationPoint(46F, -1F, 18.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		leftTrackModel[5].setRotationPoint(35F, -1F, 18.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 683
		leftTrackModel[6].setRotationPoint(34F, 0F, 18.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 684
		leftTrackModel[7].setRotationPoint(34F, 2F, 18.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 685
		leftTrackModel[8].setRotationPoint(34F, 5F, 18.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 686
		leftTrackModel[9].setRotationPoint(35F, 7F, 18.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		leftTrackModel[10].setRotationPoint(22F, -1F, 18.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		leftTrackModel[11].setRotationPoint(21F, 0F, 18.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		leftTrackModel[12].setRotationPoint(21F, 2F, 18.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 690
		leftTrackModel[13].setRotationPoint(21F, 5F, 18.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 691
		leftTrackModel[14].setRotationPoint(22F, 7F, 18.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		leftTrackModel[15].setRotationPoint(9F, -1F, 18.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		leftTrackModel[16].setRotationPoint(8F, 0F, 18.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		leftTrackModel[17].setRotationPoint(8F, 2F, 18.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 695
		leftTrackModel[18].setRotationPoint(8F, 5F, 18.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 696
		leftTrackModel[19].setRotationPoint(9F, 7F, 18.5F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		leftTrackModel[20].setRotationPoint(-40F, -1F, 18.5F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		leftTrackModel[21].setRotationPoint(-41F, 0F, 18.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		leftTrackModel[22].setRotationPoint(-41F, 2F, 18.5F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 700
		leftTrackModel[23].setRotationPoint(-41F, 5F, 18.5F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 701
		leftTrackModel[24].setRotationPoint(-40F, 7F, 18.5F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		leftTrackModel[25].setRotationPoint(-27F, -1F, 18.5F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		leftTrackModel[26].setRotationPoint(-28F, 0F, 18.5F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		leftTrackModel[27].setRotationPoint(-28F, 2F, 18.5F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 705
		leftTrackModel[28].setRotationPoint(-28F, 5F, 18.5F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 706
		leftTrackModel[29].setRotationPoint(-27F, 7F, 18.5F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		leftTrackModel[30].setRotationPoint(-14F, -1F, 18.5F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		leftTrackModel[31].setRotationPoint(-15F, 0F, 18.5F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		leftTrackModel[32].setRotationPoint(-15F, 2F, 18.5F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 710
		leftTrackModel[33].setRotationPoint(-15F, 5F, 18.5F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 711
		leftTrackModel[34].setRotationPoint(-14F, 7F, 18.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 712
		leftTrackModel[35].setRotationPoint(-48F, -1F, 18.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		leftTrackModel[36].setRotationPoint(-49F, -6F, 18.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 714
		leftTrackModel[37].setRotationPoint(-49F, -3F, 18.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		leftTrackModel[38].setRotationPoint(-49F, -8F, 18.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		leftTrackModel[39].setRotationPoint(-48F, -9F, 18.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		leftTrackModel[40].setRotationPoint(-2.5F, -1F, 18.5F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		leftTrackModel[41].setRotationPoint(-3.5F, 0F, 18.5F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		leftTrackModel[42].setRotationPoint(-3.5F, 2F, 18.5F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 720
		leftTrackModel[43].setRotationPoint(-3.5F, 5F, 18.5F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 721
		leftTrackModel[44].setRotationPoint(-2.5F, 7F, 18.5F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		leftTrackModel[45].setRotationPoint(48F, -10F, 25.5F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		leftTrackModel[46].setRotationPoint(48F, -10F, 17.5F);

		leftTrackModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 724
		leftTrackModel[47].setRotationPoint(48F, -10F, 25.5F);

		leftTrackModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		leftTrackModel[48].setRotationPoint(48F, -10F, 17.5F);

		leftTrackModel[49].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		leftTrackModel[49].setRotationPoint(48F, -10F, 16.5F);

		leftTrackModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 727
		leftTrackModel[50].setRotationPoint(48F, -10F, 21.5F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		leftTrackModel[51].setRotationPoint(48F, -10F, 23.5F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		leftTrackModel[52].setRotationPoint(48F, -10F, 20.5F);

		leftTrackModel[53].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		leftTrackModel[53].setRotationPoint(51F, -10F, 16.5F);
		leftTrackModel[53].rotateAngleZ = -0.40142573F;

		leftTrackModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 731
		leftTrackModel[54].setRotationPoint(51F, -10F, 25.5F);
		leftTrackModel[54].rotateAngleZ = -0.40142573F;

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		leftTrackModel[55].setRotationPoint(51F, -10F, 25.5F);
		leftTrackModel[55].rotateAngleZ = -0.40142573F;

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 733
		leftTrackModel[56].setRotationPoint(51F, -10F, 23.5F);
		leftTrackModel[56].rotateAngleZ = -0.40142573F;

		leftTrackModel[57].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 734
		leftTrackModel[57].setRotationPoint(51F, -10F, 21.5F);
		leftTrackModel[57].rotateAngleZ = -0.40142573F;

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		leftTrackModel[58].setRotationPoint(51F, -10F, 20.5F);
		leftTrackModel[58].rotateAngleZ = -0.40142573F;

		leftTrackModel[59].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		leftTrackModel[59].setRotationPoint(51F, -10F, 17.5F);
		leftTrackModel[59].rotateAngleZ = -0.40142573F;

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		leftTrackModel[60].setRotationPoint(51F, -10F, 17.5F);
		leftTrackModel[60].rotateAngleZ = -0.40142573F;

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 738
		leftTrackModel[61].setRotationPoint(53.7F, -8.8F, 25.5F);
		leftTrackModel[61].rotateAngleZ = -1.02974426F;

		leftTrackModel[62].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 739
		leftTrackModel[62].setRotationPoint(53.7F, -8.8F, 25.5F);
		leftTrackModel[62].rotateAngleZ = -1.02974426F;

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		leftTrackModel[63].setRotationPoint(53.7F, -8.8F, 23.5F);
		leftTrackModel[63].rotateAngleZ = -1.02974426F;

		leftTrackModel[64].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 741
		leftTrackModel[64].setRotationPoint(53.7F, -8.8F, 21.5F);
		leftTrackModel[64].rotateAngleZ = -1.02974426F;

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		leftTrackModel[65].setRotationPoint(53.7F, -8.8F, 20.5F);
		leftTrackModel[65].rotateAngleZ = -1.02974426F;

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		leftTrackModel[66].setRotationPoint(53.7F, -8.8F, 17.5F);
		leftTrackModel[66].rotateAngleZ = -1.02974426F;

		leftTrackModel[67].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		leftTrackModel[67].setRotationPoint(53.7F, -8.8F, 17.5F);
		leftTrackModel[67].rotateAngleZ = -1.02974426F;

		leftTrackModel[68].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		leftTrackModel[68].setRotationPoint(53.7F, -8.8F, 16.5F);
		leftTrackModel[68].rotateAngleZ = -1.02974426F;

		leftTrackModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		leftTrackModel[69].setRotationPoint(55.25F, -6.25F, 25.5F);
		leftTrackModel[69].rotateAngleZ = -1.57079633F;

		leftTrackModel[70].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 747
		leftTrackModel[70].setRotationPoint(55.25F, -6.25F, 25.5F);
		leftTrackModel[70].rotateAngleZ = -1.57079633F;

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		leftTrackModel[71].setRotationPoint(55.25F, -6.25F, 23.5F);
		leftTrackModel[71].rotateAngleZ = -1.57079633F;

		leftTrackModel[72].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 749
		leftTrackModel[72].setRotationPoint(55.25F, -6.25F, 21.5F);
		leftTrackModel[72].rotateAngleZ = -1.57079633F;

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		leftTrackModel[73].setRotationPoint(55.25F, -6.25F, 20.5F);
		leftTrackModel[73].rotateAngleZ = -1.57079633F;

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		leftTrackModel[74].setRotationPoint(55.25F, -6.25F, 17.5F);
		leftTrackModel[74].rotateAngleZ = -1.57079633F;

		leftTrackModel[75].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		leftTrackModel[75].setRotationPoint(55.25F, -6.25F, 17.5F);
		leftTrackModel[75].rotateAngleZ = -1.57079633F;

		leftTrackModel[76].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		leftTrackModel[76].setRotationPoint(55.25F, -6.25F, 16.5F);
		leftTrackModel[76].rotateAngleZ = -1.57079633F;

		leftTrackModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		leftTrackModel[77].setRotationPoint(55.25F, -3.25F, 25.5F);
		leftTrackModel[77].rotateAngleZ = -2.07694181F;

		leftTrackModel[78].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 755
		leftTrackModel[78].setRotationPoint(55.25F, -3.25F, 25.5F);
		leftTrackModel[78].rotateAngleZ = -2.07694181F;

		leftTrackModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		leftTrackModel[79].setRotationPoint(55.25F, -3.25F, 23.5F);
		leftTrackModel[79].rotateAngleZ = -2.07694181F;

		leftTrackModel[80].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 757
		leftTrackModel[80].setRotationPoint(55.25F, -3.25F, 21.5F);
		leftTrackModel[80].rotateAngleZ = -2.07694181F;

		leftTrackModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		leftTrackModel[81].setRotationPoint(55.25F, -3.25F, 20.5F);
		leftTrackModel[81].rotateAngleZ = -2.07694181F;

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		leftTrackModel[82].setRotationPoint(55.25F, -3.25F, 17.5F);
		leftTrackModel[82].rotateAngleZ = -2.07694181F;

		leftTrackModel[83].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		leftTrackModel[83].setRotationPoint(55.25F, -3.25F, 17.5F);
		leftTrackModel[83].rotateAngleZ = -2.07694181F;

		leftTrackModel[84].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		leftTrackModel[84].setRotationPoint(55.25F, -3.25F, 16.5F);
		leftTrackModel[84].rotateAngleZ = -2.07694181F;

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		leftTrackModel[85].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[85].rotateAngleZ = -2.47836754F;

		leftTrackModel[86].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 763
		leftTrackModel[86].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[86].rotateAngleZ = -2.47836754F;

		leftTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		leftTrackModel[87].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[87].rotateAngleZ = -2.47836754F;

		leftTrackModel[88].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 765
		leftTrackModel[88].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[88].rotateAngleZ = -2.47836754F;

		leftTrackModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		leftTrackModel[89].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[89].rotateAngleZ = -2.47836754F;

		leftTrackModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		leftTrackModel[90].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[90].rotateAngleZ = -2.47836754F;

		leftTrackModel[91].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 768
		leftTrackModel[91].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[91].rotateAngleZ = -2.47836754F;

		leftTrackModel[92].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		leftTrackModel[92].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[92].rotateAngleZ = -2.47836754F;

		leftTrackModel[93].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		leftTrackModel[93].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[93].rotateAngleZ = -2.47836754F;

		leftTrackModel[94].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 771
		leftTrackModel[94].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[94].rotateAngleZ = -2.47836754F;

		leftTrackModel[95].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		leftTrackModel[95].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[95].rotateAngleZ = -2.47836754F;

		leftTrackModel[96].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 773
		leftTrackModel[96].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[96].rotateAngleZ = -2.47836754F;

		leftTrackModel[97].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		leftTrackModel[97].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[97].rotateAngleZ = -2.47836754F;

		leftTrackModel[98].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		leftTrackModel[98].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[98].rotateAngleZ = -2.47836754F;

		leftTrackModel[99].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		leftTrackModel[99].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[99].rotateAngleZ = -2.47836754F;

		leftTrackModel[100].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		leftTrackModel[100].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[100].rotateAngleZ = -2.47836754F;

		leftTrackModel[101].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		leftTrackModel[101].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[101].rotateAngleZ = -2.47836754F;

		leftTrackModel[102].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 779
		leftTrackModel[102].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[102].rotateAngleZ = -2.47836754F;

		leftTrackModel[103].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		leftTrackModel[103].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[103].rotateAngleZ = -2.47836754F;

		leftTrackModel[104].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 781
		leftTrackModel[104].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[104].rotateAngleZ = -2.47836754F;

		leftTrackModel[105].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		leftTrackModel[105].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[105].rotateAngleZ = -2.47836754F;

		leftTrackModel[106].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		leftTrackModel[106].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[106].rotateAngleZ = -2.47836754F;

		leftTrackModel[107].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		leftTrackModel[107].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[107].rotateAngleZ = -2.47836754F;

		leftTrackModel[108].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 785
		leftTrackModel[108].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[108].rotateAngleZ = -2.47836754F;

		leftTrackModel[109].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 786
		leftTrackModel[109].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[109].rotateAngleZ = -2.47836754F;

		leftTrackModel[110].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 787
		leftTrackModel[110].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[110].rotateAngleZ = -2.47836754F;

		leftTrackModel[111].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		leftTrackModel[111].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[111].rotateAngleZ = -2.47836754F;

		leftTrackModel[112].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 789
		leftTrackModel[112].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[112].rotateAngleZ = -2.47836754F;

		leftTrackModel[113].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		leftTrackModel[113].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[113].rotateAngleZ = -2.47836754F;

		leftTrackModel[114].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		leftTrackModel[114].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[114].rotateAngleZ = -2.47836754F;

		leftTrackModel[115].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		leftTrackModel[115].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[115].rotateAngleZ = -2.47836754F;

		leftTrackModel[116].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		leftTrackModel[116].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[116].rotateAngleZ = -2.47836754F;

		leftTrackModel[117].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
		leftTrackModel[117].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[117].rotateAngleZ = -2.47836754F;

		leftTrackModel[118].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 795
		leftTrackModel[118].setRotationPoint(53.9F, -0.7F, 25.5F);
		leftTrackModel[118].rotateAngleZ = -2.47836754F;

		leftTrackModel[119].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		leftTrackModel[119].setRotationPoint(53.9F, -0.7F, 23.5F);
		leftTrackModel[119].rotateAngleZ = -2.47836754F;

		leftTrackModel[120].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 797
		leftTrackModel[120].setRotationPoint(53.9F, -0.7F, 21.5F);
		leftTrackModel[120].rotateAngleZ = -2.47836754F;

		leftTrackModel[121].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		leftTrackModel[121].setRotationPoint(53.9F, -0.7F, 20.5F);
		leftTrackModel[121].rotateAngleZ = -2.47836754F;

		leftTrackModel[122].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 799
		leftTrackModel[122].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[122].rotateAngleZ = -2.47836754F;

		leftTrackModel[123].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		leftTrackModel[123].setRotationPoint(53.9F, -0.7F, 17.5F);
		leftTrackModel[123].rotateAngleZ = -2.47836754F;

		leftTrackModel[124].addShapeBox(14F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		leftTrackModel[124].setRotationPoint(53.9F, -0.7F, 16.5F);
		leftTrackModel[124].rotateAngleZ = -2.47836754F;

		leftTrackModel[125].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		leftTrackModel[125].setRotationPoint(43.5F, 8.8F, 25.5F);
		leftTrackModel[125].rotateAngleZ = -3.08923278F;

		leftTrackModel[126].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 803
		leftTrackModel[126].setRotationPoint(43.5F, 8.8F, 25.5F);
		leftTrackModel[126].rotateAngleZ = -3.08923278F;

		leftTrackModel[127].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		leftTrackModel[127].setRotationPoint(43.5F, 8.8F, 23.5F);
		leftTrackModel[127].rotateAngleZ = -3.08923278F;

		leftTrackModel[128].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 805
		leftTrackModel[128].setRotationPoint(43.5F, 8.8F, 21.5F);
		leftTrackModel[128].rotateAngleZ = -3.08923278F;

		leftTrackModel[129].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		leftTrackModel[129].setRotationPoint(43.5F, 8.8F, 20.5F);
		leftTrackModel[129].rotateAngleZ = -3.08923278F;

		leftTrackModel[130].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		leftTrackModel[130].setRotationPoint(43.5F, 8.8F, 17.5F);
		leftTrackModel[130].rotateAngleZ = -3.08923278F;

		leftTrackModel[131].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		leftTrackModel[131].setRotationPoint(43.5F, 8.8F, 17.5F);
		leftTrackModel[131].rotateAngleZ = -3.08923278F;

		leftTrackModel[132].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		leftTrackModel[132].setRotationPoint(43.5F, 8.8F, 16.5F);
		leftTrackModel[132].rotateAngleZ = -3.08923278F;

		leftTrackModel[133].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		leftTrackModel[133].setRotationPoint(40.5F, 9F, 25.5F);
		leftTrackModel[133].rotateAngleZ = -3.14159265F;

		leftTrackModel[134].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 811
		leftTrackModel[134].setRotationPoint(40.5F, 9F, 25.5F);
		leftTrackModel[134].rotateAngleZ = -3.14159265F;

		leftTrackModel[135].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		leftTrackModel[135].setRotationPoint(40.5F, 9F, 23.5F);
		leftTrackModel[135].rotateAngleZ = -3.14159265F;

		leftTrackModel[136].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 813
		leftTrackModel[136].setRotationPoint(40.5F, 9F, 21.5F);
		leftTrackModel[136].rotateAngleZ = -3.14159265F;

		leftTrackModel[137].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		leftTrackModel[137].setRotationPoint(40.5F, 9F, 20.5F);
		leftTrackModel[137].rotateAngleZ = -3.14159265F;

		leftTrackModel[138].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		leftTrackModel[138].setRotationPoint(40.5F, 9F, 17.5F);
		leftTrackModel[138].rotateAngleZ = -3.14159265F;

		leftTrackModel[139].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		leftTrackModel[139].setRotationPoint(40.5F, 9F, 17.5F);
		leftTrackModel[139].rotateAngleZ = -3.14159265F;

		leftTrackModel[140].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		leftTrackModel[140].setRotationPoint(40.5F, 9F, 16.5F);
		leftTrackModel[140].rotateAngleZ = -3.14159265F;

		leftTrackModel[141].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 818
		leftTrackModel[141].setRotationPoint(37.5F, 9F, 25.5F);
		leftTrackModel[141].rotateAngleZ = -3.14159265F;

		leftTrackModel[142].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 819
		leftTrackModel[142].setRotationPoint(37.5F, 9F, 25.5F);
		leftTrackModel[142].rotateAngleZ = -3.14159265F;

		leftTrackModel[143].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		leftTrackModel[143].setRotationPoint(37.5F, 9F, 23.5F);
		leftTrackModel[143].rotateAngleZ = -3.14159265F;

		leftTrackModel[144].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 821
		leftTrackModel[144].setRotationPoint(37.5F, 9F, 21.5F);
		leftTrackModel[144].rotateAngleZ = -3.14159265F;

		leftTrackModel[145].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
		leftTrackModel[145].setRotationPoint(37.5F, 9F, 20.5F);
		leftTrackModel[145].rotateAngleZ = -3.14159265F;

		leftTrackModel[146].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		leftTrackModel[146].setRotationPoint(37.5F, 9F, 17.5F);
		leftTrackModel[146].rotateAngleZ = -3.14159265F;

		leftTrackModel[147].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		leftTrackModel[147].setRotationPoint(37.5F, 9F, 17.5F);
		leftTrackModel[147].rotateAngleZ = -3.14159265F;

		leftTrackModel[148].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		leftTrackModel[148].setRotationPoint(37.5F, 9F, 16.5F);
		leftTrackModel[148].rotateAngleZ = -3.14159265F;

		leftTrackModel[149].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		leftTrackModel[149].setRotationPoint(34.5F, 9F, 25.5F);
		leftTrackModel[149].rotateAngleZ = -3.14159265F;

		leftTrackModel[150].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 827
		leftTrackModel[150].setRotationPoint(34.5F, 9F, 25.5F);
		leftTrackModel[150].rotateAngleZ = -3.14159265F;

		leftTrackModel[151].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		leftTrackModel[151].setRotationPoint(34.5F, 9F, 23.5F);
		leftTrackModel[151].rotateAngleZ = -3.14159265F;

		leftTrackModel[152].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 829
		leftTrackModel[152].setRotationPoint(34.5F, 9F, 21.5F);
		leftTrackModel[152].rotateAngleZ = -3.14159265F;

		leftTrackModel[153].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
		leftTrackModel[153].setRotationPoint(34.5F, 9F, 20.5F);
		leftTrackModel[153].rotateAngleZ = -3.14159265F;

		leftTrackModel[154].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 831
		leftTrackModel[154].setRotationPoint(34.5F, 9F, 17.5F);
		leftTrackModel[154].rotateAngleZ = -3.14159265F;

		leftTrackModel[155].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		leftTrackModel[155].setRotationPoint(34.5F, 9F, 17.5F);
		leftTrackModel[155].rotateAngleZ = -3.14159265F;

		leftTrackModel[156].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		leftTrackModel[156].setRotationPoint(34.5F, 9F, 16.5F);
		leftTrackModel[156].rotateAngleZ = -3.14159265F;

		leftTrackModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		leftTrackModel[157].setRotationPoint(31.5F, 9F, 25.5F);
		leftTrackModel[157].rotateAngleZ = -3.14159265F;

		leftTrackModel[158].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 835
		leftTrackModel[158].setRotationPoint(31.5F, 9F, 25.5F);
		leftTrackModel[158].rotateAngleZ = -3.14159265F;

		leftTrackModel[159].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		leftTrackModel[159].setRotationPoint(31.5F, 9F, 23.5F);
		leftTrackModel[159].rotateAngleZ = -3.14159265F;

		leftTrackModel[160].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 837
		leftTrackModel[160].setRotationPoint(31.5F, 9F, 21.5F);
		leftTrackModel[160].rotateAngleZ = -3.14159265F;

		leftTrackModel[161].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		leftTrackModel[161].setRotationPoint(31.5F, 9F, 20.5F);
		leftTrackModel[161].rotateAngleZ = -3.14159265F;

		leftTrackModel[162].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839
		leftTrackModel[162].setRotationPoint(31.5F, 9F, 17.5F);
		leftTrackModel[162].rotateAngleZ = -3.14159265F;

		leftTrackModel[163].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840
		leftTrackModel[163].setRotationPoint(31.5F, 9F, 17.5F);
		leftTrackModel[163].rotateAngleZ = -3.14159265F;

		leftTrackModel[164].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
		leftTrackModel[164].setRotationPoint(31.5F, 9F, 16.5F);
		leftTrackModel[164].rotateAngleZ = -3.14159265F;

		leftTrackModel[165].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		leftTrackModel[165].setRotationPoint(28.5F, 9F, 25.5F);
		leftTrackModel[165].rotateAngleZ = -3.14159265F;

		leftTrackModel[166].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 843
		leftTrackModel[166].setRotationPoint(28.5F, 9F, 25.5F);
		leftTrackModel[166].rotateAngleZ = -3.14159265F;

		leftTrackModel[167].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		leftTrackModel[167].setRotationPoint(28.5F, 9F, 23.5F);
		leftTrackModel[167].rotateAngleZ = -3.14159265F;

		leftTrackModel[168].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 845
		leftTrackModel[168].setRotationPoint(28.5F, 9F, 21.5F);
		leftTrackModel[168].rotateAngleZ = -3.14159265F;

		leftTrackModel[169].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		leftTrackModel[169].setRotationPoint(28.5F, 9F, 20.5F);
		leftTrackModel[169].rotateAngleZ = -3.14159265F;

		leftTrackModel[170].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		leftTrackModel[170].setRotationPoint(28.5F, 9F, 17.5F);
		leftTrackModel[170].rotateAngleZ = -3.14159265F;

		leftTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		leftTrackModel[171].setRotationPoint(28.5F, 9F, 17.5F);
		leftTrackModel[171].rotateAngleZ = -3.14159265F;

		leftTrackModel[172].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		leftTrackModel[172].setRotationPoint(28.5F, 9F, 16.5F);
		leftTrackModel[172].rotateAngleZ = -3.14159265F;

		leftTrackModel[173].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		leftTrackModel[173].setRotationPoint(25.5F, 9F, 25.5F);
		leftTrackModel[173].rotateAngleZ = -3.14159265F;

		leftTrackModel[174].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 851
		leftTrackModel[174].setRotationPoint(25.5F, 9F, 25.5F);
		leftTrackModel[174].rotateAngleZ = -3.14159265F;

		leftTrackModel[175].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
		leftTrackModel[175].setRotationPoint(25.5F, 9F, 23.5F);
		leftTrackModel[175].rotateAngleZ = -3.14159265F;

		leftTrackModel[176].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 853
		leftTrackModel[176].setRotationPoint(25.5F, 9F, 21.5F);
		leftTrackModel[176].rotateAngleZ = -3.14159265F;

		leftTrackModel[177].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 854
		leftTrackModel[177].setRotationPoint(25.5F, 9F, 20.5F);
		leftTrackModel[177].rotateAngleZ = -3.14159265F;

		leftTrackModel[178].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 855
		leftTrackModel[178].setRotationPoint(25.5F, 9F, 17.5F);
		leftTrackModel[178].rotateAngleZ = -3.14159265F;

		leftTrackModel[179].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		leftTrackModel[179].setRotationPoint(25.5F, 9F, 17.5F);
		leftTrackModel[179].rotateAngleZ = -3.14159265F;

		leftTrackModel[180].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 857
		leftTrackModel[180].setRotationPoint(25.5F, 9F, 16.5F);
		leftTrackModel[180].rotateAngleZ = -3.14159265F;

		leftTrackModel[181].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 858
		leftTrackModel[181].setRotationPoint(22.5F, 9F, 25.5F);
		leftTrackModel[181].rotateAngleZ = -3.14159265F;

		leftTrackModel[182].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 859
		leftTrackModel[182].setRotationPoint(22.5F, 9F, 25.5F);
		leftTrackModel[182].rotateAngleZ = -3.14159265F;

		leftTrackModel[183].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 860
		leftTrackModel[183].setRotationPoint(22.5F, 9F, 23.5F);
		leftTrackModel[183].rotateAngleZ = -3.14159265F;

		leftTrackModel[184].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 861
		leftTrackModel[184].setRotationPoint(22.5F, 9F, 21.5F);
		leftTrackModel[184].rotateAngleZ = -3.14159265F;

		leftTrackModel[185].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		leftTrackModel[185].setRotationPoint(22.5F, 9F, 20.5F);
		leftTrackModel[185].rotateAngleZ = -3.14159265F;

		leftTrackModel[186].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
		leftTrackModel[186].setRotationPoint(22.5F, 9F, 17.5F);
		leftTrackModel[186].rotateAngleZ = -3.14159265F;

		leftTrackModel[187].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		leftTrackModel[187].setRotationPoint(22.5F, 9F, 17.5F);
		leftTrackModel[187].rotateAngleZ = -3.14159265F;

		leftTrackModel[188].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 865
		leftTrackModel[188].setRotationPoint(22.5F, 9F, 16.5F);
		leftTrackModel[188].rotateAngleZ = -3.14159265F;

		leftTrackModel[189].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		leftTrackModel[189].setRotationPoint(19.5F, 9F, 25.5F);
		leftTrackModel[189].rotateAngleZ = -3.14159265F;

		leftTrackModel[190].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 867
		leftTrackModel[190].setRotationPoint(19.5F, 9F, 25.5F);
		leftTrackModel[190].rotateAngleZ = -3.14159265F;

		leftTrackModel[191].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		leftTrackModel[191].setRotationPoint(19.5F, 9F, 23.5F);
		leftTrackModel[191].rotateAngleZ = -3.14159265F;

		leftTrackModel[192].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 869
		leftTrackModel[192].setRotationPoint(19.5F, 9F, 21.5F);
		leftTrackModel[192].rotateAngleZ = -3.14159265F;

		leftTrackModel[193].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		leftTrackModel[193].setRotationPoint(19.5F, 9F, 20.5F);
		leftTrackModel[193].rotateAngleZ = -3.14159265F;

		leftTrackModel[194].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		leftTrackModel[194].setRotationPoint(19.5F, 9F, 17.5F);
		leftTrackModel[194].rotateAngleZ = -3.14159265F;

		leftTrackModel[195].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 872
		leftTrackModel[195].setRotationPoint(19.5F, 9F, 17.5F);
		leftTrackModel[195].rotateAngleZ = -3.14159265F;

		leftTrackModel[196].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
		leftTrackModel[196].setRotationPoint(19.5F, 9F, 16.5F);
		leftTrackModel[196].rotateAngleZ = -3.14159265F;

		leftTrackModel[197].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		leftTrackModel[197].setRotationPoint(16.5F, 9F, 25.5F);
		leftTrackModel[197].rotateAngleZ = -3.14159265F;

		leftTrackModel[198].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 875
		leftTrackModel[198].setRotationPoint(16.5F, 9F, 25.5F);
		leftTrackModel[198].rotateAngleZ = -3.14159265F;

		leftTrackModel[199].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		leftTrackModel[199].setRotationPoint(16.5F, 9F, 23.5F);
		leftTrackModel[199].rotateAngleZ = -3.14159265F;

		leftTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 877
		leftTrackModel[200].setRotationPoint(16.5F, 9F, 21.5F);
		leftTrackModel[200].rotateAngleZ = -3.14159265F;

		leftTrackModel[201].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		leftTrackModel[201].setRotationPoint(16.5F, 9F, 20.5F);
		leftTrackModel[201].rotateAngleZ = -3.14159265F;

		leftTrackModel[202].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		leftTrackModel[202].setRotationPoint(16.5F, 9F, 17.5F);
		leftTrackModel[202].rotateAngleZ = -3.14159265F;

		leftTrackModel[203].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		leftTrackModel[203].setRotationPoint(16.5F, 9F, 17.5F);
		leftTrackModel[203].rotateAngleZ = -3.14159265F;

		leftTrackModel[204].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		leftTrackModel[204].setRotationPoint(16.5F, 9F, 16.5F);
		leftTrackModel[204].rotateAngleZ = -3.14159265F;

		leftTrackModel[205].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		leftTrackModel[205].setRotationPoint(13.5F, 9F, 25.5F);
		leftTrackModel[205].rotateAngleZ = -3.14159265F;

		leftTrackModel[206].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 883
		leftTrackModel[206].setRotationPoint(13.5F, 9F, 25.5F);
		leftTrackModel[206].rotateAngleZ = -3.14159265F;

		leftTrackModel[207].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		leftTrackModel[207].setRotationPoint(13.5F, 9F, 23.5F);
		leftTrackModel[207].rotateAngleZ = -3.14159265F;

		leftTrackModel[208].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 885
		leftTrackModel[208].setRotationPoint(13.5F, 9F, 21.5F);
		leftTrackModel[208].rotateAngleZ = -3.14159265F;

		leftTrackModel[209].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 886
		leftTrackModel[209].setRotationPoint(13.5F, 9F, 20.5F);
		leftTrackModel[209].rotateAngleZ = -3.14159265F;

		leftTrackModel[210].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 887
		leftTrackModel[210].setRotationPoint(13.5F, 9F, 17.5F);
		leftTrackModel[210].rotateAngleZ = -3.14159265F;

		leftTrackModel[211].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 888
		leftTrackModel[211].setRotationPoint(13.5F, 9F, 17.5F);
		leftTrackModel[211].rotateAngleZ = -3.14159265F;

		leftTrackModel[212].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		leftTrackModel[212].setRotationPoint(13.5F, 9F, 16.5F);
		leftTrackModel[212].rotateAngleZ = -3.14159265F;

		leftTrackModel[213].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		leftTrackModel[213].setRotationPoint(10.5F, 9F, 25.5F);
		leftTrackModel[213].rotateAngleZ = -3.14159265F;

		leftTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 891
		leftTrackModel[214].setRotationPoint(10.5F, 9F, 25.5F);
		leftTrackModel[214].rotateAngleZ = -3.14159265F;

		leftTrackModel[215].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		leftTrackModel[215].setRotationPoint(10.5F, 9F, 23.5F);
		leftTrackModel[215].rotateAngleZ = -3.14159265F;

		leftTrackModel[216].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 893
		leftTrackModel[216].setRotationPoint(10.5F, 9F, 21.5F);
		leftTrackModel[216].rotateAngleZ = -3.14159265F;

		leftTrackModel[217].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		leftTrackModel[217].setRotationPoint(10.5F, 9F, 20.5F);
		leftTrackModel[217].rotateAngleZ = -3.14159265F;

		leftTrackModel[218].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 895
		leftTrackModel[218].setRotationPoint(10.5F, 9F, 17.5F);
		leftTrackModel[218].rotateAngleZ = -3.14159265F;

		leftTrackModel[219].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		leftTrackModel[219].setRotationPoint(10.5F, 9F, 17.5F);
		leftTrackModel[219].rotateAngleZ = -3.14159265F;

		leftTrackModel[220].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		leftTrackModel[220].setRotationPoint(10.5F, 9F, 16.5F);
		leftTrackModel[220].rotateAngleZ = -3.14159265F;

		leftTrackModel[221].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		leftTrackModel[221].setRotationPoint(7.5F, 9F, 25.5F);
		leftTrackModel[221].rotateAngleZ = -3.14159265F;

		leftTrackModel[222].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 899
		leftTrackModel[222].setRotationPoint(7.5F, 9F, 25.5F);
		leftTrackModel[222].rotateAngleZ = -3.14159265F;

		leftTrackModel[223].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		leftTrackModel[223].setRotationPoint(7.5F, 9F, 23.5F);
		leftTrackModel[223].rotateAngleZ = -3.14159265F;

		leftTrackModel[224].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 901
		leftTrackModel[224].setRotationPoint(7.5F, 9F, 21.5F);
		leftTrackModel[224].rotateAngleZ = -3.14159265F;

		leftTrackModel[225].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		leftTrackModel[225].setRotationPoint(7.5F, 9F, 20.5F);
		leftTrackModel[225].rotateAngleZ = -3.14159265F;

		leftTrackModel[226].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		leftTrackModel[226].setRotationPoint(7.5F, 9F, 17.5F);
		leftTrackModel[226].rotateAngleZ = -3.14159265F;

		leftTrackModel[227].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		leftTrackModel[227].setRotationPoint(7.5F, 9F, 17.5F);
		leftTrackModel[227].rotateAngleZ = -3.14159265F;

		leftTrackModel[228].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		leftTrackModel[228].setRotationPoint(7.5F, 9F, 16.5F);
		leftTrackModel[228].rotateAngleZ = -3.14159265F;

		leftTrackModel[229].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		leftTrackModel[229].setRotationPoint(4.5F, 9F, 25.5F);
		leftTrackModel[229].rotateAngleZ = -3.14159265F;

		leftTrackModel[230].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 907
		leftTrackModel[230].setRotationPoint(4.5F, 9F, 25.5F);
		leftTrackModel[230].rotateAngleZ = -3.14159265F;

		leftTrackModel[231].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		leftTrackModel[231].setRotationPoint(4.5F, 9F, 23.5F);
		leftTrackModel[231].rotateAngleZ = -3.14159265F;

		leftTrackModel[232].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 909
		leftTrackModel[232].setRotationPoint(4.5F, 9F, 21.5F);
		leftTrackModel[232].rotateAngleZ = -3.14159265F;

		leftTrackModel[233].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		leftTrackModel[233].setRotationPoint(4.5F, 9F, 20.5F);
		leftTrackModel[233].rotateAngleZ = -3.14159265F;

		leftTrackModel[234].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		leftTrackModel[234].setRotationPoint(4.5F, 9F, 17.5F);
		leftTrackModel[234].rotateAngleZ = -3.14159265F;

		leftTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		leftTrackModel[235].setRotationPoint(4.5F, 9F, 17.5F);
		leftTrackModel[235].rotateAngleZ = -3.14159265F;

		leftTrackModel[236].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		leftTrackModel[236].setRotationPoint(4.5F, 9F, 16.5F);
		leftTrackModel[236].rotateAngleZ = -3.14159265F;

		leftTrackModel[237].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		leftTrackModel[237].setRotationPoint(1.5F, 9F, 25.5F);
		leftTrackModel[237].rotateAngleZ = -3.14159265F;

		leftTrackModel[238].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 915
		leftTrackModel[238].setRotationPoint(1.5F, 9F, 25.5F);
		leftTrackModel[238].rotateAngleZ = -3.14159265F;

		leftTrackModel[239].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		leftTrackModel[239].setRotationPoint(1.5F, 9F, 23.5F);
		leftTrackModel[239].rotateAngleZ = -3.14159265F;

		leftTrackModel[240].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 917
		leftTrackModel[240].setRotationPoint(1.5F, 9F, 21.5F);
		leftTrackModel[240].rotateAngleZ = -3.14159265F;

		leftTrackModel[241].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		leftTrackModel[241].setRotationPoint(1.5F, 9F, 20.5F);
		leftTrackModel[241].rotateAngleZ = -3.14159265F;

		leftTrackModel[242].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 919
		leftTrackModel[242].setRotationPoint(1.5F, 9F, 17.5F);
		leftTrackModel[242].rotateAngleZ = -3.14159265F;

		leftTrackModel[243].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 920
		leftTrackModel[243].setRotationPoint(1.5F, 9F, 17.5F);
		leftTrackModel[243].rotateAngleZ = -3.14159265F;

		leftTrackModel[244].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		leftTrackModel[244].setRotationPoint(1.5F, 9F, 16.5F);
		leftTrackModel[244].rotateAngleZ = -3.14159265F;

		leftTrackModel[245].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		leftTrackModel[245].setRotationPoint(-1.5F, 9F, 25.5F);
		leftTrackModel[245].rotateAngleZ = -3.14159265F;

		leftTrackModel[246].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 923
		leftTrackModel[246].setRotationPoint(-1.5F, 9F, 25.5F);
		leftTrackModel[246].rotateAngleZ = -3.14159265F;

		leftTrackModel[247].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		leftTrackModel[247].setRotationPoint(-1.5F, 9F, 23.5F);
		leftTrackModel[247].rotateAngleZ = -3.14159265F;

		leftTrackModel[248].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 925
		leftTrackModel[248].setRotationPoint(-1.5F, 9F, 21.5F);
		leftTrackModel[248].rotateAngleZ = -3.14159265F;

		leftTrackModel[249].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		leftTrackModel[249].setRotationPoint(-1.5F, 9F, 20.5F);
		leftTrackModel[249].rotateAngleZ = -3.14159265F;

		leftTrackModel[250].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		leftTrackModel[250].setRotationPoint(-1.5F, 9F, 17.5F);
		leftTrackModel[250].rotateAngleZ = -3.14159265F;

		leftTrackModel[251].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		leftTrackModel[251].setRotationPoint(-1.5F, 9F, 17.5F);
		leftTrackModel[251].rotateAngleZ = -3.14159265F;

		leftTrackModel[252].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 929
		leftTrackModel[252].setRotationPoint(-1.5F, 9F, 16.5F);
		leftTrackModel[252].rotateAngleZ = -3.14159265F;

		leftTrackModel[253].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		leftTrackModel[253].setRotationPoint(-4.5F, 9F, 25.5F);
		leftTrackModel[253].rotateAngleZ = -3.14159265F;

		leftTrackModel[254].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 931
		leftTrackModel[254].setRotationPoint(-4.5F, 9F, 25.5F);
		leftTrackModel[254].rotateAngleZ = -3.14159265F;

		leftTrackModel[255].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		leftTrackModel[255].setRotationPoint(-4.5F, 9F, 23.5F);
		leftTrackModel[255].rotateAngleZ = -3.14159265F;

		leftTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 933
		leftTrackModel[256].setRotationPoint(-4.5F, 9F, 21.5F);
		leftTrackModel[256].rotateAngleZ = -3.14159265F;

		leftTrackModel[257].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 934
		leftTrackModel[257].setRotationPoint(-4.5F, 9F, 20.5F);
		leftTrackModel[257].rotateAngleZ = -3.14159265F;

		leftTrackModel[258].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 935
		leftTrackModel[258].setRotationPoint(-4.5F, 9F, 17.5F);
		leftTrackModel[258].rotateAngleZ = -3.14159265F;

		leftTrackModel[259].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 936
		leftTrackModel[259].setRotationPoint(-4.5F, 9F, 17.5F);
		leftTrackModel[259].rotateAngleZ = -3.14159265F;

		leftTrackModel[260].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 937
		leftTrackModel[260].setRotationPoint(-4.5F, 9F, 16.5F);
		leftTrackModel[260].rotateAngleZ = -3.14159265F;

		leftTrackModel[261].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		leftTrackModel[261].setRotationPoint(-7.5F, 9F, 25.5F);
		leftTrackModel[261].rotateAngleZ = -3.14159265F;

		leftTrackModel[262].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 939
		leftTrackModel[262].setRotationPoint(-7.5F, 9F, 25.5F);
		leftTrackModel[262].rotateAngleZ = -3.14159265F;

		leftTrackModel[263].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 940
		leftTrackModel[263].setRotationPoint(-7.5F, 9F, 23.5F);
		leftTrackModel[263].rotateAngleZ = -3.14159265F;

		leftTrackModel[264].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 941
		leftTrackModel[264].setRotationPoint(-7.5F, 9F, 21.5F);
		leftTrackModel[264].rotateAngleZ = -3.14159265F;

		leftTrackModel[265].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		leftTrackModel[265].setRotationPoint(-7.5F, 9F, 20.5F);
		leftTrackModel[265].rotateAngleZ = -3.14159265F;

		leftTrackModel[266].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 943
		leftTrackModel[266].setRotationPoint(-7.5F, 9F, 17.5F);
		leftTrackModel[266].rotateAngleZ = -3.14159265F;

		leftTrackModel[267].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		leftTrackModel[267].setRotationPoint(-7.5F, 9F, 17.5F);
		leftTrackModel[267].rotateAngleZ = -3.14159265F;

		leftTrackModel[268].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 945
		leftTrackModel[268].setRotationPoint(-7.5F, 9F, 16.5F);
		leftTrackModel[268].rotateAngleZ = -3.14159265F;

		leftTrackModel[269].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
		leftTrackModel[269].setRotationPoint(-10.5F, 9F, 25.5F);
		leftTrackModel[269].rotateAngleZ = -3.14159265F;

		leftTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 947
		leftTrackModel[270].setRotationPoint(-10.5F, 9F, 25.5F);
		leftTrackModel[270].rotateAngleZ = -3.14159265F;

		leftTrackModel[271].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 948
		leftTrackModel[271].setRotationPoint(-10.5F, 9F, 23.5F);
		leftTrackModel[271].rotateAngleZ = -3.14159265F;

		leftTrackModel[272].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 949
		leftTrackModel[272].setRotationPoint(-10.5F, 9F, 21.5F);
		leftTrackModel[272].rotateAngleZ = -3.14159265F;

		leftTrackModel[273].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		leftTrackModel[273].setRotationPoint(-10.5F, 9F, 20.5F);
		leftTrackModel[273].rotateAngleZ = -3.14159265F;

		leftTrackModel[274].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 951
		leftTrackModel[274].setRotationPoint(-10.5F, 9F, 17.5F);
		leftTrackModel[274].rotateAngleZ = -3.14159265F;

		leftTrackModel[275].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		leftTrackModel[275].setRotationPoint(-10.5F, 9F, 17.5F);
		leftTrackModel[275].rotateAngleZ = -3.14159265F;

		leftTrackModel[276].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		leftTrackModel[276].setRotationPoint(-10.5F, 9F, 16.5F);
		leftTrackModel[276].rotateAngleZ = -3.14159265F;

		leftTrackModel[277].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		leftTrackModel[277].setRotationPoint(-13.5F, 9F, 25.5F);
		leftTrackModel[277].rotateAngleZ = -3.14159265F;

		leftTrackModel[278].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 955
		leftTrackModel[278].setRotationPoint(-13.5F, 9F, 25.5F);
		leftTrackModel[278].rotateAngleZ = -3.14159265F;

		leftTrackModel[279].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 956
		leftTrackModel[279].setRotationPoint(-13.5F, 9F, 23.5F);
		leftTrackModel[279].rotateAngleZ = -3.14159265F;

		leftTrackModel[280].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 957
		leftTrackModel[280].setRotationPoint(-13.5F, 9F, 21.5F);
		leftTrackModel[280].rotateAngleZ = -3.14159265F;

		leftTrackModel[281].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 958
		leftTrackModel[281].setRotationPoint(-13.5F, 9F, 20.5F);
		leftTrackModel[281].rotateAngleZ = -3.14159265F;

		leftTrackModel[282].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		leftTrackModel[282].setRotationPoint(-13.5F, 9F, 17.5F);
		leftTrackModel[282].rotateAngleZ = -3.14159265F;

		leftTrackModel[283].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		leftTrackModel[283].setRotationPoint(-13.5F, 9F, 17.5F);
		leftTrackModel[283].rotateAngleZ = -3.14159265F;

		leftTrackModel[284].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 961
		leftTrackModel[284].setRotationPoint(-13.5F, 9F, 16.5F);
		leftTrackModel[284].rotateAngleZ = -3.14159265F;

		leftTrackModel[285].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		leftTrackModel[285].setRotationPoint(-16.5F, 9F, 25.5F);
		leftTrackModel[285].rotateAngleZ = -3.14159265F;

		leftTrackModel[286].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 963
		leftTrackModel[286].setRotationPoint(-16.5F, 9F, 25.5F);
		leftTrackModel[286].rotateAngleZ = -3.14159265F;

		leftTrackModel[287].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		leftTrackModel[287].setRotationPoint(-16.5F, 9F, 23.5F);
		leftTrackModel[287].rotateAngleZ = -3.14159265F;

		leftTrackModel[288].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 965
		leftTrackModel[288].setRotationPoint(-16.5F, 9F, 21.5F);
		leftTrackModel[288].rotateAngleZ = -3.14159265F;

		leftTrackModel[289].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		leftTrackModel[289].setRotationPoint(-16.5F, 9F, 20.5F);
		leftTrackModel[289].rotateAngleZ = -3.14159265F;

		leftTrackModel[290].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		leftTrackModel[290].setRotationPoint(-16.5F, 9F, 17.5F);
		leftTrackModel[290].rotateAngleZ = -3.14159265F;

		leftTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		leftTrackModel[291].setRotationPoint(-16.5F, 9F, 17.5F);
		leftTrackModel[291].rotateAngleZ = -3.14159265F;

		leftTrackModel[292].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		leftTrackModel[292].setRotationPoint(-16.5F, 9F, 16.5F);
		leftTrackModel[292].rotateAngleZ = -3.14159265F;

		leftTrackModel[293].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		leftTrackModel[293].setRotationPoint(-19.5F, 9F, 25.5F);
		leftTrackModel[293].rotateAngleZ = -3.14159265F;

		leftTrackModel[294].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 971
		leftTrackModel[294].setRotationPoint(-19.5F, 9F, 25.5F);
		leftTrackModel[294].rotateAngleZ = -3.14159265F;

		leftTrackModel[295].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		leftTrackModel[295].setRotationPoint(-19.5F, 9F, 23.5F);
		leftTrackModel[295].rotateAngleZ = -3.14159265F;

		leftTrackModel[296].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 973
		leftTrackModel[296].setRotationPoint(-19.5F, 9F, 21.5F);
		leftTrackModel[296].rotateAngleZ = -3.14159265F;

		leftTrackModel[297].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		leftTrackModel[297].setRotationPoint(-19.5F, 9F, 20.5F);
		leftTrackModel[297].rotateAngleZ = -3.14159265F;

		leftTrackModel[298].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		leftTrackModel[298].setRotationPoint(-19.5F, 9F, 17.5F);
		leftTrackModel[298].rotateAngleZ = -3.14159265F;

		leftTrackModel[299].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		leftTrackModel[299].setRotationPoint(-19.5F, 9F, 17.5F);
		leftTrackModel[299].rotateAngleZ = -3.14159265F;

		leftTrackModel[300].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		leftTrackModel[300].setRotationPoint(-19.5F, 9F, 16.5F);
		leftTrackModel[300].rotateAngleZ = -3.14159265F;

		leftTrackModel[301].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		leftTrackModel[301].setRotationPoint(-22.5F, 9F, 25.5F);
		leftTrackModel[301].rotateAngleZ = -3.14159265F;

		leftTrackModel[302].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 979
		leftTrackModel[302].setRotationPoint(-22.5F, 9F, 25.5F);
		leftTrackModel[302].rotateAngleZ = -3.14159265F;

		leftTrackModel[303].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		leftTrackModel[303].setRotationPoint(-22.5F, 9F, 23.5F);
		leftTrackModel[303].rotateAngleZ = -3.14159265F;

		leftTrackModel[304].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 981
		leftTrackModel[304].setRotationPoint(-22.5F, 9F, 21.5F);
		leftTrackModel[304].rotateAngleZ = -3.14159265F;

		leftTrackModel[305].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 982
		leftTrackModel[305].setRotationPoint(-22.5F, 9F, 20.5F);
		leftTrackModel[305].rotateAngleZ = -3.14159265F;

		leftTrackModel[306].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		leftTrackModel[306].setRotationPoint(-22.5F, 9F, 17.5F);
		leftTrackModel[306].rotateAngleZ = -3.14159265F;

		leftTrackModel[307].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 984
		leftTrackModel[307].setRotationPoint(-22.5F, 9F, 17.5F);
		leftTrackModel[307].rotateAngleZ = -3.14159265F;

		leftTrackModel[308].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 985
		leftTrackModel[308].setRotationPoint(-22.5F, 9F, 16.5F);
		leftTrackModel[308].rotateAngleZ = -3.14159265F;

		leftTrackModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		leftTrackModel[309].setRotationPoint(-26.5F, 9F, 25.5F);
		leftTrackModel[309].rotateAngleZ = -3.14159265F;

		leftTrackModel[310].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 987
		leftTrackModel[310].setRotationPoint(-26.5F, 9F, 25.5F);
		leftTrackModel[310].rotateAngleZ = -3.14159265F;

		leftTrackModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 988
		leftTrackModel[311].setRotationPoint(-26.5F, 9F, 23.5F);
		leftTrackModel[311].rotateAngleZ = -3.14159265F;

		leftTrackModel[312].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 989
		leftTrackModel[312].setRotationPoint(-26.5F, 9F, 21.5F);
		leftTrackModel[312].rotateAngleZ = -3.14159265F;

		leftTrackModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		leftTrackModel[313].setRotationPoint(-26.5F, 9F, 20.5F);
		leftTrackModel[313].rotateAngleZ = -3.14159265F;

		leftTrackModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		leftTrackModel[314].setRotationPoint(-26.5F, 9F, 17.5F);
		leftTrackModel[314].rotateAngleZ = -3.14159265F;

		leftTrackModel[315].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 992
		leftTrackModel[315].setRotationPoint(-26.5F, 9F, 17.5F);
		leftTrackModel[315].rotateAngleZ = -3.14159265F;

		leftTrackModel[316].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 993
		leftTrackModel[316].setRotationPoint(-26.5F, 9F, 16.5F);
		leftTrackModel[316].rotateAngleZ = -3.14159265F;

		leftTrackModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 994
		leftTrackModel[317].setRotationPoint(-29.5F, 9F, 25.5F);
		leftTrackModel[317].rotateAngleZ = -3.14159265F;

		leftTrackModel[318].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 995
		leftTrackModel[318].setRotationPoint(-29.5F, 9F, 25.5F);
		leftTrackModel[318].rotateAngleZ = -3.14159265F;

		leftTrackModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 996
		leftTrackModel[319].setRotationPoint(-29.5F, 9F, 23.5F);
		leftTrackModel[319].rotateAngleZ = -3.14159265F;

		leftTrackModel[320].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 997
		leftTrackModel[320].setRotationPoint(-29.5F, 9F, 21.5F);
		leftTrackModel[320].rotateAngleZ = -3.14159265F;

		leftTrackModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 998
		leftTrackModel[321].setRotationPoint(-29.5F, 9F, 20.5F);
		leftTrackModel[321].rotateAngleZ = -3.14159265F;

		leftTrackModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 999
		leftTrackModel[322].setRotationPoint(-29.5F, 9F, 17.5F);
		leftTrackModel[322].rotateAngleZ = -3.14159265F;

		leftTrackModel[323].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		leftTrackModel[323].setRotationPoint(-29.5F, 9F, 17.5F);
		leftTrackModel[323].rotateAngleZ = -3.14159265F;

		leftTrackModel[324].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1001
		leftTrackModel[324].setRotationPoint(-29.5F, 9F, 16.5F);
		leftTrackModel[324].rotateAngleZ = -3.14159265F;

		leftTrackModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1002
		leftTrackModel[325].setRotationPoint(-32.5F, 9F, 25.5F);
		leftTrackModel[325].rotateAngleZ = -3.14159265F;

		leftTrackModel[326].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1003
		leftTrackModel[326].setRotationPoint(-32.5F, 9F, 25.5F);
		leftTrackModel[326].rotateAngleZ = -3.14159265F;

		leftTrackModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		leftTrackModel[327].setRotationPoint(-32.5F, 9F, 23.5F);
		leftTrackModel[327].rotateAngleZ = -3.14159265F;

		leftTrackModel[328].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1005
		leftTrackModel[328].setRotationPoint(-32.5F, 9F, 21.5F);
		leftTrackModel[328].rotateAngleZ = -3.14159265F;

		leftTrackModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		leftTrackModel[329].setRotationPoint(-32.5F, 9F, 20.5F);
		leftTrackModel[329].rotateAngleZ = -3.14159265F;

		leftTrackModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		leftTrackModel[330].setRotationPoint(-32.5F, 9F, 17.5F);
		leftTrackModel[330].rotateAngleZ = -3.14159265F;

		leftTrackModel[331].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		leftTrackModel[331].setRotationPoint(-32.5F, 9F, 17.5F);
		leftTrackModel[331].rotateAngleZ = -3.14159265F;

		leftTrackModel[332].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		leftTrackModel[332].setRotationPoint(-32.5F, 9F, 16.5F);
		leftTrackModel[332].rotateAngleZ = -3.14159265F;

		leftTrackModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1010
		leftTrackModel[333].setRotationPoint(-35.5F, 9F, 25.5F);
		leftTrackModel[333].rotateAngleZ = -3.14159265F;

		leftTrackModel[334].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1011
		leftTrackModel[334].setRotationPoint(-35.5F, 9F, 25.5F);
		leftTrackModel[334].rotateAngleZ = -3.14159265F;

		leftTrackModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1012
		leftTrackModel[335].setRotationPoint(-35.5F, 9F, 23.5F);
		leftTrackModel[335].rotateAngleZ = -3.14159265F;

		leftTrackModel[336].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1013
		leftTrackModel[336].setRotationPoint(-35.5F, 9F, 21.5F);
		leftTrackModel[336].rotateAngleZ = -3.14159265F;

		leftTrackModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		leftTrackModel[337].setRotationPoint(-35.5F, 9F, 20.5F);
		leftTrackModel[337].rotateAngleZ = -3.14159265F;

		leftTrackModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		leftTrackModel[338].setRotationPoint(-35.5F, 9F, 17.5F);
		leftTrackModel[338].rotateAngleZ = -3.14159265F;

		leftTrackModel[339].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		leftTrackModel[339].setRotationPoint(-35.5F, 9F, 17.5F);
		leftTrackModel[339].rotateAngleZ = -3.14159265F;

		leftTrackModel[340].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		leftTrackModel[340].setRotationPoint(-35.5F, 9F, 16.5F);
		leftTrackModel[340].rotateAngleZ = -3.14159265F;

		leftTrackModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		leftTrackModel[341].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[341].rotateAngleZ = -3.78736448F;

		leftTrackModel[342].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1019
		leftTrackModel[342].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[342].rotateAngleZ = -3.78736448F;

		leftTrackModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		leftTrackModel[343].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[343].rotateAngleZ = -3.78736448F;

		leftTrackModel[344].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1021
		leftTrackModel[344].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[344].rotateAngleZ = -3.78736448F;

		leftTrackModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1022
		leftTrackModel[345].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[345].rotateAngleZ = -3.78736448F;

		leftTrackModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1023
		leftTrackModel[346].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[346].rotateAngleZ = -3.78736448F;

		leftTrackModel[347].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		leftTrackModel[347].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[347].rotateAngleZ = -3.78736448F;

		leftTrackModel[348].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1025
		leftTrackModel[348].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[348].rotateAngleZ = -3.78736448F;

		leftTrackModel[349].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		leftTrackModel[349].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[349].rotateAngleZ = -3.78736448F;

		leftTrackModel[350].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1027
		leftTrackModel[350].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[350].rotateAngleZ = -3.78736448F;

		leftTrackModel[351].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		leftTrackModel[351].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[351].rotateAngleZ = -3.78736448F;

		leftTrackModel[352].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1029
		leftTrackModel[352].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[352].rotateAngleZ = -3.78736448F;

		leftTrackModel[353].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		leftTrackModel[353].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[353].rotateAngleZ = -3.78736448F;

		leftTrackModel[354].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		leftTrackModel[354].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[354].rotateAngleZ = -3.78736448F;

		leftTrackModel[355].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1032
		leftTrackModel[355].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[355].rotateAngleZ = -3.78736448F;

		leftTrackModel[356].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1033
		leftTrackModel[356].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[356].rotateAngleZ = -3.78736448F;

		leftTrackModel[357].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		leftTrackModel[357].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[357].rotateAngleZ = -3.78736448F;

		leftTrackModel[358].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1035
		leftTrackModel[358].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[358].rotateAngleZ = -3.78736448F;

		leftTrackModel[359].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1036
		leftTrackModel[359].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[359].rotateAngleZ = -3.78736448F;

		leftTrackModel[360].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1037
		leftTrackModel[360].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[360].rotateAngleZ = -3.78736448F;

		leftTrackModel[361].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		leftTrackModel[361].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[361].rotateAngleZ = -3.78736448F;

		leftTrackModel[362].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		leftTrackModel[362].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[362].rotateAngleZ = -3.78736448F;

		leftTrackModel[363].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1040
		leftTrackModel[363].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[363].rotateAngleZ = -3.78736448F;

		leftTrackModel[364].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1041
		leftTrackModel[364].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[364].rotateAngleZ = -3.78736448F;

		leftTrackModel[365].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		leftTrackModel[365].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[365].rotateAngleZ = -3.78736448F;

		leftTrackModel[366].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1043
		leftTrackModel[366].setRotationPoint(-38.5F, 9F, 25.5F);
		leftTrackModel[366].rotateAngleZ = -3.78736448F;

		leftTrackModel[367].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1044
		leftTrackModel[367].setRotationPoint(-38.5F, 9F, 23.5F);
		leftTrackModel[367].rotateAngleZ = -3.78736448F;

		leftTrackModel[368].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1045
		leftTrackModel[368].setRotationPoint(-38.5F, 9F, 21.5F);
		leftTrackModel[368].rotateAngleZ = -3.78736448F;

		leftTrackModel[369].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		leftTrackModel[369].setRotationPoint(-38.5F, 9F, 20.5F);
		leftTrackModel[369].rotateAngleZ = -3.78736448F;

		leftTrackModel[370].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1047
		leftTrackModel[370].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[370].rotateAngleZ = -3.78736448F;

		leftTrackModel[371].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1048
		leftTrackModel[371].setRotationPoint(-38.5F, 9F, 17.5F);
		leftTrackModel[371].rotateAngleZ = -3.78736448F;

		leftTrackModel[372].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049
		leftTrackModel[372].setRotationPoint(-38.5F, 9F, 16.5F);
		leftTrackModel[372].rotateAngleZ = -3.78736448F;

		leftTrackModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		leftTrackModel[373].setRotationPoint(-48F, 1.8F, 25.5F);
		leftTrackModel[373].rotateAngleZ = -4.1887902F;

		leftTrackModel[374].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1051
		leftTrackModel[374].setRotationPoint(-48F, 1.8F, 25.5F);
		leftTrackModel[374].rotateAngleZ = -4.1887902F;

		leftTrackModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1052
		leftTrackModel[375].setRotationPoint(-48F, 1.8F, 23.5F);
		leftTrackModel[375].rotateAngleZ = -4.1887902F;

		leftTrackModel[376].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1053
		leftTrackModel[376].setRotationPoint(-48F, 1.8F, 21.5F);
		leftTrackModel[376].rotateAngleZ = -4.1887902F;

		leftTrackModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		leftTrackModel[377].setRotationPoint(-48F, 1.8F, 20.5F);
		leftTrackModel[377].rotateAngleZ = -4.1887902F;

		leftTrackModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1055
		leftTrackModel[378].setRotationPoint(-48F, 1.8F, 17.5F);
		leftTrackModel[378].rotateAngleZ = -4.1887902F;

		leftTrackModel[379].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1056
		leftTrackModel[379].setRotationPoint(-48F, 1.8F, 17.5F);
		leftTrackModel[379].rotateAngleZ = -4.1887902F;

		leftTrackModel[380].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1057
		leftTrackModel[380].setRotationPoint(-48F, 1.8F, 16.5F);
		leftTrackModel[380].rotateAngleZ = -4.1887902F;

		leftTrackModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1058
		leftTrackModel[381].setRotationPoint(-49.5F, -0.8F, 25.5F);
		leftTrackModel[381].rotateAngleZ = -4.52040276F;

		leftTrackModel[382].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1059
		leftTrackModel[382].setRotationPoint(-49.5F, -0.8F, 25.5F);
		leftTrackModel[382].rotateAngleZ = -4.52040276F;

		leftTrackModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1060
		leftTrackModel[383].setRotationPoint(-49.5F, -0.8F, 23.5F);
		leftTrackModel[383].rotateAngleZ = -4.52040276F;

		leftTrackModel[384].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1061
		leftTrackModel[384].setRotationPoint(-49.5F, -0.8F, 21.5F);
		leftTrackModel[384].rotateAngleZ = -4.52040276F;

		leftTrackModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1062
		leftTrackModel[385].setRotationPoint(-49.5F, -0.8F, 20.5F);
		leftTrackModel[385].rotateAngleZ = -4.52040276F;

		leftTrackModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1063
		leftTrackModel[386].setRotationPoint(-49.5F, -0.8F, 17.5F);
		leftTrackModel[386].rotateAngleZ = -4.52040276F;

		leftTrackModel[387].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1064
		leftTrackModel[387].setRotationPoint(-49.5F, -0.8F, 17.5F);
		leftTrackModel[387].rotateAngleZ = -4.52040276F;

		leftTrackModel[388].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1065
		leftTrackModel[388].setRotationPoint(-49.5F, -0.8F, 16.5F);
		leftTrackModel[388].rotateAngleZ = -4.52040276F;

		leftTrackModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1066
		leftTrackModel[389].setRotationPoint(-50F, -3.6F, 25.5F);
		leftTrackModel[389].rotateAngleZ = -4.71238898F;

		leftTrackModel[390].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1067
		leftTrackModel[390].setRotationPoint(-50F, -3.6F, 25.5F);
		leftTrackModel[390].rotateAngleZ = -4.71238898F;

		leftTrackModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1068
		leftTrackModel[391].setRotationPoint(-50F, -3.6F, 23.5F);
		leftTrackModel[391].rotateAngleZ = -4.71238898F;

		leftTrackModel[392].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1069
		leftTrackModel[392].setRotationPoint(-50F, -3.6F, 21.5F);
		leftTrackModel[392].rotateAngleZ = -4.71238898F;

		leftTrackModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1070
		leftTrackModel[393].setRotationPoint(-50F, -3.6F, 20.5F);
		leftTrackModel[393].rotateAngleZ = -4.71238898F;

		leftTrackModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		leftTrackModel[394].setRotationPoint(-50F, -3.6F, 17.5F);
		leftTrackModel[394].rotateAngleZ = -4.71238898F;

		leftTrackModel[395].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1072
		leftTrackModel[395].setRotationPoint(-50F, -3.6F, 17.5F);
		leftTrackModel[395].rotateAngleZ = -4.71238898F;

		leftTrackModel[396].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1073
		leftTrackModel[396].setRotationPoint(-50F, -3.6F, 16.5F);
		leftTrackModel[396].rotateAngleZ = -4.71238898F;

		leftTrackModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1074
		leftTrackModel[397].setRotationPoint(-50F, -6.6F, 25.5F);
		leftTrackModel[397].rotateAngleZ = -5.21853446F;

		leftTrackModel[398].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1075
		leftTrackModel[398].setRotationPoint(-50F, -6.6F, 25.5F);
		leftTrackModel[398].rotateAngleZ = -5.21853446F;

		leftTrackModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		leftTrackModel[399].setRotationPoint(-50F, -6.6F, 23.5F);
		leftTrackModel[399].rotateAngleZ = -5.21853446F;

		leftTrackModel[400].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1077
		leftTrackModel[400].setRotationPoint(-50F, -6.6F, 21.5F);
		leftTrackModel[400].rotateAngleZ = -5.21853446F;

		leftTrackModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1078
		leftTrackModel[401].setRotationPoint(-50F, -6.6F, 20.5F);
		leftTrackModel[401].rotateAngleZ = -5.21853446F;

		leftTrackModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1079
		leftTrackModel[402].setRotationPoint(-50F, -6.6F, 17.5F);
		leftTrackModel[402].rotateAngleZ = -5.21853446F;

		leftTrackModel[403].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1080
		leftTrackModel[403].setRotationPoint(-50F, -6.6F, 17.5F);
		leftTrackModel[403].rotateAngleZ = -5.21853446F;

		leftTrackModel[404].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081
		leftTrackModel[404].setRotationPoint(-50F, -6.6F, 16.5F);
		leftTrackModel[404].rotateAngleZ = -5.21853446F;

		leftTrackModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1082
		leftTrackModel[405].setRotationPoint(-48.6F, -9.2F, 25.5F);
		leftTrackModel[405].rotateAngleZ = 0.2443461F;

		leftTrackModel[406].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1083
		leftTrackModel[406].setRotationPoint(-48.6F, -9.2F, 25.5F);
		leftTrackModel[406].rotateAngleZ = 0.2443461F;

		leftTrackModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		leftTrackModel[407].setRotationPoint(-48.6F, -9.2F, 23.5F);
		leftTrackModel[407].rotateAngleZ = 0.2443461F;

		leftTrackModel[408].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1085
		leftTrackModel[408].setRotationPoint(-48.6F, -9.2F, 21.5F);
		leftTrackModel[408].rotateAngleZ = 0.2443461F;

		leftTrackModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1086
		leftTrackModel[409].setRotationPoint(-48.6F, -9.2F, 20.5F);
		leftTrackModel[409].rotateAngleZ = 0.2443461F;

		leftTrackModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087
		leftTrackModel[410].setRotationPoint(-48.6F, -9.2F, 17.5F);
		leftTrackModel[410].rotateAngleZ = 0.2443461F;

		leftTrackModel[411].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		leftTrackModel[411].setRotationPoint(-48.6F, -9.2F, 17.5F);
		leftTrackModel[411].rotateAngleZ = 0.2443461F;

		leftTrackModel[412].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1089
		leftTrackModel[412].setRotationPoint(-48.6F, -9.2F, 16.5F);
		leftTrackModel[412].rotateAngleZ = 0.2443461F;

		leftTrackModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1090
		leftTrackModel[413].setRotationPoint(-46F, -10F, 25.5F);

		leftTrackModel[414].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1091
		leftTrackModel[414].setRotationPoint(-46F, -10F, 25.5F);

		leftTrackModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1092
		leftTrackModel[415].setRotationPoint(-46F, -10F, 23.5F);

		leftTrackModel[416].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1093
		leftTrackModel[416].setRotationPoint(-46F, -10F, 21.5F);

		leftTrackModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1094
		leftTrackModel[417].setRotationPoint(-46F, -10F, 20.5F);

		leftTrackModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1095
		leftTrackModel[418].setRotationPoint(-46F, -10F, 17.5F);

		leftTrackModel[419].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1096
		leftTrackModel[419].setRotationPoint(-46F, -10F, 17.5F);

		leftTrackModel[420].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1097
		leftTrackModel[420].setRotationPoint(-46F, -10F, 16.5F);

		leftTrackModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1098
		leftTrackModel[421].setRotationPoint(-43F, -10F, 25.5F);

		leftTrackModel[422].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1099
		leftTrackModel[422].setRotationPoint(-43F, -10F, 25.5F);

		leftTrackModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1100
		leftTrackModel[423].setRotationPoint(-43F, -10F, 23.5F);

		leftTrackModel[424].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1101
		leftTrackModel[424].setRotationPoint(-43F, -10F, 21.5F);

		leftTrackModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1102
		leftTrackModel[425].setRotationPoint(-43F, -10F, 20.5F);

		leftTrackModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1103
		leftTrackModel[426].setRotationPoint(-43F, -10F, 17.5F);

		leftTrackModel[427].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1104
		leftTrackModel[427].setRotationPoint(-43F, -10F, 17.5F);

		leftTrackModel[428].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1105
		leftTrackModel[428].setRotationPoint(-43F, -10F, 16.5F);

		leftTrackModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1106
		leftTrackModel[429].setRotationPoint(-40F, -10F, 25.5F);

		leftTrackModel[430].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1107
		leftTrackModel[430].setRotationPoint(-40F, -10F, 25.5F);

		leftTrackModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1108
		leftTrackModel[431].setRotationPoint(-40F, -10F, 23.5F);

		leftTrackModel[432].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1109
		leftTrackModel[432].setRotationPoint(-40F, -10F, 21.5F);

		leftTrackModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1110
		leftTrackModel[433].setRotationPoint(-40F, -10F, 20.5F);

		leftTrackModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1111
		leftTrackModel[434].setRotationPoint(-40F, -10F, 17.5F);

		leftTrackModel[435].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1112
		leftTrackModel[435].setRotationPoint(-40F, -10F, 17.5F);

		leftTrackModel[436].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1113
		leftTrackModel[436].setRotationPoint(-40F, -10F, 16.5F);

		leftTrackModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1114
		leftTrackModel[437].setRotationPoint(-37F, -10F, 25.5F);

		leftTrackModel[438].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1115
		leftTrackModel[438].setRotationPoint(-37F, -10F, 25.5F);

		leftTrackModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1116
		leftTrackModel[439].setRotationPoint(-37F, -10F, 23.5F);

		leftTrackModel[440].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1117
		leftTrackModel[440].setRotationPoint(-37F, -10F, 21.5F);

		leftTrackModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1118
		leftTrackModel[441].setRotationPoint(-37F, -10F, 20.5F);

		leftTrackModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1119
		leftTrackModel[442].setRotationPoint(-37F, -10F, 17.5F);

		leftTrackModel[443].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1120
		leftTrackModel[443].setRotationPoint(-37F, -10F, 17.5F);

		leftTrackModel[444].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1121
		leftTrackModel[444].setRotationPoint(-37F, -10F, 16.5F);

		leftTrackModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1122
		leftTrackModel[445].setRotationPoint(-34F, -10F, 25.5F);

		leftTrackModel[446].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1123
		leftTrackModel[446].setRotationPoint(-34F, -10F, 25.5F);

		leftTrackModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1124
		leftTrackModel[447].setRotationPoint(-34F, -10F, 23.5F);

		leftTrackModel[448].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1125
		leftTrackModel[448].setRotationPoint(-34F, -10F, 21.5F);

		leftTrackModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1126
		leftTrackModel[449].setRotationPoint(-34F, -10F, 20.5F);

		leftTrackModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1127
		leftTrackModel[450].setRotationPoint(-34F, -10F, 17.5F);

		leftTrackModel[451].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1128
		leftTrackModel[451].setRotationPoint(-34F, -10F, 17.5F);

		leftTrackModel[452].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1129
		leftTrackModel[452].setRotationPoint(-34F, -10F, 16.5F);

		leftTrackModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1130
		leftTrackModel[453].setRotationPoint(-31F, -10F, 25.5F);

		leftTrackModel[454].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1131
		leftTrackModel[454].setRotationPoint(-31F, -10F, 25.5F);

		leftTrackModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1132
		leftTrackModel[455].setRotationPoint(-31F, -10F, 23.5F);

		leftTrackModel[456].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1133
		leftTrackModel[456].setRotationPoint(-31F, -10F, 21.5F);

		leftTrackModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1134
		leftTrackModel[457].setRotationPoint(-31F, -10F, 20.5F);

		leftTrackModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1135
		leftTrackModel[458].setRotationPoint(-31F, -10F, 17.5F);

		leftTrackModel[459].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1136
		leftTrackModel[459].setRotationPoint(-31F, -10F, 17.5F);

		leftTrackModel[460].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1137
		leftTrackModel[460].setRotationPoint(-31F, -10F, 16.5F);

		leftTrackModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1138
		leftTrackModel[461].setRotationPoint(-28F, -10F, 25.5F);

		leftTrackModel[462].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1139
		leftTrackModel[462].setRotationPoint(-28F, -10F, 25.5F);

		leftTrackModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1140
		leftTrackModel[463].setRotationPoint(-28F, -10F, 23.5F);

		leftTrackModel[464].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1141
		leftTrackModel[464].setRotationPoint(-28F, -10F, 21.5F);

		leftTrackModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1142
		leftTrackModel[465].setRotationPoint(-28F, -10F, 20.5F);

		leftTrackModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1143
		leftTrackModel[466].setRotationPoint(-28F, -10F, 17.5F);

		leftTrackModel[467].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1144
		leftTrackModel[467].setRotationPoint(-28F, -10F, 17.5F);

		leftTrackModel[468].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1145
		leftTrackModel[468].setRotationPoint(-28F, -10F, 16.5F);

		leftTrackModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1146
		leftTrackModel[469].setRotationPoint(-25F, -10F, 25.5F);

		leftTrackModel[470].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1147
		leftTrackModel[470].setRotationPoint(-25F, -10F, 25.5F);

		leftTrackModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1148
		leftTrackModel[471].setRotationPoint(-25F, -10F, 23.5F);

		leftTrackModel[472].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1149
		leftTrackModel[472].setRotationPoint(-25F, -10F, 21.5F);

		leftTrackModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1150
		leftTrackModel[473].setRotationPoint(-25F, -10F, 20.5F);

		leftTrackModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1151
		leftTrackModel[474].setRotationPoint(-25F, -10F, 17.5F);

		leftTrackModel[475].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1152
		leftTrackModel[475].setRotationPoint(-25F, -10F, 17.5F);

		leftTrackModel[476].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1153
		leftTrackModel[476].setRotationPoint(-25F, -10F, 16.5F);

		leftTrackModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1154
		leftTrackModel[477].setRotationPoint(-22F, -10F, 25.5F);

		leftTrackModel[478].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1155
		leftTrackModel[478].setRotationPoint(-22F, -10F, 25.5F);

		leftTrackModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1156
		leftTrackModel[479].setRotationPoint(-22F, -10F, 23.5F);

		leftTrackModel[480].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1157
		leftTrackModel[480].setRotationPoint(-22F, -10F, 21.5F);

		leftTrackModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1158
		leftTrackModel[481].setRotationPoint(-22F, -10F, 20.5F);

		leftTrackModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1159
		leftTrackModel[482].setRotationPoint(-22F, -10F, 17.5F);

		leftTrackModel[483].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1160
		leftTrackModel[483].setRotationPoint(-22F, -10F, 17.5F);

		leftTrackModel[484].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1161
		leftTrackModel[484].setRotationPoint(-22F, -10F, 16.5F);

		leftTrackModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1162
		leftTrackModel[485].setRotationPoint(-19F, -10F, 25.5F);

		leftTrackModel[486].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1163
		leftTrackModel[486].setRotationPoint(-19F, -10F, 25.5F);

		leftTrackModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1164
		leftTrackModel[487].setRotationPoint(-19F, -10F, 23.5F);

		leftTrackModel[488].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1165
		leftTrackModel[488].setRotationPoint(-19F, -10F, 21.5F);

		leftTrackModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1166
		leftTrackModel[489].setRotationPoint(-19F, -10F, 20.5F);

		leftTrackModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1167
		leftTrackModel[490].setRotationPoint(-19F, -10F, 17.5F);

		leftTrackModel[491].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1168
		leftTrackModel[491].setRotationPoint(-19F, -10F, 17.5F);

		leftTrackModel[492].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1169
		leftTrackModel[492].setRotationPoint(-19F, -10F, 16.5F);

		leftTrackModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1170
		leftTrackModel[493].setRotationPoint(-16F, -10F, 25.5F);

		leftTrackModel[494].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1171
		leftTrackModel[494].setRotationPoint(-16F, -10F, 25.5F);

		leftTrackModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1172
		leftTrackModel[495].setRotationPoint(-16F, -10F, 23.5F);

		leftTrackModel[496].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1173
		leftTrackModel[496].setRotationPoint(-16F, -10F, 21.5F);

		leftTrackModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1174
		leftTrackModel[497].setRotationPoint(-16F, -10F, 20.5F);

		leftTrackModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1175
		leftTrackModel[498].setRotationPoint(-16F, -10F, 17.5F);

		leftTrackModel[499].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1176
		leftTrackModel[499].setRotationPoint(-16F, -10F, 17.5F);
	}

	private void initleftTrackModel_2()
	{
		leftTrackModel[500] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1177
		leftTrackModel[501] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1178
		leftTrackModel[502] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1179
		leftTrackModel[503] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1180
		leftTrackModel[504] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1181
		leftTrackModel[505] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1182
		leftTrackModel[506] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1183
		leftTrackModel[507] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1184
		leftTrackModel[508] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1185
		leftTrackModel[509] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1186
		leftTrackModel[510] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1187
		leftTrackModel[511] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1188
		leftTrackModel[512] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1189
		leftTrackModel[513] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1190
		leftTrackModel[514] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1191
		leftTrackModel[515] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1192
		leftTrackModel[516] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1193
		leftTrackModel[517] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1194
		leftTrackModel[518] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1195
		leftTrackModel[519] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1196
		leftTrackModel[520] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1197
		leftTrackModel[521] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1198
		leftTrackModel[522] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1199
		leftTrackModel[523] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1200
		leftTrackModel[524] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1201
		leftTrackModel[525] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1202
		leftTrackModel[526] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1203
		leftTrackModel[527] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1204
		leftTrackModel[528] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1205
		leftTrackModel[529] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1206
		leftTrackModel[530] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1207
		leftTrackModel[531] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1208
		leftTrackModel[532] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1209
		leftTrackModel[533] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1210
		leftTrackModel[534] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1211
		leftTrackModel[535] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1212
		leftTrackModel[536] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1213
		leftTrackModel[537] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1214
		leftTrackModel[538] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1215
		leftTrackModel[539] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1216
		leftTrackModel[540] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1217
		leftTrackModel[541] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1218
		leftTrackModel[542] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1219
		leftTrackModel[543] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1220
		leftTrackModel[544] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1221
		leftTrackModel[545] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1222
		leftTrackModel[546] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1223
		leftTrackModel[547] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1224
		leftTrackModel[548] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1225
		leftTrackModel[549] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1226
		leftTrackModel[550] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1227
		leftTrackModel[551] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1228
		leftTrackModel[552] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1229
		leftTrackModel[553] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1230
		leftTrackModel[554] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1231
		leftTrackModel[555] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1232
		leftTrackModel[556] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1233
		leftTrackModel[557] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1234
		leftTrackModel[558] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1235
		leftTrackModel[559] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1236
		leftTrackModel[560] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1237
		leftTrackModel[561] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1238
		leftTrackModel[562] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1239
		leftTrackModel[563] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1240
		leftTrackModel[564] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1241
		leftTrackModel[565] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1242
		leftTrackModel[566] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1243
		leftTrackModel[567] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1244
		leftTrackModel[568] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1245
		leftTrackModel[569] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1246
		leftTrackModel[570] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1247
		leftTrackModel[571] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1248
		leftTrackModel[572] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1249
		leftTrackModel[573] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1250
		leftTrackModel[574] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1251
		leftTrackModel[575] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1252
		leftTrackModel[576] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1253
		leftTrackModel[577] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1254
		leftTrackModel[578] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1255
		leftTrackModel[579] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1256
		leftTrackModel[580] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1257
		leftTrackModel[581] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1258
		leftTrackModel[582] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1259
		leftTrackModel[583] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1260
		leftTrackModel[584] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1261
		leftTrackModel[585] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1262
		leftTrackModel[586] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1263
		leftTrackModel[587] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1264
		leftTrackModel[588] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1265
		leftTrackModel[589] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1266
		leftTrackModel[590] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1267
		leftTrackModel[591] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1268
		leftTrackModel[592] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1269
		leftTrackModel[593] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1270
		leftTrackModel[594] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1271
		leftTrackModel[595] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1272
		leftTrackModel[596] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1273
		leftTrackModel[597] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1274
		leftTrackModel[598] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1275
		leftTrackModel[599] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1276
		leftTrackModel[600] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1277
		leftTrackModel[601] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1278
		leftTrackModel[602] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1279
		leftTrackModel[603] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1280
		leftTrackModel[604] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1281
		leftTrackModel[605] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1282
		leftTrackModel[606] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1283
		leftTrackModel[607] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1284
		leftTrackModel[608] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1285
		leftTrackModel[609] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1286
		leftTrackModel[610] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1287
		leftTrackModel[611] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1288
		leftTrackModel[612] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1289
		leftTrackModel[613] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1290
		leftTrackModel[614] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1291
		leftTrackModel[615] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1292
		leftTrackModel[616] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1293
		leftTrackModel[617] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1294
		leftTrackModel[618] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1295
		leftTrackModel[619] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1296
		leftTrackModel[620] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1297
		leftTrackModel[621] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1298
		leftTrackModel[622] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1299
		leftTrackModel[623] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1300
		leftTrackModel[624] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1301
		leftTrackModel[625] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1302
		leftTrackModel[626] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1303
		leftTrackModel[627] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1304
		leftTrackModel[628] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1305
		leftTrackModel[629] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1306
		leftTrackModel[630] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1307
		leftTrackModel[631] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1308
		leftTrackModel[632] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1309
		leftTrackModel[633] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1310
		leftTrackModel[634] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1311
		leftTrackModel[635] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1312
		leftTrackModel[636] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1313
		leftTrackModel[637] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1314
		leftTrackModel[638] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1315
		leftTrackModel[639] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1316
		leftTrackModel[640] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1317
		leftTrackModel[641] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1318
		leftTrackModel[642] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1319
		leftTrackModel[643] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1320
		leftTrackModel[644] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1321
		leftTrackModel[645] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1322
		leftTrackModel[646] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1323
		leftTrackModel[647] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1324
		leftTrackModel[648] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1325
		leftTrackModel[649] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1326
		leftTrackModel[650] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1327
		leftTrackModel[651] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1328
		leftTrackModel[652] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1329
		leftTrackModel[653] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1330
		leftTrackModel[654] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1331
		leftTrackModel[655] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1332
		leftTrackModel[656] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 1333
		leftTrackModel[657] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 1334
		leftTrackModel[658] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1335
		leftTrackModel[659] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 1336
		leftTrackModel[660] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 1337

		leftTrackModel[500].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1177
		leftTrackModel[500].setRotationPoint(-16F, -10F, 16.5F);

		leftTrackModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1178
		leftTrackModel[501].setRotationPoint(-13F, -10F, 25.5F);

		leftTrackModel[502].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1179
		leftTrackModel[502].setRotationPoint(-13F, -10F, 25.5F);

		leftTrackModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1180
		leftTrackModel[503].setRotationPoint(-13F, -10F, 23.5F);

		leftTrackModel[504].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1181
		leftTrackModel[504].setRotationPoint(-13F, -10F, 21.5F);

		leftTrackModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1182
		leftTrackModel[505].setRotationPoint(-13F, -10F, 20.5F);

		leftTrackModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1183
		leftTrackModel[506].setRotationPoint(-13F, -10F, 17.5F);

		leftTrackModel[507].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1184
		leftTrackModel[507].setRotationPoint(-13F, -10F, 17.5F);

		leftTrackModel[508].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1185
		leftTrackModel[508].setRotationPoint(-13F, -10F, 16.5F);

		leftTrackModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1186
		leftTrackModel[509].setRotationPoint(-10F, -10F, 25.5F);

		leftTrackModel[510].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1187
		leftTrackModel[510].setRotationPoint(-10F, -10F, 25.5F);

		leftTrackModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1188
		leftTrackModel[511].setRotationPoint(-10F, -10F, 23.5F);

		leftTrackModel[512].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1189
		leftTrackModel[512].setRotationPoint(-10F, -10F, 21.5F);

		leftTrackModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1190
		leftTrackModel[513].setRotationPoint(-10F, -10F, 20.5F);

		leftTrackModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1191
		leftTrackModel[514].setRotationPoint(-10F, -10F, 17.5F);

		leftTrackModel[515].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1192
		leftTrackModel[515].setRotationPoint(-10F, -10F, 17.5F);

		leftTrackModel[516].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1193
		leftTrackModel[516].setRotationPoint(-10F, -10F, 16.5F);

		leftTrackModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1194
		leftTrackModel[517].setRotationPoint(-7F, -10F, 25.5F);

		leftTrackModel[518].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1195
		leftTrackModel[518].setRotationPoint(-7F, -10F, 25.5F);

		leftTrackModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1196
		leftTrackModel[519].setRotationPoint(-7F, -10F, 23.5F);

		leftTrackModel[520].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1197
		leftTrackModel[520].setRotationPoint(-7F, -10F, 21.5F);

		leftTrackModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1198
		leftTrackModel[521].setRotationPoint(-7F, -10F, 20.5F);

		leftTrackModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1199
		leftTrackModel[522].setRotationPoint(-7F, -10F, 17.5F);

		leftTrackModel[523].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1200
		leftTrackModel[523].setRotationPoint(-7F, -10F, 17.5F);

		leftTrackModel[524].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1201
		leftTrackModel[524].setRotationPoint(-7F, -10F, 16.5F);

		leftTrackModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1202
		leftTrackModel[525].setRotationPoint(-4F, -10F, 25.5F);

		leftTrackModel[526].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1203
		leftTrackModel[526].setRotationPoint(-4F, -10F, 25.5F);

		leftTrackModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1204
		leftTrackModel[527].setRotationPoint(-4F, -10F, 23.5F);

		leftTrackModel[528].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1205
		leftTrackModel[528].setRotationPoint(-4F, -10F, 21.5F);

		leftTrackModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1206
		leftTrackModel[529].setRotationPoint(-4F, -10F, 20.5F);

		leftTrackModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1207
		leftTrackModel[530].setRotationPoint(-4F, -10F, 17.5F);

		leftTrackModel[531].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1208
		leftTrackModel[531].setRotationPoint(-4F, -10F, 17.5F);

		leftTrackModel[532].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1209
		leftTrackModel[532].setRotationPoint(-4F, -10F, 16.5F);

		leftTrackModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1210
		leftTrackModel[533].setRotationPoint(-1F, -10F, 25.5F);

		leftTrackModel[534].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1211
		leftTrackModel[534].setRotationPoint(-1F, -10F, 25.5F);

		leftTrackModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1212
		leftTrackModel[535].setRotationPoint(-1F, -10F, 23.5F);

		leftTrackModel[536].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1213
		leftTrackModel[536].setRotationPoint(-1F, -10F, 21.5F);

		leftTrackModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1214
		leftTrackModel[537].setRotationPoint(-1F, -10F, 20.5F);

		leftTrackModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1215
		leftTrackModel[538].setRotationPoint(-1F, -10F, 17.5F);

		leftTrackModel[539].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1216
		leftTrackModel[539].setRotationPoint(-1F, -10F, 17.5F);

		leftTrackModel[540].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1217
		leftTrackModel[540].setRotationPoint(-1F, -10F, 16.5F);

		leftTrackModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1218
		leftTrackModel[541].setRotationPoint(2F, -10F, 25.5F);

		leftTrackModel[542].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1219
		leftTrackModel[542].setRotationPoint(2F, -10F, 25.5F);

		leftTrackModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1220
		leftTrackModel[543].setRotationPoint(2F, -10F, 23.5F);

		leftTrackModel[544].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1221
		leftTrackModel[544].setRotationPoint(2F, -10F, 21.5F);

		leftTrackModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1222
		leftTrackModel[545].setRotationPoint(2F, -10F, 20.5F);

		leftTrackModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1223
		leftTrackModel[546].setRotationPoint(2F, -10F, 17.5F);

		leftTrackModel[547].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1224
		leftTrackModel[547].setRotationPoint(2F, -10F, 17.5F);

		leftTrackModel[548].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1225
		leftTrackModel[548].setRotationPoint(2F, -10F, 16.5F);

		leftTrackModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1226
		leftTrackModel[549].setRotationPoint(5F, -10F, 25.5F);

		leftTrackModel[550].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1227
		leftTrackModel[550].setRotationPoint(5F, -10F, 25.5F);

		leftTrackModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1228
		leftTrackModel[551].setRotationPoint(5F, -10F, 23.5F);

		leftTrackModel[552].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1229
		leftTrackModel[552].setRotationPoint(5F, -10F, 21.5F);

		leftTrackModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1230
		leftTrackModel[553].setRotationPoint(5F, -10F, 20.5F);

		leftTrackModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1231
		leftTrackModel[554].setRotationPoint(5F, -10F, 17.5F);

		leftTrackModel[555].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1232
		leftTrackModel[555].setRotationPoint(5F, -10F, 17.5F);

		leftTrackModel[556].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1233
		leftTrackModel[556].setRotationPoint(5F, -10F, 16.5F);

		leftTrackModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1234
		leftTrackModel[557].setRotationPoint(8F, -10F, 25.5F);

		leftTrackModel[558].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1235
		leftTrackModel[558].setRotationPoint(8F, -10F, 25.5F);

		leftTrackModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1236
		leftTrackModel[559].setRotationPoint(8F, -10F, 23.5F);

		leftTrackModel[560].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1237
		leftTrackModel[560].setRotationPoint(8F, -10F, 21.5F);

		leftTrackModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1238
		leftTrackModel[561].setRotationPoint(8F, -10F, 20.5F);

		leftTrackModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1239
		leftTrackModel[562].setRotationPoint(8F, -10F, 17.5F);

		leftTrackModel[563].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1240
		leftTrackModel[563].setRotationPoint(8F, -10F, 17.5F);

		leftTrackModel[564].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1241
		leftTrackModel[564].setRotationPoint(8F, -10F, 16.5F);

		leftTrackModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1242
		leftTrackModel[565].setRotationPoint(11F, -10F, 25.5F);

		leftTrackModel[566].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1243
		leftTrackModel[566].setRotationPoint(11F, -10F, 25.5F);

		leftTrackModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1244
		leftTrackModel[567].setRotationPoint(11F, -10F, 23.5F);

		leftTrackModel[568].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1245
		leftTrackModel[568].setRotationPoint(11F, -10F, 21.5F);

		leftTrackModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1246
		leftTrackModel[569].setRotationPoint(11F, -10F, 20.5F);

		leftTrackModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1247
		leftTrackModel[570].setRotationPoint(11F, -10F, 17.5F);

		leftTrackModel[571].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1248
		leftTrackModel[571].setRotationPoint(11F, -10F, 17.5F);

		leftTrackModel[572].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1249
		leftTrackModel[572].setRotationPoint(11F, -10F, 16.5F);

		leftTrackModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1250
		leftTrackModel[573].setRotationPoint(14F, -10F, 25.5F);

		leftTrackModel[574].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1251
		leftTrackModel[574].setRotationPoint(14F, -10F, 25.5F);

		leftTrackModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1252
		leftTrackModel[575].setRotationPoint(14F, -10F, 23.5F);

		leftTrackModel[576].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1253
		leftTrackModel[576].setRotationPoint(14F, -10F, 21.5F);

		leftTrackModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1254
		leftTrackModel[577].setRotationPoint(14F, -10F, 20.5F);

		leftTrackModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1255
		leftTrackModel[578].setRotationPoint(14F, -10F, 17.5F);

		leftTrackModel[579].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1256
		leftTrackModel[579].setRotationPoint(14F, -10F, 17.5F);

		leftTrackModel[580].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1257
		leftTrackModel[580].setRotationPoint(14F, -10F, 16.5F);

		leftTrackModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1258
		leftTrackModel[581].setRotationPoint(17F, -10F, 25.5F);

		leftTrackModel[582].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1259
		leftTrackModel[582].setRotationPoint(17F, -10F, 25.5F);

		leftTrackModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1260
		leftTrackModel[583].setRotationPoint(17F, -10F, 23.5F);

		leftTrackModel[584].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1261
		leftTrackModel[584].setRotationPoint(17F, -10F, 21.5F);

		leftTrackModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1262
		leftTrackModel[585].setRotationPoint(17F, -10F, 20.5F);

		leftTrackModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1263
		leftTrackModel[586].setRotationPoint(17F, -10F, 17.5F);

		leftTrackModel[587].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1264
		leftTrackModel[587].setRotationPoint(17F, -10F, 17.5F);

		leftTrackModel[588].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1265
		leftTrackModel[588].setRotationPoint(17F, -10F, 16.5F);

		leftTrackModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1266
		leftTrackModel[589].setRotationPoint(20F, -10F, 25.5F);

		leftTrackModel[590].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1267
		leftTrackModel[590].setRotationPoint(20F, -10F, 25.5F);

		leftTrackModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1268
		leftTrackModel[591].setRotationPoint(20F, -10F, 23.5F);

		leftTrackModel[592].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1269
		leftTrackModel[592].setRotationPoint(20F, -10F, 21.5F);

		leftTrackModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1270
		leftTrackModel[593].setRotationPoint(20F, -10F, 20.5F);

		leftTrackModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1271
		leftTrackModel[594].setRotationPoint(20F, -10F, 17.5F);

		leftTrackModel[595].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1272
		leftTrackModel[595].setRotationPoint(20F, -10F, 17.5F);

		leftTrackModel[596].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1273
		leftTrackModel[596].setRotationPoint(20F, -10F, 16.5F);

		leftTrackModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1274
		leftTrackModel[597].setRotationPoint(23F, -10F, 25.5F);

		leftTrackModel[598].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1275
		leftTrackModel[598].setRotationPoint(23F, -10F, 25.5F);

		leftTrackModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1276
		leftTrackModel[599].setRotationPoint(23F, -10F, 23.5F);

		leftTrackModel[600].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1277
		leftTrackModel[600].setRotationPoint(23F, -10F, 21.5F);

		leftTrackModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1278
		leftTrackModel[601].setRotationPoint(23F, -10F, 20.5F);

		leftTrackModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1279
		leftTrackModel[602].setRotationPoint(23F, -10F, 17.5F);

		leftTrackModel[603].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1280
		leftTrackModel[603].setRotationPoint(23F, -10F, 17.5F);

		leftTrackModel[604].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1281
		leftTrackModel[604].setRotationPoint(23F, -10F, 16.5F);

		leftTrackModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1282
		leftTrackModel[605].setRotationPoint(26F, -10F, 25.5F);

		leftTrackModel[606].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1283
		leftTrackModel[606].setRotationPoint(26F, -10F, 25.5F);

		leftTrackModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1284
		leftTrackModel[607].setRotationPoint(26F, -10F, 23.5F);

		leftTrackModel[608].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1285
		leftTrackModel[608].setRotationPoint(26F, -10F, 21.5F);

		leftTrackModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1286
		leftTrackModel[609].setRotationPoint(26F, -10F, 20.5F);

		leftTrackModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1287
		leftTrackModel[610].setRotationPoint(26F, -10F, 17.5F);

		leftTrackModel[611].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1288
		leftTrackModel[611].setRotationPoint(26F, -10F, 17.5F);

		leftTrackModel[612].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1289
		leftTrackModel[612].setRotationPoint(26F, -10F, 16.5F);

		leftTrackModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1290
		leftTrackModel[613].setRotationPoint(29F, -10F, 25.5F);

		leftTrackModel[614].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1291
		leftTrackModel[614].setRotationPoint(29F, -10F, 25.5F);

		leftTrackModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1292
		leftTrackModel[615].setRotationPoint(29F, -10F, 23.5F);

		leftTrackModel[616].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1293
		leftTrackModel[616].setRotationPoint(29F, -10F, 21.5F);

		leftTrackModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1294
		leftTrackModel[617].setRotationPoint(29F, -10F, 20.5F);

		leftTrackModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1295
		leftTrackModel[618].setRotationPoint(29F, -10F, 17.5F);

		leftTrackModel[619].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		leftTrackModel[619].setRotationPoint(29F, -10F, 17.5F);

		leftTrackModel[620].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1297
		leftTrackModel[620].setRotationPoint(29F, -10F, 16.5F);

		leftTrackModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1298
		leftTrackModel[621].setRotationPoint(32F, -10F, 25.5F);

		leftTrackModel[622].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1299
		leftTrackModel[622].setRotationPoint(32F, -10F, 25.5F);

		leftTrackModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1300
		leftTrackModel[623].setRotationPoint(32F, -10F, 23.5F);

		leftTrackModel[624].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1301
		leftTrackModel[624].setRotationPoint(32F, -10F, 21.5F);

		leftTrackModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1302
		leftTrackModel[625].setRotationPoint(32F, -10F, 20.5F);

		leftTrackModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1303
		leftTrackModel[626].setRotationPoint(32F, -10F, 17.5F);

		leftTrackModel[627].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1304
		leftTrackModel[627].setRotationPoint(32F, -10F, 17.5F);

		leftTrackModel[628].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1305
		leftTrackModel[628].setRotationPoint(32F, -10F, 16.5F);

		leftTrackModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1306
		leftTrackModel[629].setRotationPoint(35F, -10F, 25.5F);

		leftTrackModel[630].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1307
		leftTrackModel[630].setRotationPoint(35F, -10F, 25.5F);

		leftTrackModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1308
		leftTrackModel[631].setRotationPoint(35F, -10F, 23.5F);

		leftTrackModel[632].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1309
		leftTrackModel[632].setRotationPoint(35F, -10F, 21.5F);

		leftTrackModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1310
		leftTrackModel[633].setRotationPoint(35F, -10F, 20.5F);

		leftTrackModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1311
		leftTrackModel[634].setRotationPoint(35F, -10F, 17.5F);

		leftTrackModel[635].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1312
		leftTrackModel[635].setRotationPoint(35F, -10F, 17.5F);

		leftTrackModel[636].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1313
		leftTrackModel[636].setRotationPoint(35F, -10F, 16.5F);

		leftTrackModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1314
		leftTrackModel[637].setRotationPoint(38F, -10F, 25.5F);

		leftTrackModel[638].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1315
		leftTrackModel[638].setRotationPoint(38F, -10F, 25.5F);

		leftTrackModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1316
		leftTrackModel[639].setRotationPoint(38F, -10F, 23.5F);

		leftTrackModel[640].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1317
		leftTrackModel[640].setRotationPoint(38F, -10F, 21.5F);

		leftTrackModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1318
		leftTrackModel[641].setRotationPoint(38F, -10F, 20.5F);

		leftTrackModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1319
		leftTrackModel[642].setRotationPoint(38F, -10F, 17.5F);

		leftTrackModel[643].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1320
		leftTrackModel[643].setRotationPoint(38F, -10F, 17.5F);

		leftTrackModel[644].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1321
		leftTrackModel[644].setRotationPoint(38F, -10F, 16.5F);

		leftTrackModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1322
		leftTrackModel[645].setRotationPoint(41F, -10F, 25.5F);

		leftTrackModel[646].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1323
		leftTrackModel[646].setRotationPoint(41F, -10F, 25.5F);

		leftTrackModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1324
		leftTrackModel[647].setRotationPoint(41F, -10F, 23.5F);

		leftTrackModel[648].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1325
		leftTrackModel[648].setRotationPoint(41F, -10F, 21.5F);

		leftTrackModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1326
		leftTrackModel[649].setRotationPoint(41F, -10F, 20.5F);

		leftTrackModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1327
		leftTrackModel[650].setRotationPoint(41F, -10F, 17.5F);

		leftTrackModel[651].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1328
		leftTrackModel[651].setRotationPoint(41F, -10F, 17.5F);

		leftTrackModel[652].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1329
		leftTrackModel[652].setRotationPoint(41F, -10F, 16.5F);

		leftTrackModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1330
		leftTrackModel[653].setRotationPoint(44F, -10F, 25.5F);

		leftTrackModel[654].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1331
		leftTrackModel[654].setRotationPoint(45F, -10F, 25.5F);

		leftTrackModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1332
		leftTrackModel[655].setRotationPoint(44F, -10F, 23.5F);

		leftTrackModel[656].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1333
		leftTrackModel[656].setRotationPoint(45F, -10F, 21.5F);

		leftTrackModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1334
		leftTrackModel[657].setRotationPoint(44F, -10F, 20.5F);

		leftTrackModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 1335
		leftTrackModel[658].setRotationPoint(44F, -10F, 17.5F);

		leftTrackModel[659].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1336
		leftTrackModel[659].setRotationPoint(45F, -10F, 17.5F);

		leftTrackModel[660].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1337
		leftTrackModel[660].setRotationPoint(45F, -10F, 16.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box502
		rightTrackModel[1] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box503
		rightTrackModel[2] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box504
		rightTrackModel[3] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box505
		rightTrackModel[4] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box506
		rightTrackModel[5] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box507
		rightTrackModel[6] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box508
		rightTrackModel[7] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box509
		rightTrackModel[8] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box510
		rightTrackModel[9] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box511
		rightTrackModel[10] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box512
		rightTrackModel[11] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box513
		rightTrackModel[12] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box514
		rightTrackModel[13] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box515
		rightTrackModel[14] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box516
		rightTrackModel[15] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box517
		rightTrackModel[16] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box518
		rightTrackModel[17] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box519
		rightTrackModel[18] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box520
		rightTrackModel[19] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box521
		rightTrackModel[20] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box522
		rightTrackModel[21] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box523
		rightTrackModel[22] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box524
		rightTrackModel[23] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box525
		rightTrackModel[24] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box526
		rightTrackModel[25] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box527
		rightTrackModel[26] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box528
		rightTrackModel[27] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box529
		rightTrackModel[28] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box530
		rightTrackModel[29] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box531
		rightTrackModel[30] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box532
		rightTrackModel[31] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box533
		rightTrackModel[32] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box534
		rightTrackModel[33] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box535
		rightTrackModel[34] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box536
		rightTrackModel[35] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box537
		rightTrackModel[36] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box538
		rightTrackModel[37] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box539
		rightTrackModel[38] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box540
		rightTrackModel[39] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box541
		rightTrackModel[40] = new ModelRendererTurbo(this, 1000, 0, textureX, textureY); // Import Box542
		rightTrackModel[41] = new ModelRendererTurbo(this, 1000, 20, textureX, textureY); // Import Box543
		rightTrackModel[42] = new ModelRendererTurbo(this, 1000, 40, textureX, textureY); // Import Box544
		rightTrackModel[43] = new ModelRendererTurbo(this, 1000, 60, textureX, textureY); // Import Box545
		rightTrackModel[44] = new ModelRendererTurbo(this, 1000, 80, textureX, textureY); // Import Box546
		rightTrackModel[45] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 0
		rightTrackModel[46] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 1
		rightTrackModel[47] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 47
		rightTrackModel[48] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 48
		rightTrackModel[49] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 49
		rightTrackModel[50] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 50
		rightTrackModel[51] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 51
		rightTrackModel[52] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 52
		rightTrackModel[53] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 61
		rightTrackModel[54] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 62
		rightTrackModel[55] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 63
		rightTrackModel[56] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 64
		rightTrackModel[57] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 65
		rightTrackModel[58] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 66
		rightTrackModel[59] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 67
		rightTrackModel[60] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 68
		rightTrackModel[61] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 77
		rightTrackModel[62] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 78
		rightTrackModel[63] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 79
		rightTrackModel[64] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 80
		rightTrackModel[65] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 81
		rightTrackModel[66] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 82
		rightTrackModel[67] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 83
		rightTrackModel[68] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 84
		rightTrackModel[69] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 85
		rightTrackModel[70] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 86
		rightTrackModel[71] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 87
		rightTrackModel[72] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 88
		rightTrackModel[73] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 89
		rightTrackModel[74] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 90
		rightTrackModel[75] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 91
		rightTrackModel[76] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 92
		rightTrackModel[77] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 93
		rightTrackModel[78] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 94
		rightTrackModel[79] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 95
		rightTrackModel[80] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 96
		rightTrackModel[81] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 97
		rightTrackModel[82] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 98
		rightTrackModel[83] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 99
		rightTrackModel[84] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 100
		rightTrackModel[85] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 101
		rightTrackModel[86] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 102
		rightTrackModel[87] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 103
		rightTrackModel[88] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 104
		rightTrackModel[89] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 105
		rightTrackModel[90] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 106
		rightTrackModel[91] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 107
		rightTrackModel[92] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 108
		rightTrackModel[93] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 109
		rightTrackModel[94] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 110
		rightTrackModel[95] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 111
		rightTrackModel[96] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 112
		rightTrackModel[97] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 113
		rightTrackModel[98] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 114
		rightTrackModel[99] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 115
		rightTrackModel[100] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 116
		rightTrackModel[101] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 117
		rightTrackModel[102] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 118
		rightTrackModel[103] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 119
		rightTrackModel[104] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 120
		rightTrackModel[105] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 121
		rightTrackModel[106] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 122
		rightTrackModel[107] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 123
		rightTrackModel[108] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 124
		rightTrackModel[109] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 125
		rightTrackModel[110] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 126
		rightTrackModel[111] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 127
		rightTrackModel[112] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 128
		rightTrackModel[113] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 129
		rightTrackModel[114] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 130
		rightTrackModel[115] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 131
		rightTrackModel[116] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 132
		rightTrackModel[117] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 133
		rightTrackModel[118] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 134
		rightTrackModel[119] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 135
		rightTrackModel[120] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 136
		rightTrackModel[121] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 137
		rightTrackModel[122] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 138
		rightTrackModel[123] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 139
		rightTrackModel[124] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 140
		rightTrackModel[125] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 141
		rightTrackModel[126] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 142
		rightTrackModel[127] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 143
		rightTrackModel[128] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 144
		rightTrackModel[129] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 145
		rightTrackModel[130] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 146
		rightTrackModel[131] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 147
		rightTrackModel[132] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 148
		rightTrackModel[133] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 149
		rightTrackModel[134] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 150
		rightTrackModel[135] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 151
		rightTrackModel[136] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 152
		rightTrackModel[137] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 153
		rightTrackModel[138] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 154
		rightTrackModel[139] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 155
		rightTrackModel[140] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 156
		rightTrackModel[141] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 157
		rightTrackModel[142] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 158
		rightTrackModel[143] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 159
		rightTrackModel[144] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 160
		rightTrackModel[145] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 161
		rightTrackModel[146] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 162
		rightTrackModel[147] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 163
		rightTrackModel[148] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 164
		rightTrackModel[149] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 165
		rightTrackModel[150] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 166
		rightTrackModel[151] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 167
		rightTrackModel[152] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 168
		rightTrackModel[153] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 169
		rightTrackModel[154] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 170
		rightTrackModel[155] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 171
		rightTrackModel[156] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 172
		rightTrackModel[157] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 173
		rightTrackModel[158] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 174
		rightTrackModel[159] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 175
		rightTrackModel[160] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 176
		rightTrackModel[161] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 177
		rightTrackModel[162] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 178
		rightTrackModel[163] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 179
		rightTrackModel[164] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 180
		rightTrackModel[165] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 181
		rightTrackModel[166] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 182
		rightTrackModel[167] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 183
		rightTrackModel[168] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 184
		rightTrackModel[169] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 185
		rightTrackModel[170] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 186
		rightTrackModel[171] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 187
		rightTrackModel[172] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 188
		rightTrackModel[173] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 189
		rightTrackModel[174] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 190
		rightTrackModel[175] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 191
		rightTrackModel[176] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 192
		rightTrackModel[177] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 193
		rightTrackModel[178] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 194
		rightTrackModel[179] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 195
		rightTrackModel[180] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 196
		rightTrackModel[181] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 197
		rightTrackModel[182] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 198
		rightTrackModel[183] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 199
		rightTrackModel[184] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 200
		rightTrackModel[185] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 201
		rightTrackModel[186] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 202
		rightTrackModel[187] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 203
		rightTrackModel[188] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 204
		rightTrackModel[189] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 205
		rightTrackModel[190] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 206
		rightTrackModel[191] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 207
		rightTrackModel[192] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 208
		rightTrackModel[193] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 209
		rightTrackModel[194] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 210
		rightTrackModel[195] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 211
		rightTrackModel[196] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 212
		rightTrackModel[197] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 213
		rightTrackModel[198] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 214
		rightTrackModel[199] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 215
		rightTrackModel[200] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 216
		rightTrackModel[201] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 217
		rightTrackModel[202] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 218
		rightTrackModel[203] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 219
		rightTrackModel[204] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 220
		rightTrackModel[205] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 221
		rightTrackModel[206] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 222
		rightTrackModel[207] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 223
		rightTrackModel[208] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 224
		rightTrackModel[209] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 225
		rightTrackModel[210] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 226
		rightTrackModel[211] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 227
		rightTrackModel[212] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 228
		rightTrackModel[213] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 229
		rightTrackModel[214] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 230
		rightTrackModel[215] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 231
		rightTrackModel[216] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 232
		rightTrackModel[217] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 233
		rightTrackModel[218] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 234
		rightTrackModel[219] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 235
		rightTrackModel[220] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 236
		rightTrackModel[221] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 237
		rightTrackModel[222] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 238
		rightTrackModel[223] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 239
		rightTrackModel[224] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 240
		rightTrackModel[225] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 241
		rightTrackModel[226] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 242
		rightTrackModel[227] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 243
		rightTrackModel[228] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 244
		rightTrackModel[229] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 245
		rightTrackModel[230] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 246
		rightTrackModel[231] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 247
		rightTrackModel[232] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 248
		rightTrackModel[233] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 249
		rightTrackModel[234] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 250
		rightTrackModel[235] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 251
		rightTrackModel[236] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 252
		rightTrackModel[237] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 253
		rightTrackModel[238] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 254
		rightTrackModel[239] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 255
		rightTrackModel[240] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 256
		rightTrackModel[241] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 257
		rightTrackModel[242] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 258
		rightTrackModel[243] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 259
		rightTrackModel[244] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 260
		rightTrackModel[245] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 261
		rightTrackModel[246] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 262
		rightTrackModel[247] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 263
		rightTrackModel[248] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 264
		rightTrackModel[249] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 265
		rightTrackModel[250] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 266
		rightTrackModel[251] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 267
		rightTrackModel[252] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 268
		rightTrackModel[253] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 269
		rightTrackModel[254] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 270
		rightTrackModel[255] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 271
		rightTrackModel[256] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 272
		rightTrackModel[257] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 273
		rightTrackModel[258] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 274
		rightTrackModel[259] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 275
		rightTrackModel[260] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 276
		rightTrackModel[261] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 277
		rightTrackModel[262] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 278
		rightTrackModel[263] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 279
		rightTrackModel[264] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 280
		rightTrackModel[265] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 281
		rightTrackModel[266] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 282
		rightTrackModel[267] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 283
		rightTrackModel[268] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 284
		rightTrackModel[269] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 285
		rightTrackModel[270] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 286
		rightTrackModel[271] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 287
		rightTrackModel[272] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 288
		rightTrackModel[273] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 289
		rightTrackModel[274] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 290
		rightTrackModel[275] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 291
		rightTrackModel[276] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 292
		rightTrackModel[277] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 293
		rightTrackModel[278] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 294
		rightTrackModel[279] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 295
		rightTrackModel[280] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 296
		rightTrackModel[281] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 297
		rightTrackModel[282] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 298
		rightTrackModel[283] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 299
		rightTrackModel[284] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 300
		rightTrackModel[285] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 301
		rightTrackModel[286] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 302
		rightTrackModel[287] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 303
		rightTrackModel[288] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 304
		rightTrackModel[289] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 305
		rightTrackModel[290] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 306
		rightTrackModel[291] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 307
		rightTrackModel[292] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 308
		rightTrackModel[293] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 309
		rightTrackModel[294] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 310
		rightTrackModel[295] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 311
		rightTrackModel[296] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 312
		rightTrackModel[297] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 313
		rightTrackModel[298] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 314
		rightTrackModel[299] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 315
		rightTrackModel[300] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 316
		rightTrackModel[301] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 317
		rightTrackModel[302] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 318
		rightTrackModel[303] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 319
		rightTrackModel[304] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 320
		rightTrackModel[305] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 321
		rightTrackModel[306] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 322
		rightTrackModel[307] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 323
		rightTrackModel[308] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 324
		rightTrackModel[309] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 325
		rightTrackModel[310] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 326
		rightTrackModel[311] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 327
		rightTrackModel[312] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 328
		rightTrackModel[313] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 329
		rightTrackModel[314] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 330
		rightTrackModel[315] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 331
		rightTrackModel[316] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 332
		rightTrackModel[317] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 333
		rightTrackModel[318] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 334
		rightTrackModel[319] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 335
		rightTrackModel[320] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 336
		rightTrackModel[321] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 337
		rightTrackModel[322] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 338
		rightTrackModel[323] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 339
		rightTrackModel[324] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 340
		rightTrackModel[325] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 341
		rightTrackModel[326] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 342
		rightTrackModel[327] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 343
		rightTrackModel[328] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 344
		rightTrackModel[329] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 345
		rightTrackModel[330] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 346
		rightTrackModel[331] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 347
		rightTrackModel[332] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 348
		rightTrackModel[333] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 349
		rightTrackModel[334] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 350
		rightTrackModel[335] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 351
		rightTrackModel[336] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 352
		rightTrackModel[337] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 353
		rightTrackModel[338] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 354
		rightTrackModel[339] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 355
		rightTrackModel[340] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 356
		rightTrackModel[341] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 357
		rightTrackModel[342] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 358
		rightTrackModel[343] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 359
		rightTrackModel[344] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 360
		rightTrackModel[345] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 361
		rightTrackModel[346] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 362
		rightTrackModel[347] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 363
		rightTrackModel[348] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 364
		rightTrackModel[349] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 365
		rightTrackModel[350] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 366
		rightTrackModel[351] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 367
		rightTrackModel[352] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 368
		rightTrackModel[353] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 369
		rightTrackModel[354] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 370
		rightTrackModel[355] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 371
		rightTrackModel[356] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 372
		rightTrackModel[357] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 373
		rightTrackModel[358] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 374
		rightTrackModel[359] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 375
		rightTrackModel[360] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 376
		rightTrackModel[361] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 377
		rightTrackModel[362] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 378
		rightTrackModel[363] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 379
		rightTrackModel[364] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 380
		rightTrackModel[365] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 381
		rightTrackModel[366] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 382
		rightTrackModel[367] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 383
		rightTrackModel[368] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 384
		rightTrackModel[369] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 385
		rightTrackModel[370] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 386
		rightTrackModel[371] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 387
		rightTrackModel[372] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 388
		rightTrackModel[373] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 389
		rightTrackModel[374] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 390
		rightTrackModel[375] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 391
		rightTrackModel[376] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 392
		rightTrackModel[377] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 393
		rightTrackModel[378] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 394
		rightTrackModel[379] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 395
		rightTrackModel[380] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 396
		rightTrackModel[381] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 397
		rightTrackModel[382] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 398
		rightTrackModel[383] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 399
		rightTrackModel[384] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 400
		rightTrackModel[385] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 401
		rightTrackModel[386] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 402
		rightTrackModel[387] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 403
		rightTrackModel[388] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 404
		rightTrackModel[389] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 405
		rightTrackModel[390] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 406
		rightTrackModel[391] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 407
		rightTrackModel[392] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 408
		rightTrackModel[393] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 409
		rightTrackModel[394] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 410
		rightTrackModel[395] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 411
		rightTrackModel[396] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 412
		rightTrackModel[397] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 413
		rightTrackModel[398] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 414
		rightTrackModel[399] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 415
		rightTrackModel[400] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 416
		rightTrackModel[401] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 417
		rightTrackModel[402] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 418
		rightTrackModel[403] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 419
		rightTrackModel[404] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 420
		rightTrackModel[405] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 421
		rightTrackModel[406] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 422
		rightTrackModel[407] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 423
		rightTrackModel[408] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 424
		rightTrackModel[409] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 425
		rightTrackModel[410] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 426
		rightTrackModel[411] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 427
		rightTrackModel[412] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 428
		rightTrackModel[413] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 429
		rightTrackModel[414] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 430
		rightTrackModel[415] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 431
		rightTrackModel[416] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 432
		rightTrackModel[417] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 433
		rightTrackModel[418] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 434
		rightTrackModel[419] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 435
		rightTrackModel[420] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 436
		rightTrackModel[421] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 437
		rightTrackModel[422] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 438
		rightTrackModel[423] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 439
		rightTrackModel[424] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 440
		rightTrackModel[425] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 441
		rightTrackModel[426] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 442
		rightTrackModel[427] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 443
		rightTrackModel[428] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 444
		rightTrackModel[429] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 445
		rightTrackModel[430] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 446
		rightTrackModel[431] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 447
		rightTrackModel[432] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 448
		rightTrackModel[433] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 449
		rightTrackModel[434] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 450
		rightTrackModel[435] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 451
		rightTrackModel[436] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 452
		rightTrackModel[437] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 453
		rightTrackModel[438] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 454
		rightTrackModel[439] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 455
		rightTrackModel[440] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 456
		rightTrackModel[441] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 457
		rightTrackModel[442] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 458
		rightTrackModel[443] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 459
		rightTrackModel[444] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 460
		rightTrackModel[445] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 461
		rightTrackModel[446] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 462
		rightTrackModel[447] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 463
		rightTrackModel[448] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 464
		rightTrackModel[449] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 465
		rightTrackModel[450] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 466
		rightTrackModel[451] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 467
		rightTrackModel[452] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 468
		rightTrackModel[453] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 469
		rightTrackModel[454] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 470
		rightTrackModel[455] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 471
		rightTrackModel[456] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 472
		rightTrackModel[457] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 473
		rightTrackModel[458] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 474
		rightTrackModel[459] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 475
		rightTrackModel[460] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 476
		rightTrackModel[461] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 477
		rightTrackModel[462] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 478
		rightTrackModel[463] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 479
		rightTrackModel[464] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 480
		rightTrackModel[465] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 481
		rightTrackModel[466] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 482
		rightTrackModel[467] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 483
		rightTrackModel[468] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 484
		rightTrackModel[469] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 485
		rightTrackModel[470] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 486
		rightTrackModel[471] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 487
		rightTrackModel[472] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 488
		rightTrackModel[473] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 489
		rightTrackModel[474] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 490
		rightTrackModel[475] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 491
		rightTrackModel[476] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 492
		rightTrackModel[477] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 493
		rightTrackModel[478] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 494
		rightTrackModel[479] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 495
		rightTrackModel[480] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 496
		rightTrackModel[481] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 497
		rightTrackModel[482] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 498
		rightTrackModel[483] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 499
		rightTrackModel[484] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 500
		rightTrackModel[485] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 501
		rightTrackModel[486] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 502
		rightTrackModel[487] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 503
		rightTrackModel[488] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 504
		rightTrackModel[489] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 505
		rightTrackModel[490] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 506
		rightTrackModel[491] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 507
		rightTrackModel[492] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 508
		rightTrackModel[493] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 509
		rightTrackModel[494] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 510
		rightTrackModel[495] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 511
		rightTrackModel[496] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 512
		rightTrackModel[497] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 513
		rightTrackModel[498] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 514
		rightTrackModel[499] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 515

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box502
		rightTrackModel[0].setRotationPoint(45F, -6F, -26.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box503
		rightTrackModel[1].setRotationPoint(45F, -8F, -26.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box504
		rightTrackModel[2].setRotationPoint(46F, -9F, -26.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box505
		rightTrackModel[3].setRotationPoint(45F, -3F, -26.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box506
		rightTrackModel[4].setRotationPoint(46F, -1F, -26.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box507
		rightTrackModel[5].setRotationPoint(35F, -1F, -26.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box508
		rightTrackModel[6].setRotationPoint(34F, 0F, -26.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box509
		rightTrackModel[7].setRotationPoint(34F, 2F, -26.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box510
		rightTrackModel[8].setRotationPoint(34F, 5F, -26.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box511
		rightTrackModel[9].setRotationPoint(35F, 7F, -26.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box512
		rightTrackModel[10].setRotationPoint(22F, -1F, -26.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box513
		rightTrackModel[11].setRotationPoint(21F, 0F, -26.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box514
		rightTrackModel[12].setRotationPoint(21F, 2F, -26.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box515
		rightTrackModel[13].setRotationPoint(21F, 5F, -26.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box516
		rightTrackModel[14].setRotationPoint(22F, 7F, -26.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box517
		rightTrackModel[15].setRotationPoint(9F, -1F, -26.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box518
		rightTrackModel[16].setRotationPoint(8F, 0F, -26.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box519
		rightTrackModel[17].setRotationPoint(8F, 2F, -26.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box520
		rightTrackModel[18].setRotationPoint(8F, 5F, -26.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box521
		rightTrackModel[19].setRotationPoint(9F, 7F, -26.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box522
		rightTrackModel[20].setRotationPoint(-40F, -1F, -26.5F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box523
		rightTrackModel[21].setRotationPoint(-41F, 0F, -26.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box524
		rightTrackModel[22].setRotationPoint(-41F, 2F, -26.5F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box525
		rightTrackModel[23].setRotationPoint(-41F, 5F, -26.5F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box526
		rightTrackModel[24].setRotationPoint(-40F, 7F, -26.5F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box527
		rightTrackModel[25].setRotationPoint(-27F, -1F, -26.5F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box528
		rightTrackModel[26].setRotationPoint(-28F, 0F, -26.5F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box529
		rightTrackModel[27].setRotationPoint(-28F, 2F, -26.5F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box530
		rightTrackModel[28].setRotationPoint(-28F, 5F, -26.5F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box531
		rightTrackModel[29].setRotationPoint(-27F, 7F, -26.5F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box532
		rightTrackModel[30].setRotationPoint(-14F, -1F, -26.5F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box533
		rightTrackModel[31].setRotationPoint(-15F, 0F, -26.5F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box534
		rightTrackModel[32].setRotationPoint(-15F, 2F, -26.5F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box535
		rightTrackModel[33].setRotationPoint(-15F, 5F, -26.5F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box536
		rightTrackModel[34].setRotationPoint(-14F, 7F, -26.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box537
		rightTrackModel[35].setRotationPoint(-48F, -1F, -26.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box538
		rightTrackModel[36].setRotationPoint(-49F, -6F, -26.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box539
		rightTrackModel[37].setRotationPoint(-49F, -3F, -26.5F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box540
		rightTrackModel[38].setRotationPoint(-49F, -8F, -26.5F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box541
		rightTrackModel[39].setRotationPoint(-48F, -9F, -26.5F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box542
		rightTrackModel[40].setRotationPoint(-2.5F, -1F, -26.5F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box543
		rightTrackModel[41].setRotationPoint(-3.5F, 0F, -26.5F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box544
		rightTrackModel[42].setRotationPoint(-3.5F, 2F, -26.5F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box545
		rightTrackModel[43].setRotationPoint(-3.5F, 5F, -26.5F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box546
		rightTrackModel[44].setRotationPoint(-2.5F, 7F, -26.5F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightTrackModel[45].setRotationPoint(48F, -10F, -27.5F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rightTrackModel[46].setRotationPoint(48F, -10F, -19.5F);

		rightTrackModel[47].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightTrackModel[47].setRotationPoint(48F, -10F, -27.5F);

		rightTrackModel[48].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 48
		rightTrackModel[48].setRotationPoint(48F, -10F, -19.5F);

		rightTrackModel[49].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightTrackModel[49].setRotationPoint(48F, -10F, -28.5F);

		rightTrackModel[50].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 50
		rightTrackModel[50].setRotationPoint(48F, -10F, -23.5F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		rightTrackModel[51].setRotationPoint(48F, -10F, -24.5F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightTrackModel[52].setRotationPoint(48F, -10F, -21.5F);

		rightTrackModel[53].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightTrackModel[53].setRotationPoint(51F, -10F, -28.5F);
		rightTrackModel[53].rotateAngleZ = -0.40142573F;

		rightTrackModel[54].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightTrackModel[54].setRotationPoint(51F, -10F, -27.5F);
		rightTrackModel[54].rotateAngleZ = -0.40142573F;

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightTrackModel[55].setRotationPoint(51F, -10F, -27.5F);
		rightTrackModel[55].rotateAngleZ = -0.40142573F;

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightTrackModel[56].setRotationPoint(51F, -10F, -24.5F);
		rightTrackModel[56].rotateAngleZ = -0.40142573F;

		rightTrackModel[57].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 65
		rightTrackModel[57].setRotationPoint(51F, -10F, -23.5F);
		rightTrackModel[57].rotateAngleZ = -0.40142573F;

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightTrackModel[58].setRotationPoint(51F, -10F, -21.5F);
		rightTrackModel[58].rotateAngleZ = -0.40142573F;

		rightTrackModel[59].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 67
		rightTrackModel[59].setRotationPoint(51F, -10F, -19.5F);
		rightTrackModel[59].rotateAngleZ = -0.40142573F;

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rightTrackModel[60].setRotationPoint(51F, -10F, -19.5F);
		rightTrackModel[60].rotateAngleZ = -0.40142573F;

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		rightTrackModel[61].setRotationPoint(53.7F, -8.8F, -27.5F);
		rightTrackModel[61].rotateAngleZ = -1.02974426F;

		rightTrackModel[62].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		rightTrackModel[62].setRotationPoint(53.7F, -8.8F, -27.5F);
		rightTrackModel[62].rotateAngleZ = -1.02974426F;

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		rightTrackModel[63].setRotationPoint(53.7F, -8.8F, -24.5F);
		rightTrackModel[63].rotateAngleZ = -1.02974426F;

		rightTrackModel[64].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 80
		rightTrackModel[64].setRotationPoint(53.7F, -8.8F, -23.5F);
		rightTrackModel[64].rotateAngleZ = -1.02974426F;

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		rightTrackModel[65].setRotationPoint(53.7F, -8.8F, -21.5F);
		rightTrackModel[65].rotateAngleZ = -1.02974426F;

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		rightTrackModel[66].setRotationPoint(53.7F, -8.8F, -19.5F);
		rightTrackModel[66].rotateAngleZ = -1.02974426F;

		rightTrackModel[67].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 83
		rightTrackModel[67].setRotationPoint(53.7F, -8.8F, -19.5F);
		rightTrackModel[67].rotateAngleZ = -1.02974426F;

		rightTrackModel[68].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		rightTrackModel[68].setRotationPoint(53.7F, -8.8F, -28.5F);
		rightTrackModel[68].rotateAngleZ = -1.02974426F;

		rightTrackModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		rightTrackModel[69].setRotationPoint(55.25F, -6.25F, -27.5F);
		rightTrackModel[69].rotateAngleZ = -1.57079633F;

		rightTrackModel[70].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		rightTrackModel[70].setRotationPoint(55.25F, -6.25F, -27.5F);
		rightTrackModel[70].rotateAngleZ = -1.57079633F;

		rightTrackModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		rightTrackModel[71].setRotationPoint(55.25F, -6.25F, -24.5F);
		rightTrackModel[71].rotateAngleZ = -1.57079633F;

		rightTrackModel[72].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 88
		rightTrackModel[72].setRotationPoint(55.25F, -6.25F, -23.5F);
		rightTrackModel[72].rotateAngleZ = -1.57079633F;

		rightTrackModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		rightTrackModel[73].setRotationPoint(55.25F, -6.25F, -21.5F);
		rightTrackModel[73].rotateAngleZ = -1.57079633F;

		rightTrackModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		rightTrackModel[74].setRotationPoint(55.25F, -6.25F, -19.5F);
		rightTrackModel[74].rotateAngleZ = -1.57079633F;

		rightTrackModel[75].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 91
		rightTrackModel[75].setRotationPoint(55.25F, -6.25F, -19.5F);
		rightTrackModel[75].rotateAngleZ = -1.57079633F;

		rightTrackModel[76].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		rightTrackModel[76].setRotationPoint(55.25F, -6.25F, -28.5F);
		rightTrackModel[76].rotateAngleZ = -1.57079633F;

		rightTrackModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		rightTrackModel[77].setRotationPoint(55.25F, -3.25F, -27.5F);
		rightTrackModel[77].rotateAngleZ = -2.07694181F;

		rightTrackModel[78].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		rightTrackModel[78].setRotationPoint(55.25F, -3.25F, -27.5F);
		rightTrackModel[78].rotateAngleZ = -2.07694181F;

		rightTrackModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		rightTrackModel[79].setRotationPoint(55.25F, -3.25F, -24.5F);
		rightTrackModel[79].rotateAngleZ = -2.07694181F;

		rightTrackModel[80].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 96
		rightTrackModel[80].setRotationPoint(55.25F, -3.25F, -23.5F);
		rightTrackModel[80].rotateAngleZ = -2.07694181F;

		rightTrackModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightTrackModel[81].setRotationPoint(55.25F, -3.25F, -21.5F);
		rightTrackModel[81].rotateAngleZ = -2.07694181F;

		rightTrackModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		rightTrackModel[82].setRotationPoint(55.25F, -3.25F, -19.5F);
		rightTrackModel[82].rotateAngleZ = -2.07694181F;

		rightTrackModel[83].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 99
		rightTrackModel[83].setRotationPoint(55.25F, -3.25F, -19.5F);
		rightTrackModel[83].rotateAngleZ = -2.07694181F;

		rightTrackModel[84].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightTrackModel[84].setRotationPoint(55.25F, -3.25F, -28.5F);
		rightTrackModel[84].rotateAngleZ = -2.07694181F;

		rightTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightTrackModel[85].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[85].rotateAngleZ = -2.47836754F;

		rightTrackModel[86].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackModel[86].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[86].rotateAngleZ = -2.47836754F;

		rightTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightTrackModel[87].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[87].rotateAngleZ = -2.47836754F;

		rightTrackModel[88].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 104
		rightTrackModel[88].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[88].rotateAngleZ = -2.47836754F;

		rightTrackModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightTrackModel[89].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[89].rotateAngleZ = -2.47836754F;

		rightTrackModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		rightTrackModel[90].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[90].rotateAngleZ = -2.47836754F;

		rightTrackModel[91].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 107
		rightTrackModel[91].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[91].rotateAngleZ = -2.47836754F;

		rightTrackModel[92].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		rightTrackModel[92].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[92].rotateAngleZ = -2.47836754F;

		rightTrackModel[93].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		rightTrackModel[93].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[93].rotateAngleZ = -2.47836754F;

		rightTrackModel[94].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		rightTrackModel[94].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[94].rotateAngleZ = -2.47836754F;

		rightTrackModel[95].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		rightTrackModel[95].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[95].rotateAngleZ = -2.47836754F;

		rightTrackModel[96].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 112
		rightTrackModel[96].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[96].rotateAngleZ = -2.47836754F;

		rightTrackModel[97].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		rightTrackModel[97].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[97].rotateAngleZ = -2.47836754F;

		rightTrackModel[98].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		rightTrackModel[98].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[98].rotateAngleZ = -2.47836754F;

		rightTrackModel[99].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 115
		rightTrackModel[99].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[99].rotateAngleZ = -2.47836754F;

		rightTrackModel[100].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		rightTrackModel[100].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[100].rotateAngleZ = -2.47836754F;

		rightTrackModel[101].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightTrackModel[101].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[101].rotateAngleZ = -2.47836754F;

		rightTrackModel[102].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		rightTrackModel[102].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[102].rotateAngleZ = -2.47836754F;

		rightTrackModel[103].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		rightTrackModel[103].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[103].rotateAngleZ = -2.47836754F;

		rightTrackModel[104].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 120
		rightTrackModel[104].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[104].rotateAngleZ = -2.47836754F;

		rightTrackModel[105].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		rightTrackModel[105].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[105].rotateAngleZ = -2.47836754F;

		rightTrackModel[106].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightTrackModel[106].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[106].rotateAngleZ = -2.47836754F;

		rightTrackModel[107].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 123
		rightTrackModel[107].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[107].rotateAngleZ = -2.47836754F;

		rightTrackModel[108].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		rightTrackModel[108].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[108].rotateAngleZ = -2.47836754F;

		rightTrackModel[109].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightTrackModel[109].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[109].rotateAngleZ = -2.47836754F;

		rightTrackModel[110].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rightTrackModel[110].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[110].rotateAngleZ = -2.47836754F;

		rightTrackModel[111].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		rightTrackModel[111].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[111].rotateAngleZ = -2.47836754F;

		rightTrackModel[112].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 128
		rightTrackModel[112].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[112].rotateAngleZ = -2.47836754F;

		rightTrackModel[113].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		rightTrackModel[113].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[113].rotateAngleZ = -2.47836754F;

		rightTrackModel[114].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		rightTrackModel[114].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[114].rotateAngleZ = -2.47836754F;

		rightTrackModel[115].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 131
		rightTrackModel[115].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[115].rotateAngleZ = -2.47836754F;

		rightTrackModel[116].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		rightTrackModel[116].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[116].rotateAngleZ = -2.47836754F;

		rightTrackModel[117].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		rightTrackModel[117].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[117].rotateAngleZ = -2.47836754F;

		rightTrackModel[118].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		rightTrackModel[118].setRotationPoint(53.9F, -0.7F, -27.5F);
		rightTrackModel[118].rotateAngleZ = -2.47836754F;

		rightTrackModel[119].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rightTrackModel[119].setRotationPoint(53.9F, -0.7F, -24.5F);
		rightTrackModel[119].rotateAngleZ = -2.47836754F;

		rightTrackModel[120].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 136
		rightTrackModel[120].setRotationPoint(53.9F, -0.7F, -23.5F);
		rightTrackModel[120].rotateAngleZ = -2.47836754F;

		rightTrackModel[121].addShapeBox(12F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightTrackModel[121].setRotationPoint(53.9F, -0.7F, -21.5F);
		rightTrackModel[121].rotateAngleZ = -2.47836754F;

		rightTrackModel[122].addShapeBox(12F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rightTrackModel[122].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[122].rotateAngleZ = -2.47836754F;

		rightTrackModel[123].addShapeBox(13F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 139
		rightTrackModel[123].setRotationPoint(53.9F, -0.7F, -19.5F);
		rightTrackModel[123].rotateAngleZ = -2.47836754F;

		rightTrackModel[124].addShapeBox(14F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		rightTrackModel[124].setRotationPoint(53.9F, -0.7F, -28.5F);
		rightTrackModel[124].rotateAngleZ = -2.47836754F;

		rightTrackModel[125].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		rightTrackModel[125].setRotationPoint(43.5F, 8.8F, -27.5F);
		rightTrackModel[125].rotateAngleZ = -3.08923278F;

		rightTrackModel[126].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		rightTrackModel[126].setRotationPoint(43.5F, 8.8F, -27.5F);
		rightTrackModel[126].rotateAngleZ = -3.08923278F;

		rightTrackModel[127].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		rightTrackModel[127].setRotationPoint(43.5F, 8.8F, -24.5F);
		rightTrackModel[127].rotateAngleZ = -3.08923278F;

		rightTrackModel[128].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 144
		rightTrackModel[128].setRotationPoint(43.5F, 8.8F, -23.5F);
		rightTrackModel[128].rotateAngleZ = -3.08923278F;

		rightTrackModel[129].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		rightTrackModel[129].setRotationPoint(43.5F, 8.8F, -21.5F);
		rightTrackModel[129].rotateAngleZ = -3.08923278F;

		rightTrackModel[130].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		rightTrackModel[130].setRotationPoint(43.5F, 8.8F, -19.5F);
		rightTrackModel[130].rotateAngleZ = -3.08923278F;

		rightTrackModel[131].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 147
		rightTrackModel[131].setRotationPoint(43.5F, 8.8F, -19.5F);
		rightTrackModel[131].rotateAngleZ = -3.08923278F;

		rightTrackModel[132].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		rightTrackModel[132].setRotationPoint(43.5F, 8.8F, -28.5F);
		rightTrackModel[132].rotateAngleZ = -3.08923278F;

		rightTrackModel[133].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		rightTrackModel[133].setRotationPoint(40.5F, 9F, -27.5F);
		rightTrackModel[133].rotateAngleZ = -3.14159265F;

		rightTrackModel[134].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		rightTrackModel[134].setRotationPoint(40.5F, 9F, -27.5F);
		rightTrackModel[134].rotateAngleZ = -3.14159265F;

		rightTrackModel[135].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		rightTrackModel[135].setRotationPoint(40.5F, 9F, -24.5F);
		rightTrackModel[135].rotateAngleZ = -3.14159265F;

		rightTrackModel[136].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 152
		rightTrackModel[136].setRotationPoint(40.5F, 9F, -23.5F);
		rightTrackModel[136].rotateAngleZ = -3.14159265F;

		rightTrackModel[137].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightTrackModel[137].setRotationPoint(40.5F, 9F, -21.5F);
		rightTrackModel[137].rotateAngleZ = -3.14159265F;

		rightTrackModel[138].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightTrackModel[138].setRotationPoint(40.5F, 9F, -19.5F);
		rightTrackModel[138].rotateAngleZ = -3.14159265F;

		rightTrackModel[139].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 155
		rightTrackModel[139].setRotationPoint(40.5F, 9F, -19.5F);
		rightTrackModel[139].rotateAngleZ = -3.14159265F;

		rightTrackModel[140].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		rightTrackModel[140].setRotationPoint(40.5F, 9F, -28.5F);
		rightTrackModel[140].rotateAngleZ = -3.14159265F;

		rightTrackModel[141].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightTrackModel[141].setRotationPoint(37.5F, 9F, -27.5F);
		rightTrackModel[141].rotateAngleZ = -3.14159265F;

		rightTrackModel[142].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightTrackModel[142].setRotationPoint(37.5F, 9F, -27.5F);
		rightTrackModel[142].rotateAngleZ = -3.14159265F;

		rightTrackModel[143].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		rightTrackModel[143].setRotationPoint(37.5F, 9F, -24.5F);
		rightTrackModel[143].rotateAngleZ = -3.14159265F;

		rightTrackModel[144].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 160
		rightTrackModel[144].setRotationPoint(37.5F, 9F, -23.5F);
		rightTrackModel[144].rotateAngleZ = -3.14159265F;

		rightTrackModel[145].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightTrackModel[145].setRotationPoint(37.5F, 9F, -21.5F);
		rightTrackModel[145].rotateAngleZ = -3.14159265F;

		rightTrackModel[146].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		rightTrackModel[146].setRotationPoint(37.5F, 9F, -19.5F);
		rightTrackModel[146].rotateAngleZ = -3.14159265F;

		rightTrackModel[147].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 163
		rightTrackModel[147].setRotationPoint(37.5F, 9F, -19.5F);
		rightTrackModel[147].rotateAngleZ = -3.14159265F;

		rightTrackModel[148].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightTrackModel[148].setRotationPoint(37.5F, 9F, -28.5F);
		rightTrackModel[148].rotateAngleZ = -3.14159265F;

		rightTrackModel[149].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		rightTrackModel[149].setRotationPoint(34.5F, 9F, -27.5F);
		rightTrackModel[149].rotateAngleZ = -3.14159265F;

		rightTrackModel[150].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		rightTrackModel[150].setRotationPoint(34.5F, 9F, -27.5F);
		rightTrackModel[150].rotateAngleZ = -3.14159265F;

		rightTrackModel[151].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		rightTrackModel[151].setRotationPoint(34.5F, 9F, -24.5F);
		rightTrackModel[151].rotateAngleZ = -3.14159265F;

		rightTrackModel[152].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 168
		rightTrackModel[152].setRotationPoint(34.5F, 9F, -23.5F);
		rightTrackModel[152].rotateAngleZ = -3.14159265F;

		rightTrackModel[153].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		rightTrackModel[153].setRotationPoint(34.5F, 9F, -21.5F);
		rightTrackModel[153].rotateAngleZ = -3.14159265F;

		rightTrackModel[154].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		rightTrackModel[154].setRotationPoint(34.5F, 9F, -19.5F);
		rightTrackModel[154].rotateAngleZ = -3.14159265F;

		rightTrackModel[155].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 171
		rightTrackModel[155].setRotationPoint(34.5F, 9F, -19.5F);
		rightTrackModel[155].rotateAngleZ = -3.14159265F;

		rightTrackModel[156].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightTrackModel[156].setRotationPoint(34.5F, 9F, -28.5F);
		rightTrackModel[156].rotateAngleZ = -3.14159265F;

		rightTrackModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		rightTrackModel[157].setRotationPoint(31.5F, 9F, -27.5F);
		rightTrackModel[157].rotateAngleZ = -3.14159265F;

		rightTrackModel[158].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		rightTrackModel[158].setRotationPoint(31.5F, 9F, -27.5F);
		rightTrackModel[158].rotateAngleZ = -3.14159265F;

		rightTrackModel[159].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightTrackModel[159].setRotationPoint(31.5F, 9F, -24.5F);
		rightTrackModel[159].rotateAngleZ = -3.14159265F;

		rightTrackModel[160].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 176
		rightTrackModel[160].setRotationPoint(31.5F, 9F, -23.5F);
		rightTrackModel[160].rotateAngleZ = -3.14159265F;

		rightTrackModel[161].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightTrackModel[161].setRotationPoint(31.5F, 9F, -21.5F);
		rightTrackModel[161].rotateAngleZ = -3.14159265F;

		rightTrackModel[162].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightTrackModel[162].setRotationPoint(31.5F, 9F, -19.5F);
		rightTrackModel[162].rotateAngleZ = -3.14159265F;

		rightTrackModel[163].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 179
		rightTrackModel[163].setRotationPoint(31.5F, 9F, -19.5F);
		rightTrackModel[163].rotateAngleZ = -3.14159265F;

		rightTrackModel[164].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		rightTrackModel[164].setRotationPoint(31.5F, 9F, -28.5F);
		rightTrackModel[164].rotateAngleZ = -3.14159265F;

		rightTrackModel[165].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		rightTrackModel[165].setRotationPoint(28.5F, 9F, -27.5F);
		rightTrackModel[165].rotateAngleZ = -3.14159265F;

		rightTrackModel[166].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		rightTrackModel[166].setRotationPoint(28.5F, 9F, -27.5F);
		rightTrackModel[166].rotateAngleZ = -3.14159265F;

		rightTrackModel[167].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		rightTrackModel[167].setRotationPoint(28.5F, 9F, -24.5F);
		rightTrackModel[167].rotateAngleZ = -3.14159265F;

		rightTrackModel[168].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 184
		rightTrackModel[168].setRotationPoint(28.5F, 9F, -23.5F);
		rightTrackModel[168].rotateAngleZ = -3.14159265F;

		rightTrackModel[169].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		rightTrackModel[169].setRotationPoint(28.5F, 9F, -21.5F);
		rightTrackModel[169].rotateAngleZ = -3.14159265F;

		rightTrackModel[170].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		rightTrackModel[170].setRotationPoint(28.5F, 9F, -19.5F);
		rightTrackModel[170].rotateAngleZ = -3.14159265F;

		rightTrackModel[171].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 187
		rightTrackModel[171].setRotationPoint(28.5F, 9F, -19.5F);
		rightTrackModel[171].rotateAngleZ = -3.14159265F;

		rightTrackModel[172].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		rightTrackModel[172].setRotationPoint(28.5F, 9F, -28.5F);
		rightTrackModel[172].rotateAngleZ = -3.14159265F;

		rightTrackModel[173].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightTrackModel[173].setRotationPoint(25.5F, 9F, -27.5F);
		rightTrackModel[173].rotateAngleZ = -3.14159265F;

		rightTrackModel[174].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightTrackModel[174].setRotationPoint(25.5F, 9F, -27.5F);
		rightTrackModel[174].rotateAngleZ = -3.14159265F;

		rightTrackModel[175].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		rightTrackModel[175].setRotationPoint(25.5F, 9F, -24.5F);
		rightTrackModel[175].rotateAngleZ = -3.14159265F;

		rightTrackModel[176].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 192
		rightTrackModel[176].setRotationPoint(25.5F, 9F, -23.5F);
		rightTrackModel[176].rotateAngleZ = -3.14159265F;

		rightTrackModel[177].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightTrackModel[177].setRotationPoint(25.5F, 9F, -21.5F);
		rightTrackModel[177].rotateAngleZ = -3.14159265F;

		rightTrackModel[178].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		rightTrackModel[178].setRotationPoint(25.5F, 9F, -19.5F);
		rightTrackModel[178].rotateAngleZ = -3.14159265F;

		rightTrackModel[179].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 195
		rightTrackModel[179].setRotationPoint(25.5F, 9F, -19.5F);
		rightTrackModel[179].rotateAngleZ = -3.14159265F;

		rightTrackModel[180].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightTrackModel[180].setRotationPoint(25.5F, 9F, -28.5F);
		rightTrackModel[180].rotateAngleZ = -3.14159265F;

		rightTrackModel[181].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightTrackModel[181].setRotationPoint(22.5F, 9F, -27.5F);
		rightTrackModel[181].rotateAngleZ = -3.14159265F;

		rightTrackModel[182].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		rightTrackModel[182].setRotationPoint(22.5F, 9F, -27.5F);
		rightTrackModel[182].rotateAngleZ = -3.14159265F;

		rightTrackModel[183].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightTrackModel[183].setRotationPoint(22.5F, 9F, -24.5F);
		rightTrackModel[183].rotateAngleZ = -3.14159265F;

		rightTrackModel[184].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 200
		rightTrackModel[184].setRotationPoint(22.5F, 9F, -23.5F);
		rightTrackModel[184].rotateAngleZ = -3.14159265F;

		rightTrackModel[185].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightTrackModel[185].setRotationPoint(22.5F, 9F, -21.5F);
		rightTrackModel[185].rotateAngleZ = -3.14159265F;

		rightTrackModel[186].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		rightTrackModel[186].setRotationPoint(22.5F, 9F, -19.5F);
		rightTrackModel[186].rotateAngleZ = -3.14159265F;

		rightTrackModel[187].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 203
		rightTrackModel[187].setRotationPoint(22.5F, 9F, -19.5F);
		rightTrackModel[187].rotateAngleZ = -3.14159265F;

		rightTrackModel[188].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		rightTrackModel[188].setRotationPoint(22.5F, 9F, -28.5F);
		rightTrackModel[188].rotateAngleZ = -3.14159265F;

		rightTrackModel[189].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightTrackModel[189].setRotationPoint(19.5F, 9F, -27.5F);
		rightTrackModel[189].rotateAngleZ = -3.14159265F;

		rightTrackModel[190].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		rightTrackModel[190].setRotationPoint(19.5F, 9F, -27.5F);
		rightTrackModel[190].rotateAngleZ = -3.14159265F;

		rightTrackModel[191].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		rightTrackModel[191].setRotationPoint(19.5F, 9F, -24.5F);
		rightTrackModel[191].rotateAngleZ = -3.14159265F;

		rightTrackModel[192].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 208
		rightTrackModel[192].setRotationPoint(19.5F, 9F, -23.5F);
		rightTrackModel[192].rotateAngleZ = -3.14159265F;

		rightTrackModel[193].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		rightTrackModel[193].setRotationPoint(19.5F, 9F, -21.5F);
		rightTrackModel[193].rotateAngleZ = -3.14159265F;

		rightTrackModel[194].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightTrackModel[194].setRotationPoint(19.5F, 9F, -19.5F);
		rightTrackModel[194].rotateAngleZ = -3.14159265F;

		rightTrackModel[195].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 211
		rightTrackModel[195].setRotationPoint(19.5F, 9F, -19.5F);
		rightTrackModel[195].rotateAngleZ = -3.14159265F;

		rightTrackModel[196].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightTrackModel[196].setRotationPoint(19.5F, 9F, -28.5F);
		rightTrackModel[196].rotateAngleZ = -3.14159265F;

		rightTrackModel[197].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightTrackModel[197].setRotationPoint(16.5F, 9F, -27.5F);
		rightTrackModel[197].rotateAngleZ = -3.14159265F;

		rightTrackModel[198].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightTrackModel[198].setRotationPoint(16.5F, 9F, -27.5F);
		rightTrackModel[198].rotateAngleZ = -3.14159265F;

		rightTrackModel[199].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightTrackModel[199].setRotationPoint(16.5F, 9F, -24.5F);
		rightTrackModel[199].rotateAngleZ = -3.14159265F;

		rightTrackModel[200].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 216
		rightTrackModel[200].setRotationPoint(16.5F, 9F, -23.5F);
		rightTrackModel[200].rotateAngleZ = -3.14159265F;

		rightTrackModel[201].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightTrackModel[201].setRotationPoint(16.5F, 9F, -21.5F);
		rightTrackModel[201].rotateAngleZ = -3.14159265F;

		rightTrackModel[202].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightTrackModel[202].setRotationPoint(16.5F, 9F, -19.5F);
		rightTrackModel[202].rotateAngleZ = -3.14159265F;

		rightTrackModel[203].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 219
		rightTrackModel[203].setRotationPoint(16.5F, 9F, -19.5F);
		rightTrackModel[203].rotateAngleZ = -3.14159265F;

		rightTrackModel[204].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightTrackModel[204].setRotationPoint(16.5F, 9F, -28.5F);
		rightTrackModel[204].rotateAngleZ = -3.14159265F;

		rightTrackModel[205].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightTrackModel[205].setRotationPoint(13.5F, 9F, -27.5F);
		rightTrackModel[205].rotateAngleZ = -3.14159265F;

		rightTrackModel[206].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightTrackModel[206].setRotationPoint(13.5F, 9F, -27.5F);
		rightTrackModel[206].rotateAngleZ = -3.14159265F;

		rightTrackModel[207].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackModel[207].setRotationPoint(13.5F, 9F, -24.5F);
		rightTrackModel[207].rotateAngleZ = -3.14159265F;

		rightTrackModel[208].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 224
		rightTrackModel[208].setRotationPoint(13.5F, 9F, -23.5F);
		rightTrackModel[208].rotateAngleZ = -3.14159265F;

		rightTrackModel[209].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightTrackModel[209].setRotationPoint(13.5F, 9F, -21.5F);
		rightTrackModel[209].rotateAngleZ = -3.14159265F;

		rightTrackModel[210].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightTrackModel[210].setRotationPoint(13.5F, 9F, -19.5F);
		rightTrackModel[210].rotateAngleZ = -3.14159265F;

		rightTrackModel[211].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 227
		rightTrackModel[211].setRotationPoint(13.5F, 9F, -19.5F);
		rightTrackModel[211].rotateAngleZ = -3.14159265F;

		rightTrackModel[212].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackModel[212].setRotationPoint(13.5F, 9F, -28.5F);
		rightTrackModel[212].rotateAngleZ = -3.14159265F;

		rightTrackModel[213].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightTrackModel[213].setRotationPoint(10.5F, 9F, -27.5F);
		rightTrackModel[213].rotateAngleZ = -3.14159265F;

		rightTrackModel[214].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightTrackModel[214].setRotationPoint(10.5F, 9F, -27.5F);
		rightTrackModel[214].rotateAngleZ = -3.14159265F;

		rightTrackModel[215].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightTrackModel[215].setRotationPoint(10.5F, 9F, -24.5F);
		rightTrackModel[215].rotateAngleZ = -3.14159265F;

		rightTrackModel[216].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 232
		rightTrackModel[216].setRotationPoint(10.5F, 9F, -23.5F);
		rightTrackModel[216].rotateAngleZ = -3.14159265F;

		rightTrackModel[217].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		rightTrackModel[217].setRotationPoint(10.5F, 9F, -21.5F);
		rightTrackModel[217].rotateAngleZ = -3.14159265F;

		rightTrackModel[218].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackModel[218].setRotationPoint(10.5F, 9F, -19.5F);
		rightTrackModel[218].rotateAngleZ = -3.14159265F;

		rightTrackModel[219].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 235
		rightTrackModel[219].setRotationPoint(10.5F, 9F, -19.5F);
		rightTrackModel[219].rotateAngleZ = -3.14159265F;

		rightTrackModel[220].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightTrackModel[220].setRotationPoint(10.5F, 9F, -28.5F);
		rightTrackModel[220].rotateAngleZ = -3.14159265F;

		rightTrackModel[221].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightTrackModel[221].setRotationPoint(7.5F, 9F, -27.5F);
		rightTrackModel[221].rotateAngleZ = -3.14159265F;

		rightTrackModel[222].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackModel[222].setRotationPoint(7.5F, 9F, -27.5F);
		rightTrackModel[222].rotateAngleZ = -3.14159265F;

		rightTrackModel[223].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightTrackModel[223].setRotationPoint(7.5F, 9F, -24.5F);
		rightTrackModel[223].rotateAngleZ = -3.14159265F;

		rightTrackModel[224].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 240
		rightTrackModel[224].setRotationPoint(7.5F, 9F, -23.5F);
		rightTrackModel[224].rotateAngleZ = -3.14159265F;

		rightTrackModel[225].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackModel[225].setRotationPoint(7.5F, 9F, -21.5F);
		rightTrackModel[225].rotateAngleZ = -3.14159265F;

		rightTrackModel[226].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightTrackModel[226].setRotationPoint(7.5F, 9F, -19.5F);
		rightTrackModel[226].rotateAngleZ = -3.14159265F;

		rightTrackModel[227].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 243
		rightTrackModel[227].setRotationPoint(7.5F, 9F, -19.5F);
		rightTrackModel[227].rotateAngleZ = -3.14159265F;

		rightTrackModel[228].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackModel[228].setRotationPoint(7.5F, 9F, -28.5F);
		rightTrackModel[228].rotateAngleZ = -3.14159265F;

		rightTrackModel[229].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackModel[229].setRotationPoint(4.5F, 9F, -27.5F);
		rightTrackModel[229].rotateAngleZ = -3.14159265F;

		rightTrackModel[230].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackModel[230].setRotationPoint(4.5F, 9F, -27.5F);
		rightTrackModel[230].rotateAngleZ = -3.14159265F;

		rightTrackModel[231].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		rightTrackModel[231].setRotationPoint(4.5F, 9F, -24.5F);
		rightTrackModel[231].rotateAngleZ = -3.14159265F;

		rightTrackModel[232].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 248
		rightTrackModel[232].setRotationPoint(4.5F, 9F, -23.5F);
		rightTrackModel[232].rotateAngleZ = -3.14159265F;

		rightTrackModel[233].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackModel[233].setRotationPoint(4.5F, 9F, -21.5F);
		rightTrackModel[233].rotateAngleZ = -3.14159265F;

		rightTrackModel[234].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightTrackModel[234].setRotationPoint(4.5F, 9F, -19.5F);
		rightTrackModel[234].rotateAngleZ = -3.14159265F;

		rightTrackModel[235].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 251
		rightTrackModel[235].setRotationPoint(4.5F, 9F, -19.5F);
		rightTrackModel[235].rotateAngleZ = -3.14159265F;

		rightTrackModel[236].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		rightTrackModel[236].setRotationPoint(4.5F, 9F, -28.5F);
		rightTrackModel[236].rotateAngleZ = -3.14159265F;

		rightTrackModel[237].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		rightTrackModel[237].setRotationPoint(1.5F, 9F, -27.5F);
		rightTrackModel[237].rotateAngleZ = -3.14159265F;

		rightTrackModel[238].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightTrackModel[238].setRotationPoint(1.5F, 9F, -27.5F);
		rightTrackModel[238].rotateAngleZ = -3.14159265F;

		rightTrackModel[239].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		rightTrackModel[239].setRotationPoint(1.5F, 9F, -24.5F);
		rightTrackModel[239].rotateAngleZ = -3.14159265F;

		rightTrackModel[240].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 256
		rightTrackModel[240].setRotationPoint(1.5F, 9F, -23.5F);
		rightTrackModel[240].rotateAngleZ = -3.14159265F;

		rightTrackModel[241].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		rightTrackModel[241].setRotationPoint(1.5F, 9F, -21.5F);
		rightTrackModel[241].rotateAngleZ = -3.14159265F;

		rightTrackModel[242].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightTrackModel[242].setRotationPoint(1.5F, 9F, -19.5F);
		rightTrackModel[242].rotateAngleZ = -3.14159265F;

		rightTrackModel[243].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 259
		rightTrackModel[243].setRotationPoint(1.5F, 9F, -19.5F);
		rightTrackModel[243].rotateAngleZ = -3.14159265F;

		rightTrackModel[244].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightTrackModel[244].setRotationPoint(1.5F, 9F, -28.5F);
		rightTrackModel[244].rotateAngleZ = -3.14159265F;

		rightTrackModel[245].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		rightTrackModel[245].setRotationPoint(-1.5F, 9F, -27.5F);
		rightTrackModel[245].rotateAngleZ = -3.14159265F;

		rightTrackModel[246].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		rightTrackModel[246].setRotationPoint(-1.5F, 9F, -27.5F);
		rightTrackModel[246].rotateAngleZ = -3.14159265F;

		rightTrackModel[247].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		rightTrackModel[247].setRotationPoint(-1.5F, 9F, -24.5F);
		rightTrackModel[247].rotateAngleZ = -3.14159265F;

		rightTrackModel[248].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 264
		rightTrackModel[248].setRotationPoint(-1.5F, 9F, -23.5F);
		rightTrackModel[248].rotateAngleZ = -3.14159265F;

		rightTrackModel[249].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightTrackModel[249].setRotationPoint(-1.5F, 9F, -21.5F);
		rightTrackModel[249].rotateAngleZ = -3.14159265F;

		rightTrackModel[250].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		rightTrackModel[250].setRotationPoint(-1.5F, 9F, -19.5F);
		rightTrackModel[250].rotateAngleZ = -3.14159265F;

		rightTrackModel[251].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 267
		rightTrackModel[251].setRotationPoint(-1.5F, 9F, -19.5F);
		rightTrackModel[251].rotateAngleZ = -3.14159265F;

		rightTrackModel[252].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightTrackModel[252].setRotationPoint(-1.5F, 9F, -28.5F);
		rightTrackModel[252].rotateAngleZ = -3.14159265F;

		rightTrackModel[253].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightTrackModel[253].setRotationPoint(-4.5F, 9F, -27.5F);
		rightTrackModel[253].rotateAngleZ = -3.14159265F;

		rightTrackModel[254].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightTrackModel[254].setRotationPoint(-4.5F, 9F, -27.5F);
		rightTrackModel[254].rotateAngleZ = -3.14159265F;

		rightTrackModel[255].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightTrackModel[255].setRotationPoint(-4.5F, 9F, -24.5F);
		rightTrackModel[255].rotateAngleZ = -3.14159265F;

		rightTrackModel[256].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 272
		rightTrackModel[256].setRotationPoint(-4.5F, 9F, -23.5F);
		rightTrackModel[256].rotateAngleZ = -3.14159265F;

		rightTrackModel[257].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightTrackModel[257].setRotationPoint(-4.5F, 9F, -21.5F);
		rightTrackModel[257].rotateAngleZ = -3.14159265F;

		rightTrackModel[258].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightTrackModel[258].setRotationPoint(-4.5F, 9F, -19.5F);
		rightTrackModel[258].rotateAngleZ = -3.14159265F;

		rightTrackModel[259].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 275
		rightTrackModel[259].setRotationPoint(-4.5F, 9F, -19.5F);
		rightTrackModel[259].rotateAngleZ = -3.14159265F;

		rightTrackModel[260].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		rightTrackModel[260].setRotationPoint(-4.5F, 9F, -28.5F);
		rightTrackModel[260].rotateAngleZ = -3.14159265F;

		rightTrackModel[261].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		rightTrackModel[261].setRotationPoint(-7.5F, 9F, -27.5F);
		rightTrackModel[261].rotateAngleZ = -3.14159265F;

		rightTrackModel[262].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightTrackModel[262].setRotationPoint(-7.5F, 9F, -27.5F);
		rightTrackModel[262].rotateAngleZ = -3.14159265F;

		rightTrackModel[263].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightTrackModel[263].setRotationPoint(-7.5F, 9F, -24.5F);
		rightTrackModel[263].rotateAngleZ = -3.14159265F;

		rightTrackModel[264].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 280
		rightTrackModel[264].setRotationPoint(-7.5F, 9F, -23.5F);
		rightTrackModel[264].rotateAngleZ = -3.14159265F;

		rightTrackModel[265].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightTrackModel[265].setRotationPoint(-7.5F, 9F, -21.5F);
		rightTrackModel[265].rotateAngleZ = -3.14159265F;

		rightTrackModel[266].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightTrackModel[266].setRotationPoint(-7.5F, 9F, -19.5F);
		rightTrackModel[266].rotateAngleZ = -3.14159265F;

		rightTrackModel[267].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 283
		rightTrackModel[267].setRotationPoint(-7.5F, 9F, -19.5F);
		rightTrackModel[267].rotateAngleZ = -3.14159265F;

		rightTrackModel[268].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightTrackModel[268].setRotationPoint(-7.5F, 9F, -28.5F);
		rightTrackModel[268].rotateAngleZ = -3.14159265F;

		rightTrackModel[269].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightTrackModel[269].setRotationPoint(-10.5F, 9F, -27.5F);
		rightTrackModel[269].rotateAngleZ = -3.14159265F;

		rightTrackModel[270].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightTrackModel[270].setRotationPoint(-10.5F, 9F, -27.5F);
		rightTrackModel[270].rotateAngleZ = -3.14159265F;

		rightTrackModel[271].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackModel[271].setRotationPoint(-10.5F, 9F, -24.5F);
		rightTrackModel[271].rotateAngleZ = -3.14159265F;

		rightTrackModel[272].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 288
		rightTrackModel[272].setRotationPoint(-10.5F, 9F, -23.5F);
		rightTrackModel[272].rotateAngleZ = -3.14159265F;

		rightTrackModel[273].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		rightTrackModel[273].setRotationPoint(-10.5F, 9F, -21.5F);
		rightTrackModel[273].rotateAngleZ = -3.14159265F;

		rightTrackModel[274].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackModel[274].setRotationPoint(-10.5F, 9F, -19.5F);
		rightTrackModel[274].rotateAngleZ = -3.14159265F;

		rightTrackModel[275].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 291
		rightTrackModel[275].setRotationPoint(-10.5F, 9F, -19.5F);
		rightTrackModel[275].rotateAngleZ = -3.14159265F;

		rightTrackModel[276].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackModel[276].setRotationPoint(-10.5F, 9F, -28.5F);
		rightTrackModel[276].rotateAngleZ = -3.14159265F;

		rightTrackModel[277].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackModel[277].setRotationPoint(-13.5F, 9F, -27.5F);
		rightTrackModel[277].rotateAngleZ = -3.14159265F;

		rightTrackModel[278].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackModel[278].setRotationPoint(-13.5F, 9F, -27.5F);
		rightTrackModel[278].rotateAngleZ = -3.14159265F;

		rightTrackModel[279].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightTrackModel[279].setRotationPoint(-13.5F, 9F, -24.5F);
		rightTrackModel[279].rotateAngleZ = -3.14159265F;

		rightTrackModel[280].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 296
		rightTrackModel[280].setRotationPoint(-13.5F, 9F, -23.5F);
		rightTrackModel[280].rotateAngleZ = -3.14159265F;

		rightTrackModel[281].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackModel[281].setRotationPoint(-13.5F, 9F, -21.5F);
		rightTrackModel[281].rotateAngleZ = -3.14159265F;

		rightTrackModel[282].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightTrackModel[282].setRotationPoint(-13.5F, 9F, -19.5F);
		rightTrackModel[282].rotateAngleZ = -3.14159265F;

		rightTrackModel[283].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 299
		rightTrackModel[283].setRotationPoint(-13.5F, 9F, -19.5F);
		rightTrackModel[283].rotateAngleZ = -3.14159265F;

		rightTrackModel[284].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightTrackModel[284].setRotationPoint(-13.5F, 9F, -28.5F);
		rightTrackModel[284].rotateAngleZ = -3.14159265F;

		rightTrackModel[285].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightTrackModel[285].setRotationPoint(-16.5F, 9F, -27.5F);
		rightTrackModel[285].rotateAngleZ = -3.14159265F;

		rightTrackModel[286].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightTrackModel[286].setRotationPoint(-16.5F, 9F, -27.5F);
		rightTrackModel[286].rotateAngleZ = -3.14159265F;

		rightTrackModel[287].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightTrackModel[287].setRotationPoint(-16.5F, 9F, -24.5F);
		rightTrackModel[287].rotateAngleZ = -3.14159265F;

		rightTrackModel[288].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 304
		rightTrackModel[288].setRotationPoint(-16.5F, 9F, -23.5F);
		rightTrackModel[288].rotateAngleZ = -3.14159265F;

		rightTrackModel[289].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightTrackModel[289].setRotationPoint(-16.5F, 9F, -21.5F);
		rightTrackModel[289].rotateAngleZ = -3.14159265F;

		rightTrackModel[290].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightTrackModel[290].setRotationPoint(-16.5F, 9F, -19.5F);
		rightTrackModel[290].rotateAngleZ = -3.14159265F;

		rightTrackModel[291].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 307
		rightTrackModel[291].setRotationPoint(-16.5F, 9F, -19.5F);
		rightTrackModel[291].rotateAngleZ = -3.14159265F;

		rightTrackModel[292].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightTrackModel[292].setRotationPoint(-16.5F, 9F, -28.5F);
		rightTrackModel[292].rotateAngleZ = -3.14159265F;

		rightTrackModel[293].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightTrackModel[293].setRotationPoint(-19.5F, 9F, -27.5F);
		rightTrackModel[293].rotateAngleZ = -3.14159265F;

		rightTrackModel[294].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightTrackModel[294].setRotationPoint(-19.5F, 9F, -27.5F);
		rightTrackModel[294].rotateAngleZ = -3.14159265F;

		rightTrackModel[295].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		rightTrackModel[295].setRotationPoint(-19.5F, 9F, -24.5F);
		rightTrackModel[295].rotateAngleZ = -3.14159265F;

		rightTrackModel[296].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 312
		rightTrackModel[296].setRotationPoint(-19.5F, 9F, -23.5F);
		rightTrackModel[296].rotateAngleZ = -3.14159265F;

		rightTrackModel[297].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightTrackModel[297].setRotationPoint(-19.5F, 9F, -21.5F);
		rightTrackModel[297].rotateAngleZ = -3.14159265F;

		rightTrackModel[298].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightTrackModel[298].setRotationPoint(-19.5F, 9F, -19.5F);
		rightTrackModel[298].rotateAngleZ = -3.14159265F;

		rightTrackModel[299].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315
		rightTrackModel[299].setRotationPoint(-19.5F, 9F, -19.5F);
		rightTrackModel[299].rotateAngleZ = -3.14159265F;

		rightTrackModel[300].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightTrackModel[300].setRotationPoint(-19.5F, 9F, -28.5F);
		rightTrackModel[300].rotateAngleZ = -3.14159265F;

		rightTrackModel[301].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightTrackModel[301].setRotationPoint(-22.5F, 9F, -27.5F);
		rightTrackModel[301].rotateAngleZ = -3.14159265F;

		rightTrackModel[302].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightTrackModel[302].setRotationPoint(-22.5F, 9F, -27.5F);
		rightTrackModel[302].rotateAngleZ = -3.14159265F;

		rightTrackModel[303].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		rightTrackModel[303].setRotationPoint(-22.5F, 9F, -24.5F);
		rightTrackModel[303].rotateAngleZ = -3.14159265F;

		rightTrackModel[304].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 320
		rightTrackModel[304].setRotationPoint(-22.5F, 9F, -23.5F);
		rightTrackModel[304].rotateAngleZ = -3.14159265F;

		rightTrackModel[305].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		rightTrackModel[305].setRotationPoint(-22.5F, 9F, -21.5F);
		rightTrackModel[305].rotateAngleZ = -3.14159265F;

		rightTrackModel[306].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		rightTrackModel[306].setRotationPoint(-22.5F, 9F, -19.5F);
		rightTrackModel[306].rotateAngleZ = -3.14159265F;

		rightTrackModel[307].addShapeBox(2F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 323
		rightTrackModel[307].setRotationPoint(-22.5F, 9F, -19.5F);
		rightTrackModel[307].rotateAngleZ = -3.14159265F;

		rightTrackModel[308].addShapeBox(3F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		rightTrackModel[308].setRotationPoint(-22.5F, 9F, -28.5F);
		rightTrackModel[308].rotateAngleZ = -3.14159265F;

		rightTrackModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		rightTrackModel[309].setRotationPoint(-26.5F, 9F, -27.5F);
		rightTrackModel[309].rotateAngleZ = -3.14159265F;

		rightTrackModel[310].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		rightTrackModel[310].setRotationPoint(-26.5F, 9F, -27.5F);
		rightTrackModel[310].rotateAngleZ = -3.14159265F;

		rightTrackModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		rightTrackModel[311].setRotationPoint(-26.5F, 9F, -24.5F);
		rightTrackModel[311].rotateAngleZ = -3.14159265F;

		rightTrackModel[312].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 328
		rightTrackModel[312].setRotationPoint(-26.5F, 9F, -23.5F);
		rightTrackModel[312].rotateAngleZ = -3.14159265F;

		rightTrackModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		rightTrackModel[313].setRotationPoint(-26.5F, 9F, -21.5F);
		rightTrackModel[313].rotateAngleZ = -3.14159265F;

		rightTrackModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightTrackModel[314].setRotationPoint(-26.5F, 9F, -19.5F);
		rightTrackModel[314].rotateAngleZ = -3.14159265F;

		rightTrackModel[315].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 331
		rightTrackModel[315].setRotationPoint(-26.5F, 9F, -19.5F);
		rightTrackModel[315].rotateAngleZ = -3.14159265F;

		rightTrackModel[316].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		rightTrackModel[316].setRotationPoint(-26.5F, 9F, -28.5F);
		rightTrackModel[316].rotateAngleZ = -3.14159265F;

		rightTrackModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		rightTrackModel[317].setRotationPoint(-29.5F, 9F, -27.5F);
		rightTrackModel[317].rotateAngleZ = -3.14159265F;

		rightTrackModel[318].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightTrackModel[318].setRotationPoint(-29.5F, 9F, -27.5F);
		rightTrackModel[318].rotateAngleZ = -3.14159265F;

		rightTrackModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		rightTrackModel[319].setRotationPoint(-29.5F, 9F, -24.5F);
		rightTrackModel[319].rotateAngleZ = -3.14159265F;

		rightTrackModel[320].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 336
		rightTrackModel[320].setRotationPoint(-29.5F, 9F, -23.5F);
		rightTrackModel[320].rotateAngleZ = -3.14159265F;

		rightTrackModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightTrackModel[321].setRotationPoint(-29.5F, 9F, -21.5F);
		rightTrackModel[321].rotateAngleZ = -3.14159265F;

		rightTrackModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		rightTrackModel[322].setRotationPoint(-29.5F, 9F, -19.5F);
		rightTrackModel[322].rotateAngleZ = -3.14159265F;

		rightTrackModel[323].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 339
		rightTrackModel[323].setRotationPoint(-29.5F, 9F, -19.5F);
		rightTrackModel[323].rotateAngleZ = -3.14159265F;

		rightTrackModel[324].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightTrackModel[324].setRotationPoint(-29.5F, 9F, -28.5F);
		rightTrackModel[324].rotateAngleZ = -3.14159265F;

		rightTrackModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		rightTrackModel[325].setRotationPoint(-32.5F, 9F, -27.5F);
		rightTrackModel[325].rotateAngleZ = -3.14159265F;

		rightTrackModel[326].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		rightTrackModel[326].setRotationPoint(-32.5F, 9F, -27.5F);
		rightTrackModel[326].rotateAngleZ = -3.14159265F;

		rightTrackModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		rightTrackModel[327].setRotationPoint(-32.5F, 9F, -24.5F);
		rightTrackModel[327].rotateAngleZ = -3.14159265F;

		rightTrackModel[328].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 344
		rightTrackModel[328].setRotationPoint(-32.5F, 9F, -23.5F);
		rightTrackModel[328].rotateAngleZ = -3.14159265F;

		rightTrackModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		rightTrackModel[329].setRotationPoint(-32.5F, 9F, -21.5F);
		rightTrackModel[329].rotateAngleZ = -3.14159265F;

		rightTrackModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightTrackModel[330].setRotationPoint(-32.5F, 9F, -19.5F);
		rightTrackModel[330].rotateAngleZ = -3.14159265F;

		rightTrackModel[331].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 347
		rightTrackModel[331].setRotationPoint(-32.5F, 9F, -19.5F);
		rightTrackModel[331].rotateAngleZ = -3.14159265F;

		rightTrackModel[332].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		rightTrackModel[332].setRotationPoint(-32.5F, 9F, -28.5F);
		rightTrackModel[332].rotateAngleZ = -3.14159265F;

		rightTrackModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		rightTrackModel[333].setRotationPoint(-35.5F, 9F, -27.5F);
		rightTrackModel[333].rotateAngleZ = -3.14159265F;

		rightTrackModel[334].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		rightTrackModel[334].setRotationPoint(-35.5F, 9F, -27.5F);
		rightTrackModel[334].rotateAngleZ = -3.14159265F;

		rightTrackModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		rightTrackModel[335].setRotationPoint(-35.5F, 9F, -24.5F);
		rightTrackModel[335].rotateAngleZ = -3.14159265F;

		rightTrackModel[336].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 352
		rightTrackModel[336].setRotationPoint(-35.5F, 9F, -23.5F);
		rightTrackModel[336].rotateAngleZ = -3.14159265F;

		rightTrackModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		rightTrackModel[337].setRotationPoint(-35.5F, 9F, -21.5F);
		rightTrackModel[337].rotateAngleZ = -3.14159265F;

		rightTrackModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		rightTrackModel[338].setRotationPoint(-35.5F, 9F, -19.5F);
		rightTrackModel[338].rotateAngleZ = -3.14159265F;

		rightTrackModel[339].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 355
		rightTrackModel[339].setRotationPoint(-35.5F, 9F, -19.5F);
		rightTrackModel[339].rotateAngleZ = -3.14159265F;

		rightTrackModel[340].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		rightTrackModel[340].setRotationPoint(-35.5F, 9F, -28.5F);
		rightTrackModel[340].rotateAngleZ = -3.14159265F;

		rightTrackModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		rightTrackModel[341].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[341].rotateAngleZ = -3.78736448F;

		rightTrackModel[342].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		rightTrackModel[342].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[342].rotateAngleZ = -3.78736448F;

		rightTrackModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		rightTrackModel[343].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[343].rotateAngleZ = -3.78736448F;

		rightTrackModel[344].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 360
		rightTrackModel[344].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[344].rotateAngleZ = -3.78736448F;

		rightTrackModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		rightTrackModel[345].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[345].rotateAngleZ = -3.78736448F;

		rightTrackModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		rightTrackModel[346].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[346].rotateAngleZ = -3.78736448F;

		rightTrackModel[347].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 363
		rightTrackModel[347].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[347].rotateAngleZ = -3.78736448F;

		rightTrackModel[348].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		rightTrackModel[348].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[348].rotateAngleZ = -3.78736448F;

		rightTrackModel[349].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		rightTrackModel[349].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[349].rotateAngleZ = -3.78736448F;

		rightTrackModel[350].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		rightTrackModel[350].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[350].rotateAngleZ = -3.78736448F;

		rightTrackModel[351].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		rightTrackModel[351].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[351].rotateAngleZ = -3.78736448F;

		rightTrackModel[352].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 368
		rightTrackModel[352].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[352].rotateAngleZ = -3.78736448F;

		rightTrackModel[353].addShapeBox(3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		rightTrackModel[353].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[353].rotateAngleZ = -3.78736448F;

		rightTrackModel[354].addShapeBox(3F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		rightTrackModel[354].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[354].rotateAngleZ = -3.78736448F;

		rightTrackModel[355].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 371
		rightTrackModel[355].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[355].rotateAngleZ = -3.78736448F;

		rightTrackModel[356].addShapeBox(5F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		rightTrackModel[356].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[356].rotateAngleZ = -3.78736448F;

		rightTrackModel[357].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		rightTrackModel[357].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[357].rotateAngleZ = -3.78736448F;

		rightTrackModel[358].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		rightTrackModel[358].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[358].rotateAngleZ = -3.78736448F;

		rightTrackModel[359].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		rightTrackModel[359].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[359].rotateAngleZ = -3.78736448F;

		rightTrackModel[360].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 376
		rightTrackModel[360].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[360].rotateAngleZ = -3.78736448F;

		rightTrackModel[361].addShapeBox(6F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		rightTrackModel[361].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[361].rotateAngleZ = -3.78736448F;

		rightTrackModel[362].addShapeBox(6F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		rightTrackModel[362].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[362].rotateAngleZ = -3.78736448F;

		rightTrackModel[363].addShapeBox(7F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 379
		rightTrackModel[363].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[363].rotateAngleZ = -3.78736448F;

		rightTrackModel[364].addShapeBox(8F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		rightTrackModel[364].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[364].rotateAngleZ = -3.78736448F;

		rightTrackModel[365].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		rightTrackModel[365].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[365].rotateAngleZ = -3.78736448F;

		rightTrackModel[366].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		rightTrackModel[366].setRotationPoint(-38.5F, 9F, -27.5F);
		rightTrackModel[366].rotateAngleZ = -3.78736448F;

		rightTrackModel[367].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		rightTrackModel[367].setRotationPoint(-38.5F, 9F, -24.5F);
		rightTrackModel[367].rotateAngleZ = -3.78736448F;

		rightTrackModel[368].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 384
		rightTrackModel[368].setRotationPoint(-38.5F, 9F, -23.5F);
		rightTrackModel[368].rotateAngleZ = -3.78736448F;

		rightTrackModel[369].addShapeBox(9F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		rightTrackModel[369].setRotationPoint(-38.5F, 9F, -21.5F);
		rightTrackModel[369].rotateAngleZ = -3.78736448F;

		rightTrackModel[370].addShapeBox(9F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		rightTrackModel[370].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[370].rotateAngleZ = -3.78736448F;

		rightTrackModel[371].addShapeBox(10F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 387
		rightTrackModel[371].setRotationPoint(-38.5F, 9F, -19.5F);
		rightTrackModel[371].rotateAngleZ = -3.78736448F;

		rightTrackModel[372].addShapeBox(11F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		rightTrackModel[372].setRotationPoint(-38.5F, 9F, -28.5F);
		rightTrackModel[372].rotateAngleZ = -3.78736448F;

		rightTrackModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		rightTrackModel[373].setRotationPoint(-48F, 1.8F, -27.5F);
		rightTrackModel[373].rotateAngleZ = -4.1887902F;

		rightTrackModel[374].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		rightTrackModel[374].setRotationPoint(-48F, 1.8F, -27.5F);
		rightTrackModel[374].rotateAngleZ = -4.1887902F;

		rightTrackModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		rightTrackModel[375].setRotationPoint(-48F, 1.8F, -24.5F);
		rightTrackModel[375].rotateAngleZ = -4.1887902F;

		rightTrackModel[376].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 392
		rightTrackModel[376].setRotationPoint(-48F, 1.8F, -23.5F);
		rightTrackModel[376].rotateAngleZ = -4.1887902F;

		rightTrackModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		rightTrackModel[377].setRotationPoint(-48F, 1.8F, -21.5F);
		rightTrackModel[377].rotateAngleZ = -4.1887902F;

		rightTrackModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		rightTrackModel[378].setRotationPoint(-48F, 1.8F, -19.5F);
		rightTrackModel[378].rotateAngleZ = -4.1887902F;

		rightTrackModel[379].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 395
		rightTrackModel[379].setRotationPoint(-48F, 1.8F, -19.5F);
		rightTrackModel[379].rotateAngleZ = -4.1887902F;

		rightTrackModel[380].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightTrackModel[380].setRotationPoint(-48F, 1.8F, -28.5F);
		rightTrackModel[380].rotateAngleZ = -4.1887902F;

		rightTrackModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		rightTrackModel[381].setRotationPoint(-49.5F, -0.8F, -27.5F);
		rightTrackModel[381].rotateAngleZ = -4.52040276F;

		rightTrackModel[382].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		rightTrackModel[382].setRotationPoint(-49.5F, -0.8F, -27.5F);
		rightTrackModel[382].rotateAngleZ = -4.52040276F;

		rightTrackModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		rightTrackModel[383].setRotationPoint(-49.5F, -0.8F, -24.5F);
		rightTrackModel[383].rotateAngleZ = -4.52040276F;

		rightTrackModel[384].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 400
		rightTrackModel[384].setRotationPoint(-49.5F, -0.8F, -23.5F);
		rightTrackModel[384].rotateAngleZ = -4.52040276F;

		rightTrackModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightTrackModel[385].setRotationPoint(-49.5F, -0.8F, -21.5F);
		rightTrackModel[385].rotateAngleZ = -4.52040276F;

		rightTrackModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		rightTrackModel[386].setRotationPoint(-49.5F, -0.8F, -19.5F);
		rightTrackModel[386].rotateAngleZ = -4.52040276F;

		rightTrackModel[387].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 403
		rightTrackModel[387].setRotationPoint(-49.5F, -0.8F, -19.5F);
		rightTrackModel[387].rotateAngleZ = -4.52040276F;

		rightTrackModel[388].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		rightTrackModel[388].setRotationPoint(-49.5F, -0.8F, -28.5F);
		rightTrackModel[388].rotateAngleZ = -4.52040276F;

		rightTrackModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		rightTrackModel[389].setRotationPoint(-50F, -3.6F, -27.5F);
		rightTrackModel[389].rotateAngleZ = -4.71238898F;

		rightTrackModel[390].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		rightTrackModel[390].setRotationPoint(-50F, -3.6F, -27.5F);
		rightTrackModel[390].rotateAngleZ = -4.71238898F;

		rightTrackModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		rightTrackModel[391].setRotationPoint(-50F, -3.6F, -24.5F);
		rightTrackModel[391].rotateAngleZ = -4.71238898F;

		rightTrackModel[392].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 408
		rightTrackModel[392].setRotationPoint(-50F, -3.6F, -23.5F);
		rightTrackModel[392].rotateAngleZ = -4.71238898F;

		rightTrackModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		rightTrackModel[393].setRotationPoint(-50F, -3.6F, -21.5F);
		rightTrackModel[393].rotateAngleZ = -4.71238898F;

		rightTrackModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		rightTrackModel[394].setRotationPoint(-50F, -3.6F, -19.5F);
		rightTrackModel[394].rotateAngleZ = -4.71238898F;

		rightTrackModel[395].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 411
		rightTrackModel[395].setRotationPoint(-50F, -3.6F, -19.5F);
		rightTrackModel[395].rotateAngleZ = -4.71238898F;

		rightTrackModel[396].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		rightTrackModel[396].setRotationPoint(-50F, -3.6F, -28.5F);
		rightTrackModel[396].rotateAngleZ = -4.71238898F;

		rightTrackModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		rightTrackModel[397].setRotationPoint(-50F, -6.6F, -27.5F);
		rightTrackModel[397].rotateAngleZ = -5.21853446F;

		rightTrackModel[398].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		rightTrackModel[398].setRotationPoint(-50F, -6.6F, -27.5F);
		rightTrackModel[398].rotateAngleZ = -5.21853446F;

		rightTrackModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		rightTrackModel[399].setRotationPoint(-50F, -6.6F, -24.5F);
		rightTrackModel[399].rotateAngleZ = -5.21853446F;

		rightTrackModel[400].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 416
		rightTrackModel[400].setRotationPoint(-50F, -6.6F, -23.5F);
		rightTrackModel[400].rotateAngleZ = -5.21853446F;

		rightTrackModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		rightTrackModel[401].setRotationPoint(-50F, -6.6F, -21.5F);
		rightTrackModel[401].rotateAngleZ = -5.21853446F;

		rightTrackModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		rightTrackModel[402].setRotationPoint(-50F, -6.6F, -19.5F);
		rightTrackModel[402].rotateAngleZ = -5.21853446F;

		rightTrackModel[403].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 419
		rightTrackModel[403].setRotationPoint(-50F, -6.6F, -19.5F);
		rightTrackModel[403].rotateAngleZ = -5.21853446F;

		rightTrackModel[404].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		rightTrackModel[404].setRotationPoint(-50F, -6.6F, -28.5F);
		rightTrackModel[404].rotateAngleZ = -5.21853446F;

		rightTrackModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		rightTrackModel[405].setRotationPoint(-48.6F, -9.2F, -27.5F);
		rightTrackModel[405].rotateAngleZ = 0.2443461F;

		rightTrackModel[406].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		rightTrackModel[406].setRotationPoint(-48.6F, -9.2F, -27.5F);
		rightTrackModel[406].rotateAngleZ = 0.2443461F;

		rightTrackModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		rightTrackModel[407].setRotationPoint(-48.6F, -9.2F, -24.5F);
		rightTrackModel[407].rotateAngleZ = 0.2443461F;

		rightTrackModel[408].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 424
		rightTrackModel[408].setRotationPoint(-48.6F, -9.2F, -23.5F);
		rightTrackModel[408].rotateAngleZ = 0.2443461F;

		rightTrackModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		rightTrackModel[409].setRotationPoint(-48.6F, -9.2F, -21.5F);
		rightTrackModel[409].rotateAngleZ = 0.2443461F;

		rightTrackModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		rightTrackModel[410].setRotationPoint(-48.6F, -9.2F, -19.5F);
		rightTrackModel[410].rotateAngleZ = 0.2443461F;

		rightTrackModel[411].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 427
		rightTrackModel[411].setRotationPoint(-48.6F, -9.2F, -19.5F);
		rightTrackModel[411].rotateAngleZ = 0.2443461F;

		rightTrackModel[412].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		rightTrackModel[412].setRotationPoint(-48.6F, -9.2F, -28.5F);
		rightTrackModel[412].rotateAngleZ = 0.2443461F;

		rightTrackModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		rightTrackModel[413].setRotationPoint(-46F, -10F, -27.5F);

		rightTrackModel[414].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		rightTrackModel[414].setRotationPoint(-46F, -10F, -27.5F);

		rightTrackModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		rightTrackModel[415].setRotationPoint(-46F, -10F, -24.5F);

		rightTrackModel[416].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 432
		rightTrackModel[416].setRotationPoint(-46F, -10F, -23.5F);

		rightTrackModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		rightTrackModel[417].setRotationPoint(-46F, -10F, -21.5F);

		rightTrackModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightTrackModel[418].setRotationPoint(-46F, -10F, -19.5F);

		rightTrackModel[419].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 435
		rightTrackModel[419].setRotationPoint(-46F, -10F, -19.5F);

		rightTrackModel[420].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		rightTrackModel[420].setRotationPoint(-46F, -10F, -28.5F);

		rightTrackModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		rightTrackModel[421].setRotationPoint(-43F, -10F, -27.5F);

		rightTrackModel[422].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		rightTrackModel[422].setRotationPoint(-43F, -10F, -27.5F);

		rightTrackModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		rightTrackModel[423].setRotationPoint(-43F, -10F, -24.5F);

		rightTrackModel[424].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 440
		rightTrackModel[424].setRotationPoint(-43F, -10F, -23.5F);

		rightTrackModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		rightTrackModel[425].setRotationPoint(-43F, -10F, -21.5F);

		rightTrackModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		rightTrackModel[426].setRotationPoint(-43F, -10F, -19.5F);

		rightTrackModel[427].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 443
		rightTrackModel[427].setRotationPoint(-43F, -10F, -19.5F);

		rightTrackModel[428].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		rightTrackModel[428].setRotationPoint(-43F, -10F, -28.5F);

		rightTrackModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		rightTrackModel[429].setRotationPoint(-40F, -10F, -27.5F);

		rightTrackModel[430].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		rightTrackModel[430].setRotationPoint(-40F, -10F, -27.5F);

		rightTrackModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightTrackModel[431].setRotationPoint(-40F, -10F, -24.5F);

		rightTrackModel[432].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 448
		rightTrackModel[432].setRotationPoint(-40F, -10F, -23.5F);

		rightTrackModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		rightTrackModel[433].setRotationPoint(-40F, -10F, -21.5F);

		rightTrackModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		rightTrackModel[434].setRotationPoint(-40F, -10F, -19.5F);

		rightTrackModel[435].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 451
		rightTrackModel[435].setRotationPoint(-40F, -10F, -19.5F);

		rightTrackModel[436].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		rightTrackModel[436].setRotationPoint(-40F, -10F, -28.5F);

		rightTrackModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		rightTrackModel[437].setRotationPoint(-37F, -10F, -27.5F);

		rightTrackModel[438].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		rightTrackModel[438].setRotationPoint(-37F, -10F, -27.5F);

		rightTrackModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		rightTrackModel[439].setRotationPoint(-37F, -10F, -24.5F);

		rightTrackModel[440].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 456
		rightTrackModel[440].setRotationPoint(-37F, -10F, -23.5F);

		rightTrackModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		rightTrackModel[441].setRotationPoint(-37F, -10F, -21.5F);

		rightTrackModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		rightTrackModel[442].setRotationPoint(-37F, -10F, -19.5F);

		rightTrackModel[443].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 459
		rightTrackModel[443].setRotationPoint(-37F, -10F, -19.5F);

		rightTrackModel[444].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		rightTrackModel[444].setRotationPoint(-37F, -10F, -28.5F);

		rightTrackModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackModel[445].setRotationPoint(-34F, -10F, -27.5F);

		rightTrackModel[446].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		rightTrackModel[446].setRotationPoint(-34F, -10F, -27.5F);

		rightTrackModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightTrackModel[447].setRotationPoint(-34F, -10F, -24.5F);

		rightTrackModel[448].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 464
		rightTrackModel[448].setRotationPoint(-34F, -10F, -23.5F);

		rightTrackModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightTrackModel[449].setRotationPoint(-34F, -10F, -21.5F);

		rightTrackModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightTrackModel[450].setRotationPoint(-34F, -10F, -19.5F);

		rightTrackModel[451].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 467
		rightTrackModel[451].setRotationPoint(-34F, -10F, -19.5F);

		rightTrackModel[452].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		rightTrackModel[452].setRotationPoint(-34F, -10F, -28.5F);

		rightTrackModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightTrackModel[453].setRotationPoint(-31F, -10F, -27.5F);

		rightTrackModel[454].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightTrackModel[454].setRotationPoint(-31F, -10F, -27.5F);

		rightTrackModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		rightTrackModel[455].setRotationPoint(-31F, -10F, -24.5F);

		rightTrackModel[456].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 472
		rightTrackModel[456].setRotationPoint(-31F, -10F, -23.5F);

		rightTrackModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightTrackModel[457].setRotationPoint(-31F, -10F, -21.5F);

		rightTrackModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightTrackModel[458].setRotationPoint(-31F, -10F, -19.5F);

		rightTrackModel[459].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 475
		rightTrackModel[459].setRotationPoint(-31F, -10F, -19.5F);

		rightTrackModel[460].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		rightTrackModel[460].setRotationPoint(-31F, -10F, -28.5F);

		rightTrackModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		rightTrackModel[461].setRotationPoint(-28F, -10F, -27.5F);

		rightTrackModel[462].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		rightTrackModel[462].setRotationPoint(-28F, -10F, -27.5F);

		rightTrackModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		rightTrackModel[463].setRotationPoint(-28F, -10F, -24.5F);

		rightTrackModel[464].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 480
		rightTrackModel[464].setRotationPoint(-28F, -10F, -23.5F);

		rightTrackModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightTrackModel[465].setRotationPoint(-28F, -10F, -21.5F);

		rightTrackModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		rightTrackModel[466].setRotationPoint(-28F, -10F, -19.5F);

		rightTrackModel[467].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 483
		rightTrackModel[467].setRotationPoint(-28F, -10F, -19.5F);

		rightTrackModel[468].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		rightTrackModel[468].setRotationPoint(-28F, -10F, -28.5F);

		rightTrackModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		rightTrackModel[469].setRotationPoint(-25F, -10F, -27.5F);

		rightTrackModel[470].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		rightTrackModel[470].setRotationPoint(-25F, -10F, -27.5F);

		rightTrackModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		rightTrackModel[471].setRotationPoint(-25F, -10F, -24.5F);

		rightTrackModel[472].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 488
		rightTrackModel[472].setRotationPoint(-25F, -10F, -23.5F);

		rightTrackModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		rightTrackModel[473].setRotationPoint(-25F, -10F, -21.5F);

		rightTrackModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		rightTrackModel[474].setRotationPoint(-25F, -10F, -19.5F);

		rightTrackModel[475].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 491
		rightTrackModel[475].setRotationPoint(-25F, -10F, -19.5F);

		rightTrackModel[476].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		rightTrackModel[476].setRotationPoint(-25F, -10F, -28.5F);

		rightTrackModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightTrackModel[477].setRotationPoint(-22F, -10F, -27.5F);

		rightTrackModel[478].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		rightTrackModel[478].setRotationPoint(-22F, -10F, -27.5F);

		rightTrackModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		rightTrackModel[479].setRotationPoint(-22F, -10F, -24.5F);

		rightTrackModel[480].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 496
		rightTrackModel[480].setRotationPoint(-22F, -10F, -23.5F);

		rightTrackModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		rightTrackModel[481].setRotationPoint(-22F, -10F, -21.5F);

		rightTrackModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightTrackModel[482].setRotationPoint(-22F, -10F, -19.5F);

		rightTrackModel[483].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 499
		rightTrackModel[483].setRotationPoint(-22F, -10F, -19.5F);

		rightTrackModel[484].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		rightTrackModel[484].setRotationPoint(-22F, -10F, -28.5F);

		rightTrackModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightTrackModel[485].setRotationPoint(-19F, -10F, -27.5F);

		rightTrackModel[486].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		rightTrackModel[486].setRotationPoint(-19F, -10F, -27.5F);

		rightTrackModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightTrackModel[487].setRotationPoint(-19F, -10F, -24.5F);

		rightTrackModel[488].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
		rightTrackModel[488].setRotationPoint(-19F, -10F, -23.5F);

		rightTrackModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightTrackModel[489].setRotationPoint(-19F, -10F, -21.5F);

		rightTrackModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		rightTrackModel[490].setRotationPoint(-19F, -10F, -19.5F);

		rightTrackModel[491].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 507
		rightTrackModel[491].setRotationPoint(-19F, -10F, -19.5F);

		rightTrackModel[492].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		rightTrackModel[492].setRotationPoint(-19F, -10F, -28.5F);

		rightTrackModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		rightTrackModel[493].setRotationPoint(-16F, -10F, -27.5F);

		rightTrackModel[494].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		rightTrackModel[494].setRotationPoint(-16F, -10F, -27.5F);

		rightTrackModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		rightTrackModel[495].setRotationPoint(-16F, -10F, -24.5F);

		rightTrackModel[496].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 512
		rightTrackModel[496].setRotationPoint(-16F, -10F, -23.5F);

		rightTrackModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		rightTrackModel[497].setRotationPoint(-16F, -10F, -21.5F);

		rightTrackModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		rightTrackModel[498].setRotationPoint(-16F, -10F, -19.5F);

		rightTrackModel[499].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 515
		rightTrackModel[499].setRotationPoint(-16F, -10F, -19.5F);
	}

	private void initrightTrackModel_2()
	{
		rightTrackModel[500] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 516
		rightTrackModel[501] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 517
		rightTrackModel[502] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 518
		rightTrackModel[503] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 519
		rightTrackModel[504] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 520
		rightTrackModel[505] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 521
		rightTrackModel[506] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 522
		rightTrackModel[507] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 523
		rightTrackModel[508] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 524
		rightTrackModel[509] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 525
		rightTrackModel[510] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 526
		rightTrackModel[511] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 527
		rightTrackModel[512] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 528
		rightTrackModel[513] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 529
		rightTrackModel[514] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 530
		rightTrackModel[515] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 531
		rightTrackModel[516] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 532
		rightTrackModel[517] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 533
		rightTrackModel[518] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 534
		rightTrackModel[519] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 535
		rightTrackModel[520] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 536
		rightTrackModel[521] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 537
		rightTrackModel[522] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 538
		rightTrackModel[523] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 539
		rightTrackModel[524] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 540
		rightTrackModel[525] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 541
		rightTrackModel[526] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 542
		rightTrackModel[527] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 543
		rightTrackModel[528] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 544
		rightTrackModel[529] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 545
		rightTrackModel[530] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 546
		rightTrackModel[531] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 547
		rightTrackModel[532] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 548
		rightTrackModel[533] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 549
		rightTrackModel[534] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 550
		rightTrackModel[535] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 551
		rightTrackModel[536] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 552
		rightTrackModel[537] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 553
		rightTrackModel[538] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 554
		rightTrackModel[539] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 555
		rightTrackModel[540] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 556
		rightTrackModel[541] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 557
		rightTrackModel[542] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 558
		rightTrackModel[543] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 559
		rightTrackModel[544] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 560
		rightTrackModel[545] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 561
		rightTrackModel[546] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 562
		rightTrackModel[547] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 563
		rightTrackModel[548] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 564
		rightTrackModel[549] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 565
		rightTrackModel[550] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 566
		rightTrackModel[551] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 567
		rightTrackModel[552] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 568
		rightTrackModel[553] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 569
		rightTrackModel[554] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 570
		rightTrackModel[555] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 571
		rightTrackModel[556] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 572
		rightTrackModel[557] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 573
		rightTrackModel[558] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 574
		rightTrackModel[559] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 575
		rightTrackModel[560] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 576
		rightTrackModel[561] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 577
		rightTrackModel[562] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 578
		rightTrackModel[563] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 579
		rightTrackModel[564] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 580
		rightTrackModel[565] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 581
		rightTrackModel[566] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 582
		rightTrackModel[567] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 583
		rightTrackModel[568] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 584
		rightTrackModel[569] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 585
		rightTrackModel[570] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 586
		rightTrackModel[571] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 587
		rightTrackModel[572] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 588
		rightTrackModel[573] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 589
		rightTrackModel[574] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 590
		rightTrackModel[575] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 591
		rightTrackModel[576] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 592
		rightTrackModel[577] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 593
		rightTrackModel[578] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 594
		rightTrackModel[579] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 595
		rightTrackModel[580] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 596
		rightTrackModel[581] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 597
		rightTrackModel[582] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 598
		rightTrackModel[583] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 599
		rightTrackModel[584] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 600
		rightTrackModel[585] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 601
		rightTrackModel[586] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 602
		rightTrackModel[587] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 603
		rightTrackModel[588] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 604
		rightTrackModel[589] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 605
		rightTrackModel[590] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 606
		rightTrackModel[591] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 607
		rightTrackModel[592] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 608
		rightTrackModel[593] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 609
		rightTrackModel[594] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 610
		rightTrackModel[595] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 611
		rightTrackModel[596] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 612
		rightTrackModel[597] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 613
		rightTrackModel[598] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 614
		rightTrackModel[599] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 615
		rightTrackModel[600] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 616
		rightTrackModel[601] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 617
		rightTrackModel[602] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 618
		rightTrackModel[603] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 619
		rightTrackModel[604] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 620
		rightTrackModel[605] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 621
		rightTrackModel[606] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 622
		rightTrackModel[607] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 623
		rightTrackModel[608] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 624
		rightTrackModel[609] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 625
		rightTrackModel[610] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 626
		rightTrackModel[611] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 627
		rightTrackModel[612] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 628
		rightTrackModel[613] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 629
		rightTrackModel[614] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 630
		rightTrackModel[615] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 631
		rightTrackModel[616] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 632
		rightTrackModel[617] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 633
		rightTrackModel[618] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 634
		rightTrackModel[619] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 635
		rightTrackModel[620] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 636
		rightTrackModel[621] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 637
		rightTrackModel[622] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 638
		rightTrackModel[623] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 639
		rightTrackModel[624] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 640
		rightTrackModel[625] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 641
		rightTrackModel[626] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 642
		rightTrackModel[627] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 643
		rightTrackModel[628] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 644
		rightTrackModel[629] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 645
		rightTrackModel[630] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 646
		rightTrackModel[631] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 647
		rightTrackModel[632] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 648
		rightTrackModel[633] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 649
		rightTrackModel[634] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 650
		rightTrackModel[635] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 651
		rightTrackModel[636] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 652
		rightTrackModel[637] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 653
		rightTrackModel[638] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 654
		rightTrackModel[639] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 655
		rightTrackModel[640] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 656
		rightTrackModel[641] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 657
		rightTrackModel[642] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 658
		rightTrackModel[643] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 659
		rightTrackModel[644] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 660
		rightTrackModel[645] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 661
		rightTrackModel[646] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 662
		rightTrackModel[647] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 663
		rightTrackModel[648] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 664
		rightTrackModel[649] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 665
		rightTrackModel[650] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 666
		rightTrackModel[651] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 667
		rightTrackModel[652] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 668
		rightTrackModel[653] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 669
		rightTrackModel[654] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 670
		rightTrackModel[655] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 671
		rightTrackModel[656] = new ModelRendererTurbo(this, 1000, 140, textureX, textureY); // Box 672
		rightTrackModel[657] = new ModelRendererTurbo(this, 1000, 150, textureX, textureY); // Box 673
		rightTrackModel[658] = new ModelRendererTurbo(this, 1000, 100, textureX, textureY); // Box 674
		rightTrackModel[659] = new ModelRendererTurbo(this, 1000, 110, textureX, textureY); // Box 675
		rightTrackModel[660] = new ModelRendererTurbo(this, 1000, 120, textureX, textureY); // Box 676

		rightTrackModel[500].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		rightTrackModel[500].setRotationPoint(-16F, -10F, -28.5F);

		rightTrackModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		rightTrackModel[501].setRotationPoint(-13F, -10F, -27.5F);

		rightTrackModel[502].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightTrackModel[502].setRotationPoint(-13F, -10F, -27.5F);

		rightTrackModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		rightTrackModel[503].setRotationPoint(-13F, -10F, -24.5F);

		rightTrackModel[504].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 520
		rightTrackModel[504].setRotationPoint(-13F, -10F, -23.5F);

		rightTrackModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		rightTrackModel[505].setRotationPoint(-13F, -10F, -21.5F);

		rightTrackModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		rightTrackModel[506].setRotationPoint(-13F, -10F, -19.5F);

		rightTrackModel[507].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 523
		rightTrackModel[507].setRotationPoint(-13F, -10F, -19.5F);

		rightTrackModel[508].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		rightTrackModel[508].setRotationPoint(-13F, -10F, -28.5F);

		rightTrackModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightTrackModel[509].setRotationPoint(-10F, -10F, -27.5F);

		rightTrackModel[510].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		rightTrackModel[510].setRotationPoint(-10F, -10F, -27.5F);

		rightTrackModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightTrackModel[511].setRotationPoint(-10F, -10F, -24.5F);

		rightTrackModel[512].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 528
		rightTrackModel[512].setRotationPoint(-10F, -10F, -23.5F);

		rightTrackModel[513].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		rightTrackModel[513].setRotationPoint(-10F, -10F, -21.5F);

		rightTrackModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		rightTrackModel[514].setRotationPoint(-10F, -10F, -19.5F);

		rightTrackModel[515].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 531
		rightTrackModel[515].setRotationPoint(-10F, -10F, -19.5F);

		rightTrackModel[516].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		rightTrackModel[516].setRotationPoint(-10F, -10F, -28.5F);

		rightTrackModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightTrackModel[517].setRotationPoint(-7F, -10F, -27.5F);

		rightTrackModel[518].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		rightTrackModel[518].setRotationPoint(-7F, -10F, -27.5F);

		rightTrackModel[519].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		rightTrackModel[519].setRotationPoint(-7F, -10F, -24.5F);

		rightTrackModel[520].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 536
		rightTrackModel[520].setRotationPoint(-7F, -10F, -23.5F);

		rightTrackModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		rightTrackModel[521].setRotationPoint(-7F, -10F, -21.5F);

		rightTrackModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		rightTrackModel[522].setRotationPoint(-7F, -10F, -19.5F);

		rightTrackModel[523].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 539
		rightTrackModel[523].setRotationPoint(-7F, -10F, -19.5F);

		rightTrackModel[524].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		rightTrackModel[524].setRotationPoint(-7F, -10F, -28.5F);

		rightTrackModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		rightTrackModel[525].setRotationPoint(-4F, -10F, -27.5F);

		rightTrackModel[526].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		rightTrackModel[526].setRotationPoint(-4F, -10F, -27.5F);

		rightTrackModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		rightTrackModel[527].setRotationPoint(-4F, -10F, -24.5F);

		rightTrackModel[528].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 544
		rightTrackModel[528].setRotationPoint(-4F, -10F, -23.5F);

		rightTrackModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		rightTrackModel[529].setRotationPoint(-4F, -10F, -21.5F);

		rightTrackModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		rightTrackModel[530].setRotationPoint(-4F, -10F, -19.5F);

		rightTrackModel[531].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 547
		rightTrackModel[531].setRotationPoint(-4F, -10F, -19.5F);

		rightTrackModel[532].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		rightTrackModel[532].setRotationPoint(-4F, -10F, -28.5F);

		rightTrackModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		rightTrackModel[533].setRotationPoint(-1F, -10F, -27.5F);

		rightTrackModel[534].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		rightTrackModel[534].setRotationPoint(-1F, -10F, -27.5F);

		rightTrackModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		rightTrackModel[535].setRotationPoint(-1F, -10F, -24.5F);

		rightTrackModel[536].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 552
		rightTrackModel[536].setRotationPoint(-1F, -10F, -23.5F);

		rightTrackModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		rightTrackModel[537].setRotationPoint(-1F, -10F, -21.5F);

		rightTrackModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		rightTrackModel[538].setRotationPoint(-1F, -10F, -19.5F);

		rightTrackModel[539].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 555
		rightTrackModel[539].setRotationPoint(-1F, -10F, -19.5F);

		rightTrackModel[540].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		rightTrackModel[540].setRotationPoint(-1F, -10F, -28.5F);

		rightTrackModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		rightTrackModel[541].setRotationPoint(2F, -10F, -27.5F);

		rightTrackModel[542].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		rightTrackModel[542].setRotationPoint(2F, -10F, -27.5F);

		rightTrackModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightTrackModel[543].setRotationPoint(2F, -10F, -24.5F);

		rightTrackModel[544].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 560
		rightTrackModel[544].setRotationPoint(2F, -10F, -23.5F);

		rightTrackModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		rightTrackModel[545].setRotationPoint(2F, -10F, -21.5F);

		rightTrackModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		rightTrackModel[546].setRotationPoint(2F, -10F, -19.5F);

		rightTrackModel[547].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 563
		rightTrackModel[547].setRotationPoint(2F, -10F, -19.5F);

		rightTrackModel[548].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		rightTrackModel[548].setRotationPoint(2F, -10F, -28.5F);

		rightTrackModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		rightTrackModel[549].setRotationPoint(5F, -10F, -27.5F);

		rightTrackModel[550].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		rightTrackModel[550].setRotationPoint(5F, -10F, -27.5F);

		rightTrackModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		rightTrackModel[551].setRotationPoint(5F, -10F, -24.5F);

		rightTrackModel[552].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 568
		rightTrackModel[552].setRotationPoint(5F, -10F, -23.5F);

		rightTrackModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightTrackModel[553].setRotationPoint(5F, -10F, -21.5F);

		rightTrackModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		rightTrackModel[554].setRotationPoint(5F, -10F, -19.5F);

		rightTrackModel[555].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 571
		rightTrackModel[555].setRotationPoint(5F, -10F, -19.5F);

		rightTrackModel[556].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		rightTrackModel[556].setRotationPoint(5F, -10F, -28.5F);

		rightTrackModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		rightTrackModel[557].setRotationPoint(8F, -10F, -27.5F);

		rightTrackModel[558].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		rightTrackModel[558].setRotationPoint(8F, -10F, -27.5F);

		rightTrackModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		rightTrackModel[559].setRotationPoint(8F, -10F, -24.5F);

		rightTrackModel[560].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 576
		rightTrackModel[560].setRotationPoint(8F, -10F, -23.5F);

		rightTrackModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		rightTrackModel[561].setRotationPoint(8F, -10F, -21.5F);

		rightTrackModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		rightTrackModel[562].setRotationPoint(8F, -10F, -19.5F);

		rightTrackModel[563].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 579
		rightTrackModel[563].setRotationPoint(8F, -10F, -19.5F);

		rightTrackModel[564].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		rightTrackModel[564].setRotationPoint(8F, -10F, -28.5F);

		rightTrackModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		rightTrackModel[565].setRotationPoint(11F, -10F, -27.5F);

		rightTrackModel[566].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		rightTrackModel[566].setRotationPoint(11F, -10F, -27.5F);

		rightTrackModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		rightTrackModel[567].setRotationPoint(11F, -10F, -24.5F);

		rightTrackModel[568].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 584
		rightTrackModel[568].setRotationPoint(11F, -10F, -23.5F);

		rightTrackModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		rightTrackModel[569].setRotationPoint(11F, -10F, -21.5F);

		rightTrackModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		rightTrackModel[570].setRotationPoint(11F, -10F, -19.5F);

		rightTrackModel[571].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 587
		rightTrackModel[571].setRotationPoint(11F, -10F, -19.5F);

		rightTrackModel[572].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightTrackModel[572].setRotationPoint(11F, -10F, -28.5F);

		rightTrackModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		rightTrackModel[573].setRotationPoint(14F, -10F, -27.5F);

		rightTrackModel[574].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		rightTrackModel[574].setRotationPoint(14F, -10F, -27.5F);

		rightTrackModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		rightTrackModel[575].setRotationPoint(14F, -10F, -24.5F);

		rightTrackModel[576].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 592
		rightTrackModel[576].setRotationPoint(14F, -10F, -23.5F);

		rightTrackModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightTrackModel[577].setRotationPoint(14F, -10F, -21.5F);

		rightTrackModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		rightTrackModel[578].setRotationPoint(14F, -10F, -19.5F);

		rightTrackModel[579].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 595
		rightTrackModel[579].setRotationPoint(14F, -10F, -19.5F);

		rightTrackModel[580].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		rightTrackModel[580].setRotationPoint(14F, -10F, -28.5F);

		rightTrackModel[581].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		rightTrackModel[581].setRotationPoint(17F, -10F, -27.5F);

		rightTrackModel[582].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		rightTrackModel[582].setRotationPoint(17F, -10F, -27.5F);

		rightTrackModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		rightTrackModel[583].setRotationPoint(17F, -10F, -24.5F);

		rightTrackModel[584].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 600
		rightTrackModel[584].setRotationPoint(17F, -10F, -23.5F);

		rightTrackModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		rightTrackModel[585].setRotationPoint(17F, -10F, -21.5F);

		rightTrackModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		rightTrackModel[586].setRotationPoint(17F, -10F, -19.5F);

		rightTrackModel[587].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 603
		rightTrackModel[587].setRotationPoint(17F, -10F, -19.5F);

		rightTrackModel[588].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		rightTrackModel[588].setRotationPoint(17F, -10F, -28.5F);

		rightTrackModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		rightTrackModel[589].setRotationPoint(20F, -10F, -27.5F);

		rightTrackModel[590].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		rightTrackModel[590].setRotationPoint(20F, -10F, -27.5F);

		rightTrackModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		rightTrackModel[591].setRotationPoint(20F, -10F, -24.5F);

		rightTrackModel[592].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 608
		rightTrackModel[592].setRotationPoint(20F, -10F, -23.5F);

		rightTrackModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		rightTrackModel[593].setRotationPoint(20F, -10F, -21.5F);

		rightTrackModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		rightTrackModel[594].setRotationPoint(20F, -10F, -19.5F);

		rightTrackModel[595].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 611
		rightTrackModel[595].setRotationPoint(20F, -10F, -19.5F);

		rightTrackModel[596].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		rightTrackModel[596].setRotationPoint(20F, -10F, -28.5F);

		rightTrackModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		rightTrackModel[597].setRotationPoint(23F, -10F, -27.5F);

		rightTrackModel[598].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		rightTrackModel[598].setRotationPoint(23F, -10F, -27.5F);

		rightTrackModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		rightTrackModel[599].setRotationPoint(23F, -10F, -24.5F);

		rightTrackModel[600].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 616
		rightTrackModel[600].setRotationPoint(23F, -10F, -23.5F);

		rightTrackModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		rightTrackModel[601].setRotationPoint(23F, -10F, -21.5F);

		rightTrackModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		rightTrackModel[602].setRotationPoint(23F, -10F, -19.5F);

		rightTrackModel[603].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 619
		rightTrackModel[603].setRotationPoint(23F, -10F, -19.5F);

		rightTrackModel[604].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		rightTrackModel[604].setRotationPoint(23F, -10F, -28.5F);

		rightTrackModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		rightTrackModel[605].setRotationPoint(26F, -10F, -27.5F);

		rightTrackModel[606].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		rightTrackModel[606].setRotationPoint(26F, -10F, -27.5F);

		rightTrackModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		rightTrackModel[607].setRotationPoint(26F, -10F, -24.5F);

		rightTrackModel[608].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 624
		rightTrackModel[608].setRotationPoint(26F, -10F, -23.5F);

		rightTrackModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		rightTrackModel[609].setRotationPoint(26F, -10F, -21.5F);

		rightTrackModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		rightTrackModel[610].setRotationPoint(26F, -10F, -19.5F);

		rightTrackModel[611].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 627
		rightTrackModel[611].setRotationPoint(26F, -10F, -19.5F);

		rightTrackModel[612].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		rightTrackModel[612].setRotationPoint(26F, -10F, -28.5F);

		rightTrackModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		rightTrackModel[613].setRotationPoint(29F, -10F, -27.5F);

		rightTrackModel[614].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		rightTrackModel[614].setRotationPoint(29F, -10F, -27.5F);

		rightTrackModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		rightTrackModel[615].setRotationPoint(29F, -10F, -24.5F);

		rightTrackModel[616].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 632
		rightTrackModel[616].setRotationPoint(29F, -10F, -23.5F);

		rightTrackModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 633
		rightTrackModel[617].setRotationPoint(29F, -10F, -21.5F);

		rightTrackModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 634
		rightTrackModel[618].setRotationPoint(29F, -10F, -19.5F);

		rightTrackModel[619].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 635
		rightTrackModel[619].setRotationPoint(29F, -10F, -19.5F);

		rightTrackModel[620].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		rightTrackModel[620].setRotationPoint(29F, -10F, -28.5F);

		rightTrackModel[621].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		rightTrackModel[621].setRotationPoint(32F, -10F, -27.5F);

		rightTrackModel[622].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		rightTrackModel[622].setRotationPoint(32F, -10F, -27.5F);

		rightTrackModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		rightTrackModel[623].setRotationPoint(32F, -10F, -24.5F);

		rightTrackModel[624].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 640
		rightTrackModel[624].setRotationPoint(32F, -10F, -23.5F);

		rightTrackModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		rightTrackModel[625].setRotationPoint(32F, -10F, -21.5F);

		rightTrackModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		rightTrackModel[626].setRotationPoint(32F, -10F, -19.5F);

		rightTrackModel[627].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 643
		rightTrackModel[627].setRotationPoint(32F, -10F, -19.5F);

		rightTrackModel[628].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		rightTrackModel[628].setRotationPoint(32F, -10F, -28.5F);

		rightTrackModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		rightTrackModel[629].setRotationPoint(35F, -10F, -27.5F);

		rightTrackModel[630].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		rightTrackModel[630].setRotationPoint(35F, -10F, -27.5F);

		rightTrackModel[631].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		rightTrackModel[631].setRotationPoint(35F, -10F, -24.5F);

		rightTrackModel[632].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 648
		rightTrackModel[632].setRotationPoint(35F, -10F, -23.5F);

		rightTrackModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		rightTrackModel[633].setRotationPoint(35F, -10F, -21.5F);

		rightTrackModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		rightTrackModel[634].setRotationPoint(35F, -10F, -19.5F);

		rightTrackModel[635].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 651
		rightTrackModel[635].setRotationPoint(35F, -10F, -19.5F);

		rightTrackModel[636].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		rightTrackModel[636].setRotationPoint(35F, -10F, -28.5F);

		rightTrackModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		rightTrackModel[637].setRotationPoint(38F, -10F, -27.5F);

		rightTrackModel[638].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		rightTrackModel[638].setRotationPoint(38F, -10F, -27.5F);

		rightTrackModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		rightTrackModel[639].setRotationPoint(38F, -10F, -24.5F);

		rightTrackModel[640].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 656
		rightTrackModel[640].setRotationPoint(38F, -10F, -23.5F);

		rightTrackModel[641].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		rightTrackModel[641].setRotationPoint(38F, -10F, -21.5F);

		rightTrackModel[642].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		rightTrackModel[642].setRotationPoint(38F, -10F, -19.5F);

		rightTrackModel[643].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 659
		rightTrackModel[643].setRotationPoint(38F, -10F, -19.5F);

		rightTrackModel[644].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		rightTrackModel[644].setRotationPoint(38F, -10F, -28.5F);

		rightTrackModel[645].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		rightTrackModel[645].setRotationPoint(41F, -10F, -27.5F);

		rightTrackModel[646].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		rightTrackModel[646].setRotationPoint(41F, -10F, -27.5F);

		rightTrackModel[647].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 663
		rightTrackModel[647].setRotationPoint(41F, -10F, -24.5F);

		rightTrackModel[648].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 664
		rightTrackModel[648].setRotationPoint(41F, -10F, -23.5F);

		rightTrackModel[649].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		rightTrackModel[649].setRotationPoint(41F, -10F, -21.5F);

		rightTrackModel[650].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		rightTrackModel[650].setRotationPoint(41F, -10F, -19.5F);

		rightTrackModel[651].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 667
		rightTrackModel[651].setRotationPoint(41F, -10F, -19.5F);

		rightTrackModel[652].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		rightTrackModel[652].setRotationPoint(41F, -10F, -28.5F);

		rightTrackModel[653].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 669
		rightTrackModel[653].setRotationPoint(44F, -10F, -27.5F);

		rightTrackModel[654].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		rightTrackModel[654].setRotationPoint(45F, -10F, -27.5F);

		rightTrackModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 671
		rightTrackModel[655].setRotationPoint(44F, -10F, -24.5F);

		rightTrackModel[656].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 672
		rightTrackModel[656].setRotationPoint(45F, -10F, -23.5F);

		rightTrackModel[657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 673
		rightTrackModel[657].setRotationPoint(44F, -10F, -21.5F);

		rightTrackModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 674
		rightTrackModel[658].setRotationPoint(44F, -10F, -19.5F);

		rightTrackModel[659].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 675
		rightTrackModel[659].setRotationPoint(45F, -10F, -19.5F);

		rightTrackModel[660].addShapeBox(2F, -1F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		rightTrackModel[660].setRotationPoint(45F, -10F, -28.5F);
	}
}