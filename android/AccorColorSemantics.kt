package com.accor.designsystem.compose

import androidx.compose.runtime.Composable
import com.accor.designsystem.compose.AccorColor.getColor

object AccorColorSemantics {

    val BrandLogos
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey0, dark = AccorColorPrimitives.Grey100)
    val LoyaltyContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue95, dark = AccorColorPrimitives.RoyalBlue8)
    val LoyaltyContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue86, dark = AccorColorPrimitives.RoyalBlue20)
    val OnLoyaltyContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue30, dark = AccorColorPrimitives.Grey100)
    val OnLoyaltyContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue30, dark = AccorColorPrimitives.Grey100)
    val Loyalty
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue45, dark = AccorColorPrimitives.RoyalBlue75)
    val OnLoyalty
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.RoyalBlue8)
    val OutlineLoyalty
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue45, dark = AccorColorPrimitives.RoyalBlue45)
    val PrimaryContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos98, dark = AccorColorPrimitives.Stratos2)
    val PrimaryContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos94, dark = AccorColorPrimitives.Stratos13)
    val Primary
        @Composable
        get() = getColor(light = AccorColorPrimitives.Yellow85, dark = AccorColorPrimitives.Stratos96)
    val OnPrimary
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos98, dark = AccorColorPrimitives.Stratos2)
    val OnPrimaryContainer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos13, dark = AccorColorPrimitives.Tropos94)
    val OutlinePrimaryHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos2, dark = AccorColorPrimitives.Stratos96)
    val OutlinePrimaryLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos75, dark = AccorColorPrimitives.Stratos75)
    val SecondaryContainer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos94, dark = AccorColorPrimitives.Tropos13)
    val OnSecondaryContainer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos13, dark = AccorColorPrimitives.Tropos98)
    val OutlineSecondary
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos60, dark = AccorColorPrimitives.Tropos60)
    val AccentContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.ElectricBlue97, dark = AccorColorPrimitives.ElectricBlue10)
    val AccentContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.ElectricBlue85, dark = AccorColorPrimitives.ElectricBlue28)
    val OnAccentContainer
        @Composable
        get() = getColor(light = AccorColorPrimitives.ElectricBlue10, dark = AccorColorPrimitives.ElectricBlue97)
    val Accent
        @Composable
        get() = getColor(light = AccorColorPrimitives.ElectricBlue39, dark = AccorColorPrimitives.ElectricBlue70)
    val OnAccent
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.ElectricBlue10)
    val OutlineAccent
        @Composable
        get() = getColor(light = AccorColorPrimitives.ElectricBlue39, dark = AccorColorPrimitives.ElectricBlue70)
    val Surface
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.NavalGrey2)
    val SurfaceContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.NavalGrey8)
    val SurfaceContainerMid
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey98, dark = AccorColorPrimitives.NavalGrey14)
    val SurfaceContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey94, dark = AccorColorPrimitives.NavalGrey20)
    val OnSurfaceLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.NavalGrey40, dark = AccorColorPrimitives.Grey68)
    val OnSurfaceMid
        @Composable
        get() = getColor(light = AccorColorPrimitives.NavalGrey24, dark = AccorColorPrimitives.Grey80)
    val OnSurfaceHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.NavalGrey14, dark = AccorColorPrimitives.Grey98)
    val OutlineLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey87, dark = AccorColorPrimitives.NavalGrey40)
    val OutlineMid
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey72, dark = AccorColorPrimitives.NavalGrey60)
    val OutlineHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey58, dark = AccorColorPrimitives.NavalGrey96)
    val NeutralContainer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey47, dark = AccorColorPrimitives.Grey87)
    val OnNeutralContainer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.NavalGrey14)
    val DangerContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Strawberry95, dark = AccorColorPrimitives.Strawberry10)
    val DangerContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Strawberry80, dark = AccorColorPrimitives.Strawberry28)
    val OnDangerContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Strawberry40, dark = AccorColorPrimitives.Strawberry80)
    val OnDangerContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Strawberry33, dark = AccorColorPrimitives.Strawberry80)
    val Danger
        @Composable
        get() = getColor(light = AccorColorPrimitives.Strawberry40, dark = AccorColorPrimitives.Strawberry40)
    val OnDanger
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.Strawberry95)
    val OutlineDanger
        @Composable
        get() = getColor(light = AccorColorPrimitives.Strawberry40, dark = AccorColorPrimitives.Strawberry80)
    val WarningContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Yellow97, dark = AccorColorPrimitives.Yellow10)
    val WarningContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Yellow90, dark = AccorColorPrimitives.Yellow20)
    val OnWarningContainer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Yellow30, dark = AccorColorPrimitives.Yellow85)
    val Warning
        @Composable
        get() = getColor(light = AccorColorPrimitives.Yellow85, dark = AccorColorPrimitives.Yellow85)
    val OnWarning
        @Composable
        get() = getColor(light = AccorColorPrimitives.NavalGrey2, dark = AccorColorPrimitives.NavalGrey2)
    val OutlineWarning
        @Composable
        get() = getColor(light = AccorColorPrimitives.Yellow85, dark = AccorColorPrimitives.Yellow85)
    val SuccessContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.PeacockGreen96, dark = AccorColorPrimitives.PeacockGreen10)
    val SuccessContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.PeacockGreen75, dark = AccorColorPrimitives.PeacockGreen25)
    val OnSuccessContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.PeacockGreen39, dark = AccorColorPrimitives.PeacockGreen96)
    val OnSuccessContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.PeacockGreen30, dark = AccorColorPrimitives.PeacockGreen96)
    val Success
        @Composable
        get() = getColor(light = AccorColorPrimitives.PeacockGreen39, dark = AccorColorPrimitives.PeacockGreen39)
    val OnSuccess
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.Grey100)
    val OutlineSuccess
        @Composable
        get() = getColor(light = AccorColorPrimitives.PeacockGreen39, dark = AccorColorPrimitives.PeacockGreen75)
    val OfferContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia96, dark = AccorColorPrimitives.Fuchsia10)
    val OfferContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia89, dark = AccorColorPrimitives.Fuchsia20)
    val OnOfferContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia40, dark = AccorColorPrimitives.Grey100)
    val OnOfferContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia28, dark = AccorColorPrimitives.Grey100)
    val Offer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia40, dark = AccorColorPrimitives.Fuchsia76)
    val OnOffer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.Fuchsia10)
    val OutlineOffer
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia40, dark = AccorColorPrimitives.Fuchsia40)
    val EcoContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.LimeGreen95, dark = AccorColorPrimitives.LimeGreen15)
    val EcoContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.LimeGreen75, dark = AccorColorPrimitives.LimeGreen28)
    val OnEcoContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.LimeGreen45, dark = AccorColorPrimitives.LimeGreen95)
    val OnEcoContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.LimeGreen28, dark = AccorColorPrimitives.LimeGreen95)
    val Eco
        @Composable
        get() = getColor(light = AccorColorPrimitives.LimeGreen45, dark = AccorColorPrimitives.LimeGreen45)
    val OnEco
        @Composable
        get() = getColor(light = AccorColorPrimitives.Grey100, dark = AccorColorPrimitives.Grey100)
    val OutlineEco
        @Composable
        get() = getColor(light = AccorColorPrimitives.LimeGreen45, dark = AccorColorPrimitives.LimeGreen45)
    val FamilyContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos98, dark = AccorColorPrimitives.Stratos2)
    val FamilyContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos94, dark = AccorColorPrimitives.Stratos13)
    val OnFamilyContainerLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos13, dark = AccorColorPrimitives.Stratos2)
    val OnFamilyContainerHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos13, dark = AccorColorPrimitives.Stratos2)
    val Family
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos2, dark = AccorColorPrimitives.Stratos96)
    val OnFamily
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos98, dark = AccorColorPrimitives.Stratos2)
    val OutlineFamily
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos2, dark = AccorColorPrimitives.Stratos96)
    val Link
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos36, dark = AccorColorPrimitives.Tropos74)
    val Watermark
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey5, dark = AccorColorPrimitives.AlphaNavalGrey5)
    val OverlayLow
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey30, dark = AccorColorPrimitives.AlphaNavalGrey30)
    val OverlayMid
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey54, dark = AccorColorPrimitives.AlphaNavalGrey54)
    val OverlayHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey70, dark = AccorColorPrimitives.AlphaNavalGrey70)
    val OverlayMax
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey90, dark = AccorColorPrimitives.AlphaNavalGrey90)
    val ShadowDefault
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey5, dark = AccorColorPrimitives.AlphaNavalGrey5)
    val ShadowStrong
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey20, dark = AccorColorPrimitives.AlphaNavalGrey20)
    val GradientPrimaryHighStart
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos2, dark = AccorColorPrimitives.Grey100)
    val GradientPrimaryHighEnd
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos36, dark = AccorColorPrimitives.Stratos90)
    val GradientPrimaryLowStart
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia89, dark = AccorColorPrimitives.Fuchsia89)
    val GradientPrimaryLowEnd
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue86, dark = AccorColorPrimitives.RoyalBlue86)
    val GradientSecondaryStart
        @Composable
        get() = getColor(light = AccorColorPrimitives.Fuchsia96, dark = AccorColorPrimitives.Fuchsia96)
    val GradientSecondaryEnd
        @Composable
        get() = getColor(light = AccorColorPrimitives.RoyalBlue92, dark = AccorColorPrimitives.RoyalBlue92)
    val GradientWhiteMin
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaWhite0, dark = AccorColorPrimitives.AlphaWhite0)
    val GradientWhiteMax
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaWhite100, dark = AccorColorPrimitives.AlphaWhite100)
    val GradientBlackMin
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey0, dark = AccorColorPrimitives.AlphaNavalGrey0)
    val GradientBlackMid
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey54, dark = AccorColorPrimitives.AlphaNavalGrey54)
    val GradientBlackHigh
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey90, dark = AccorColorPrimitives.AlphaNavalGrey90)
    val GradientBlackMax
        @Composable
        get() = getColor(light = AccorColorPrimitives.AlphaNavalGrey100, dark = AccorColorPrimitives.AlphaNavalGrey100)
    val Focus
        @Composable
        get() = getColor(light = AccorColorPrimitives.Tropos49, dark = AccorColorPrimitives.Tropos49)
    val AllPrimary
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos2, dark = AccorColorPrimitives.Tropos94)
    val Classic
        @Composable
        get() = getColor(light = AccorColorPrimitives.Stratos2, dark = AccorColorPrimitives.Stratos2)
    val Silver
        @Composable
        get() = getColor(light = AccorColorPrimitives.Silver50, dark = AccorColorPrimitives.Silver50)
    val Gold
        @Composable
        get() = getColor(light = AccorColorPrimitives.Gold61, dark = AccorColorPrimitives.Gold61)
    val Platinum
        @Composable
        get() = getColor(light = AccorColorPrimitives.Platinum27, dark = AccorColorPrimitives.Platinum27)
    val Diamond
        @Composable
        get() = getColor(light = AccorColorPrimitives.Diamond76, dark = AccorColorPrimitives.Diamond76)
    val Limitless
        @Composable
        get() = getColor(light = AccorColorPrimitives.Limitless0, dark = AccorColorPrimitives.Limitless0)
}
