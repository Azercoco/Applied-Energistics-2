/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2015, AlgorithmX2, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.me.cells;

import net.minecraft.world.item.ItemStack;

import appeng.api.storage.cells.ICellHandler;
import appeng.api.storage.cells.ICellInventory;
import appeng.api.storage.cells.ISaveProvider;
import appeng.items.storage.CreativeCellItem;

/**
 * Cell handler for creative storage cells (both fluid and item), which do not allow item insertion.
 */
public class CreativeCellHandler implements ICellHandler {
    @Override
    public boolean isCell(ItemStack is) {
        return !is.isEmpty() && is.getItem() instanceof CreativeCellItem;
    }

    @Override
    public ICellInventory<?> getCellInventory(ItemStack is, ISaveProvider container) {
        if (!is.isEmpty() && is.getItem() instanceof CreativeCellItem creativeCellItem) {
            return new CreativeCellInventory<>(creativeCellItem.getChannel(), is);
        }
        return null;
    }
}
