package ai.dragonvalley;

import l2f.commons.util.Rnd;
import l2f.gameserver.ai.CtrlEvent;
import l2f.gameserver.ai.Fighter;
import l2f.gameserver.model.Creature;
import l2f.gameserver.model.instances.NpcInstance;
import l2f.gameserver.utils.NpcUtils;

public class DragonKnight extends Fighter
{
	public DragonKnight(NpcInstance actor)
	{
		super(actor);
	}

	@Override
	protected void onEvtDead(Creature killer)
	{
		super.onEvtDead(killer);
		switch (getActor().getNpcId())
		{
			case 22844:
				if (Rnd.chance(50))
				{
					NpcInstance n = NpcUtils.spawnSingle(22845, getActor().getLoc());
					n.getAI().notifyEvent(CtrlEvent.EVT_AGGRESSION, killer, 2);
				}
				break;
			case 22845:
				if (Rnd.chance(50))
				{
					NpcInstance n = NpcUtils.spawnSingle(22846, getActor().getLoc());
					n.getAI().notifyEvent(CtrlEvent.EVT_AGGRESSION, killer, 2);
				}
				break;
		}

	}
}