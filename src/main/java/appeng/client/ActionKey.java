/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2021, TeamAppliedEnergistics, All rights reserved.
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

package appeng.client;

import java.util.Locale;

import org.lwjgl.glfw.GLFW;

public enum ActionKey {
    TOGGLE_FOCUS(GLFW.GLFW_KEY_TAB);

    private final int defaultKey;

    ActionKey(int defaultKey) {
        this.defaultKey = defaultKey;
    }

    public String getTranslationKey() {
        return "key." + this.name().toLowerCase(Locale.ROOT) + ".desc";
    }

    public int getDefaultKey() {
        return this.defaultKey;
    }
}
