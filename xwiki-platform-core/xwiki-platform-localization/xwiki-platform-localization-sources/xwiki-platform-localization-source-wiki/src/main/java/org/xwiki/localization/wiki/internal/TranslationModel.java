package org.xwiki.localization.wiki.internal;

import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

public interface TranslationModel
{
    EntityReference TRANSLATIONCLASS_REFERENCE = new EntityReference("TranslationClass", EntityType.DOCUMENT,
        new EntityReference("XWiki", EntityType.SPACE));

    String TRANSLATIONCLASS_REFERENCE_STRING = "XWiki.TranslationClass";

    String TRANSLATIONCLASS_PROP_SCOPE = "scope";

    enum Scope
    {
        GLOBAL,
        WIKI,
        USER
    }
}
